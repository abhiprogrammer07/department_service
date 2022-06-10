package com.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
