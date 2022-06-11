package hu.progmatic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Matches {
    private int year;
    private String stage;
    private String date;
    private String teamA;
    private String teamB;
    private int goalsA;
    private int goalsB;
    private int penA;
    private int penB;

    public Matches() {
    }

    public Matches(String csvLine) {
        String[] data = csvLine.split(";");
        if (data.length >7) {
            this.year = Integer.parseInt(data[0]);
            this.stage = data[1];
            this.date = data[2];
            this.teamA = data[3];
            this.teamB = data[4];
            this.goalsA = Integer.parseInt(data[5]);
            this.goalsB = Integer.parseInt(data[6]);
            this.penA = Integer.parseInt(data[7]);
            this.penB = Integer.parseInt(data[8]);
        }
        else {
            this.year = Integer.parseInt(data[0]);
            this.stage = data[1];
            this.date = data[2];
            this.teamA = data[3];
            this.teamB = data[4];
            this.goalsA = Integer.parseInt(data[5]);
            this.goalsB = Integer.parseInt(data[6]);
            this.penA = 0;
            this.penB = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getGoalsA() {
        return goalsA;
    }

    public void setGoalsA(int goalsA) {
        this.goalsA = goalsA;
    }

    public int getGoalsB() {
        return goalsB;
    }

    public void setGoalsB(int goalsB) {
        this.goalsB = goalsB;
    }

    public int getPenA() {
        return penA;
    }

    public void setPenA(int penA) {
        this.penA = penA;
    }

    public int getPenB() {
        return penB;
    }

    public void setPenB(int penB) {
        this.penB = penB;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "year=" + year +
                ", stage='" + stage + '\'' +
                ", date='" + date + '\'' +
                ", teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", goalsA=" + goalsA +
                ", goalsB=" + goalsB +
                ", penA=" + penA +
                ", penB=" + penB +
                '}';
    }
}
