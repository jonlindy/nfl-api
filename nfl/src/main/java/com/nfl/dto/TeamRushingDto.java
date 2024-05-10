package com.nfl.dto;

public class TeamRushingDto {

    private int id;
    private int teamId;
    private int att;
    private int yards;
    private float ypc;
    private int td;
    private int twentyPlus;
    private int fortyPlus;
    private int longRush;
    private int firsts;
    private float firstPct;
    private int fum;
    private int year;

    public TeamRushingDto(int id, int teamId, int att, int yards, float ypc, int td, int twentyPlus, int fortyPlus, int longRush, int firsts, float firstPct, int fum, int year) {
        this.id = id;
        this.teamId = teamId;
        this.att = att;
        this.yards = yards;
        this.ypc = ypc;
        this.td = td;
        this.twentyPlus = twentyPlus;
        this.fortyPlus = fortyPlus;
        this.longRush = longRush;
        this.firsts = firsts;
        this.firstPct = firstPct;
        this.fum = fum;
        this.year = year;
    }

    public TeamRushingDto() {    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public float getYpc() {
        return ypc;
    }

    public void setYpc(float ypc) {
        this.ypc = ypc;
    }

    public int getTd() {
        return td;
    }

    public void setTd(int td) {
        this.td = td;
    }

    public int getTwentyPlus() {
        return twentyPlus;
    }

    public void setTwentyPlus(int twentyPlus) {
        this.twentyPlus = twentyPlus;
    }

    public int getFortyPlus() {
        return fortyPlus;
    }

    public void setFortyPlus(int fortyPlus) {
        this.fortyPlus = fortyPlus;
    }

    public int getLongRush() {
        return longRush;
    }

    public void setLongRush(int longRush) {
        this.longRush = longRush;
    }

    public int getFirsts() {
        return firsts;
    }

    public void setFirsts(int firsts) {
        this.firsts = firsts;
    }

    public float getFirstPct() {
        return firstPct;
    }

    public void setFirstPct(float firstPct) {
        this.firstPct = firstPct;
    }

    public int getFum() {
        return fum;
    }

    public void setFum(int fum) {
        this.fum = fum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
