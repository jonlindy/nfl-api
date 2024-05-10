package com.nfl.dto;

public class TeamPassingDto {

    private int id;
    private int teamId;
    private int att;
    private int cmp;
    private float cmpPct;
    private float yardsAtt;
    private int yards;
    private int td;
    private int interceptions;
    private float rate;
    private int firsts;
    private float firstPct;
    private int twentyPlus;
    private int fortyPlus;
    private int longYard;
    private int sack;
    private int sackYards;
    private int year;

    public TeamPassingDto() {
    }

    public TeamPassingDto(int id, int teamId, int att, int cmp, float cmpPct, float yardsAtt, int yards, int td, int interceptions, float rate, int firsts, float firstPct, int twentyPlus, int fortyPlus, int longYard, int sack, int sackYards, int year) {
        this.id = id;
        this.teamId = teamId;
        this.att = att;
        this.cmp = cmp;
        this.cmpPct = cmpPct;
        this.yardsAtt = yardsAtt;
        this.yards = yards;
        this.td = td;
        this.interceptions = interceptions;
        this.rate = rate;
        this.firsts = firsts;
        this.firstPct = firstPct;
        this.twentyPlus = twentyPlus;
        this.fortyPlus = fortyPlus;
        this.longYard = longYard;
        this.sack = sack;
        this.sackYards = sackYards;
        this.year = year;
    }

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

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public float getCmpPct() {
        return cmpPct;
    }

    public void setCmpPct(float cmpPct) {
        this.cmpPct = cmpPct;
    }

    public float getYardsAtt() {
        return yardsAtt;
    }

    public void setYardsAtt(float yardsAtt) {
        this.yardsAtt = yardsAtt;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public int getTd() {
        return td;
    }

    public void setTd(int td) {
        this.td = td;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
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

    public int getLongYard() {
        return longYard;
    }

    public void setLongYard(int longYard) {
        this.longYard = longYard;
    }

    public int getSack() {
        return sack;
    }

    public void setSack(int sack) {
        this.sack = sack;
    }

    public int getSackYards() {
        return sackYards;
    }

    public void setSackYards(int sackYards) {
        this.sackYards = sackYards;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
