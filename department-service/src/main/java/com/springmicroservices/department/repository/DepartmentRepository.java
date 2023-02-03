package com.springmicroservices.department.repository;

import com.springmicroservices.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

//    Department findDepartmentById(Long departmentId);

    Department findByDepartmentId(Long departmentId);
}
