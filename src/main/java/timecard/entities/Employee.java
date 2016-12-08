package timecard.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Employee entity
 *
 * Created by Shubnik on 29.11.2016.
 */
public class Employee {

    private long id;
    private String login;
    private String name;
    private String surname;
    private String patrname;
    private Date birthrate;

    @JsonIgnore
    private String password;

    public Employee(String login, String password, String name, String surname, String patrname, Date birthrate) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.patrname = patrname;
        this.birthrate = birthrate;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatrname() {
        return patrname;
    }

    public void setPatrname(String patrname) {
        this.patrname = patrname;
    }

    public Date getBirthrate() {
        return birthrate;
    }

    public void setBirthrate(Date birthrate) {
        this.birthrate = birthrate;
    }

}
