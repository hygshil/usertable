package com.hp.bean;

public class User {
    private int id;
    private String bid;
    private String name;
    private int number;
    private String level;
    private String domainname;
    private String domaintype;

    public void setId(int id) {
        this.id = id;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public void setDomaintype(String domaintype) {
        this.domaintype = domaintype;
    }

    public int getId() {
        return id;
    }

    public String getBid() {
        return bid;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getLevel() {
        return level;
    }

    public String getDomainname() {
        return domainname;
    }

    public String getDomaintype() {
        return domaintype;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", bid=" + bid +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", level='" + level + '\'' +
                ", domainname='" + domainname + '\'' +
                ", domaintype='" + domaintype + '\'' +
                '}';
    }
}
