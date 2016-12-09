package org.example.spring.model;

import javax.persistence.*;

/**
 * Created by PBIM05851 on 08/12/2016.
 */
@Entity
@Table(name="PERSON")
public class Person {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "id="+id+", name="+name+", country="+country;
    }
}
