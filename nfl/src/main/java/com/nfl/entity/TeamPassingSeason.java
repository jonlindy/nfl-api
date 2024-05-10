package com.nfl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "team_passing")
public class TeamPassingSeason {

    @Id
    private int id;
    @Column(name = "team_id")
    private int teamId;
    private int att;
    private int cmp;
    @Column(name = "cmp_pct")
    private float cmpPct;
    @Column(name = "yards_att")
    private float yardsAtt;
    private int yards;
    private int td;
    @Column(name = "int")
    private int interceptions;
    private float rate;
    private int firsts;
    @Column(name = "first_pct")
    private float firstPct;
    @Column(name = "twenty_plus")
    private int twentyPlus;
    @Column(name = "forty_plus")
    private int fortyPlus;
    @Column(name = "long")
    private int longYard;
    private int sack;
    @Column(name = "sack_yards")
    private int sackYards;
    private int year;

    public TeamPassingSeason() {
    }

    public TeamPassingSeason(int id, int teamId, int att, int cmp, float cmpPct, float yardsAtt, int yards, int td, int interceptions, float rate, int firsts, float firstPct, int twentyPlus, int fortyPlus, int longYard, int sack, int sackYards, int year) {
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

    public int getTeamId() {
        return teamId;
    }

    public int getAtt() {
        return att;
    }

    public int getCmp() {
        return cmp;
    }

    public float getCmpPct() {
        return cmpPct;
    }

    public float getYardsAtt() {
        return yardsAtt;
    }

    public int getYards() {
        return yards;
    }

    public int getTd() {
        return td;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public float getRate() {
        return rate;
    }

    public int getFirsts() {
        return firsts;
    }

    public float getFirstPct() {
        return firstPct;
    }

    public int getTwentyPlus() {
        return twentyPlus;
    }

    public int getFortyPlus() {
        return fortyPlus;
    }

    public int getLongYard() {
        return longYard;
    }

    public int getSack() {
        return sack;
    }

    public int getSackYards() {
        return sackYards;
    }

    public int getYear() {
        return year;
    }
}
