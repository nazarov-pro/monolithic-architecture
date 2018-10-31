package org.nazarovpro.monolithic.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(unique = true, nullable = false, name = "PHONE")
    private String phone;

}
