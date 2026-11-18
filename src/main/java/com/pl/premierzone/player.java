package com.pl.premierzone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prem_stats")
public class player {

    @Id
    // The PostgreSQL table was created with quoted, uppercase column names.
    // The quotes are required so Hibernate does not convert them to lowercase.
    @Column(name = "\"Player\"", unique = true)
    private String name;

    @Column(name = "\"Nation\"")
    private String Nation;
    @Column(name = "\"Pos\"")
    private String Pos;
    @Column(name = "\"Age\"")
    private Integer Age;
    @Column(name = "\"Mp\"")
    private Integer Mp;
    @Column(name = "\"Starts\"")
    private Integer Starts;
    @Column(name = "\"Min\"")
    private double Min;
    @Column(name = "\"Gls\"")
    private double Gls;
    @Column(name = "\"Ast\"")
    private double Ast;
    @Column(name = "\"Pk\"")
    private double Pk;
    @Column(name = "\"Crd_y\"")
    private double Crd_y;
    @Column(name = "\"Crd_r\"")
    private double Crd_r;
    @Column(name = "\"Xg\"")
    private double Xg;
    @Column(name = "\"Xag\"")
    private double Xag;
    @Column(name = "\"Team\"")
    private String Team;

    public player() {}

    public player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, double min, double gls, double ast, double pk, double crd_y, double crd_r, double xg, double xag, String team) {
        this.name = name;
        Nation = nation;
        Pos = pos;
        Age = age;
        Mp = mp;
        Starts = starts;
        Min = min;
        Gls = gls;
        Ast = ast;
        Pk = pk;
        Crd_y = crd_y;
        Crd_r = crd_r;
        Xg = xg;
        Xag = xag;
        Team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public String getPos() {
        return Pos;
    }

    public void setPos(String pos) {
        Pos = pos;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getMp() {
        return Mp;
    }

    public void setMp(Integer mp) {
        Mp = mp;
    }

    public Integer getStarts() {
        return Starts;
    }

    public void setStarts(Integer starts) {
        Starts = starts;
    }

    public double getMin() {
        return Min;
    }

    public void setMin(double min) {
        Min = min;
    }

    public double getGls() {
        return Gls;
    }

    public void setGls(double gls) {
        Gls = gls;
    }

    public double getAst() {
        return Ast;
    }

    public void setAst(double ast) {
        Ast = ast;
    }

    public double getPk() {
        return Pk;
    }

    public void setPk(double pk) {
        Pk = pk;
    }

    public double getCrd_y() {
        return Crd_y;
    }

    public void setCrd_y(double crd_y) {
        Crd_y = crd_y;
    }

    public double getCrd_r() {
        return Crd_r;
    }

    public void setCrd_r(double crd_r) {
        Crd_r = crd_r;
    }

    public double getXg() {
        return Xg;
    }

    public void setXg(double xg) {
        Xg = xg;
    }

    public double getXag() {
        return Xag;
    }

    public void setXag(double xag) {
        Xag = xag;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }
}
