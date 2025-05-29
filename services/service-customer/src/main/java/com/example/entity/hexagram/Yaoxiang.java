package com.example.entity.hexagram;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Yaoxiang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long yaoxiangId;

    private Long hexagramId;

    private Long hexagramYaoxiangId;

    private int index;

    private String remark;

    private String state;
}
