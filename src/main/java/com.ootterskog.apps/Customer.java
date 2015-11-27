package com.ootterskog.apps;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends AbstractEntity {

    @Id
    private String id;

    private String firstname, lastname, email;
}
