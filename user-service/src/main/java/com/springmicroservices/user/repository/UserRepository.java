package com.springmicroservices.user.repository;

import com.springmicroservices.user.entity.MUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MUser,Long> {

    MUser findByUserId(Long userId);
}
