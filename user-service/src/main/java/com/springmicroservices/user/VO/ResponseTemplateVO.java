package com.springmicroservices.user.VO;

import com.springmicroservices.user.entity.MUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private MUser MUser;
    private Department department;

}
