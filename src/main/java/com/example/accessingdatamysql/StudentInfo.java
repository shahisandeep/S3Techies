package com.example.accessingdatamysql;

import lombok.Data;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
@Data
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int rollNumber;
    private String name;
}
