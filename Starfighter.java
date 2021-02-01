package com.company;

import java.util.LinkedList;


public class Starfighter extends AbstractVehicles implements LightSide {

    private LinkedList<String> air = new LinkedList<String>();

    public Starfighter(){
        air.add("T-47 AirSpeeder; Age of the Rebellion");
        air.add("Millenium Falcon; Age of the Rebellion and Resistance");
        air.add("Cloud Car; Age of the Rebellion and Resistance");
        air.add("V-Wing; Age of the Republic");
        air.add("RZ-2 A-Wing; Age of the Resistance");
        sort(air);
        System.out.println(air);
        String h = heroBinarySearch(air, 0, air.size() - 1, "Millenium Falcon; Age of the Rebellion and Resistance");
        System.out.println("");
        System.out.println("Looking for the hero ship...");
        System.out.println("...");
        System.out.println(h);

    }
    public Starfighter(String name, String era){
        air.add(name);
        System.out.println(air);
    }

    @Override
    public boolean lightSide(String lightAnswer){
        if(lightAnswer == "y") {
            System.out.println("This vehicle served well for its era.");
            return true;

        } else if(lightAnswer == "n"){
            System.out.println("This vehicle belongs to the dark side.");
            return false;
        } else {
            System.out.println("Invalid answer.");
        }
        return true;

    }
    public boolean isHero(String isHeroAnswer){
        if(isHeroAnswer == "y"){
            System.out.println("We have found the hero vehicle.");
            return true;
        } else if(isHeroAnswer == "n") {
            System.out.println("This is not a hero vehicle");
            return false;

        } else {
            System.out.println("Invalid answer");
        }
        return false;

    }
    public String heroBinarySearch(LinkedList<String> list, int start, int end, String hero){
        if(end >= start){
            int mid = start + (end - start) / 2;
            if(list.get(mid).equals(hero)){
                return hero;
            }
            if(list.get(mid).compareTo(hero) < 0){
                return heroBinarySearch(list, mid + 1, end, hero);
            } else {
                return heroBinarySearch(list, start, mid - 1, hero);
            }
        }
        return "Not Found";

    }

    public static void sort(LinkedList<String> list){
        for (int i = 0; i < list.size()-1; i++)  {
            int index = i;
            String a = list.get(index);

            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).compareTo(list.get(index)) < 0){
                    index = j;
                }
            } if(!list.get(index).equals(list.get(i))){
                String min = a;
                list.set(i, list.get(index));
                list.set(index, min);
            }
        }
    }




}
