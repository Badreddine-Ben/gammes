package com.simalga.gammes.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * The User Entity class
 *
 * @author BENBAZIZ Badereddine
 * @version 1.0
 * Date 25/08/.
 */
@Entity
@Table(name = "user", schema = "6659606_gammedb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Transient
    @Column(name = "password_2")
    private String password_2;

    @Column(name = "email")
    private String email;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "_function")
    private String function;

    @Column(name = "domaine")
    private String domaine;

    @Column(name = "role")
    private int role;

    public User() {
    }

    public User(String username, String password, String email, int role) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setRole(role);

    }

    public User(String username, String password, String email, String fullname, String function, String domaine, int role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.function = function;
        this.domaine = domaine;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_2() {
        return password_2;
    }

    public void setPassword_2(String password_2) {
        this.password_2 = password_2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                role == user.role &&
                Objects.equals(username, user.username) &&
                Objects.equals(fullname, user.fullname) &&
                Objects.equals(function, user.function) &&
                Objects.equals(password, user.password) &&
                Objects.equals(password_2, user.password_2) &&
                Objects.equals(email, user.email);
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, username, fullname, function, password, password_2, email, role);
    }
}
