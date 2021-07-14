package com.developer.api.dao.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Developer {
    @Id
    private long id;
    private String name;
    private String email;
}
