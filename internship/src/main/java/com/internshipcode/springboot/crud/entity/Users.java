package com.internshipcode.springboot.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Users {

    //define fields

    @Id

    @Column(name="user_id")
    private int id;

    @Column(name="user_name")
    private String firstName;

    @Column(name="user_surname")
    private String lastName;



    //define constructor

    public Users(){}

    public Users(int id,String firstName, String lastName) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;

    }


    //define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    //define toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
