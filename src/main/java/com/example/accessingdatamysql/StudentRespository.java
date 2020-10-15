package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface StudentRespository extends CrudRepository<StudentInfo, Integer> {
}
