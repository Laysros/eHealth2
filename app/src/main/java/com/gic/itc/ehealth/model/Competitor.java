package com.gic.itc.ehealth.model;

/**
 * Created by LAY Leangsros on 18/02/2016.
 */
public class Competitor {
    private String logo;
    private String name;
    private int score;

    public Competitor(String logo, String name, int score) {
        this.logo = logo;
        this.name = name;
        this.score = score;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
