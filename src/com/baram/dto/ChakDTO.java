package com.baram.dto;

public class ChakDTO {

    String name;
    int value;
    int pPent;
    int pResis;
    int fatalPer;
    int personalDamagePer;
    int personalDefensePer;
    int type; //0 기본, 1 황단사용, 2 황단미사용,
    int beadNum; //1 -1500, 2 -1000 , 3, -500

    @Override
    public String toString() {
        return "ChakDTO{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", pPent=" + pPent +
                ", pResis=" + pResis +
                ", fatalPer=" + fatalPer +
                ", personalDamagePer=" + personalDamagePer +
                ", personalDefensePer=" + personalDefensePer +
                ", type=" + type +
                ", beadNum=" + beadNum +
                '}';
    }

    public int getBeadNum() {
        return beadNum;
    }

    public void setBeadNum(int beadNum) {
        this.beadNum = beadNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getpPent() {
        return pPent;
    }

    public void setpPent(int pPent) {
        this.pPent = pPent;
    }

    public int getpResis() {
        return pResis;
    }

    public void setpResis(int pResis) {
        this.pResis = pResis;
    }

    public int getFatalPer() {
        return fatalPer;
    }

    public void setFatalPer(int fatalPer) {
        this.fatalPer = fatalPer;
    }

    public int getPersonalDamagePer() {
        return personalDamagePer;
    }

    public void setPersonalDamagePer(int personalDamagePer) {
        this.personalDamagePer = personalDamagePer;
    }

    public int getPersonalDefensePer() {
        return personalDefensePer;
    }

    public void setPersonalDefensePer(int personalDefensePer) {
        this.personalDefensePer = personalDefensePer;
    }
}
