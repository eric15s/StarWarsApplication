package com.company;

import java.util.LinkedList;


public abstract class AbstractVehicles {
    protected String name;
    protected String era;
    protected LinkedList<String> vehicle = new LinkedList<String>();

    public abstract boolean isHero(String s);

    public AbstractVehicles(){
        System.out.println("");
    }

    public AbstractVehicles(String name, String era){
        setName(name);
        getName();
        setEra(era);
        getEra();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEra(String era){
        this.era = era;
    }
    public String getEra(){
        return this.era;
    }



}
