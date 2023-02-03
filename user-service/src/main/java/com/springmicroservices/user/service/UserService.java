package com.springmicroservices.user.service;

import com.springmicroservices.user.VO.Department;
import com.springmicroservices.user.VO.ResponseTemplateVO;
import com.springmicroservices.user.entity.MUser;
import com.springmicroservices.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public MUser saveUser(MUser mUser) {
        log.info("Inside SaveUser method of UserService");
        return userRepository.save(mUser);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        MUser mUser = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/"+ mUser.getDepartmentId()
                        ,Department.class);
        vo.setDepartment(department);
        vo.setMUser(mUser);
        return vo;
    }
}
