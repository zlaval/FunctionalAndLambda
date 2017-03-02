package com.zlrx.builtin.pojo;

public class FullName {

    private String surname;

    private String forename;

    public FullName(String surname, String forename) {
        this.surname = surname;
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
}
