package com.keevosh.aksosrooms.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Orestis
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "user_type")
@Table(name = "users")
public class User extends PersistentObject {

    private String password;
    private String name;
    private String surname;
    private String email;
    private Date birthDay;
    private Date dateActivated;
    private Date dateCreated;

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    @Column(name = "birthday")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getBirthDay() {
        return birthDay;
    }

    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    @Column(name = "date_activated")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateActivated() {
        return dateActivated;
    }

    @Column(name = "date_created", nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateActivated(Date dateActivated) {
        this.dateActivated = dateActivated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
