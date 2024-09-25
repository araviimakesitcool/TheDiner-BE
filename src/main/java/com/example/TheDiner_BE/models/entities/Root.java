package com.example.TheDiner_BE.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class Root {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "createdOn")
    protected LocalDateTime createdOn;

    @Column(name = "updatedOn")
    protected LocalDateTime updatedOn;

    protected Integer version;
}
