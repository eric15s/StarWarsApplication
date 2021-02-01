package com.company;

import java.util.LinkedList;

public class Groundfighter extends AbstractVehicles implements LightSide{
    private LinkedList<String> ground = new LinkedList<String>();


    public Groundfighter(){
        ground.add("X-34 ; Age of the Rebellion; Speeder");
        ground.add("Swoop Bike; Age of the Rebellion; Speeder");
        System.out.println(ground);


    }
    public Groundfighter(String name, String era, String type){
        ground.add(name + "; " + era + "; " + type);
        ground.add("STAP; Age of the Republic; Speeder");
        sort(ground);
        heroBinarySearch(ground, 0, ground.size() - 1, "AT-ST; Age of the Rebellion; Walker");
        for(String i : ground){
            System.out.println(i);
        }

    }
    public static void sort(LinkedList<String> list){
        for (int i = 0; i < list.size()-1; i++)
        {
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
    public boolean isHero(String isHeroAnswer){
        if(isHeroAnswer == "y"){
            System.out.println("The new vehicle is a hero vehicle.");
            return true;
        } else if(isHeroAnswer == "n") {
            System.out.println("The new vehicle added is not a hero vehicle");
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
    @Override
    public boolean lightSide(String answer){
        if(answer == "y") {
            System.out.println("This vehicle belongs to the Light Side");
            return true;

        } else if(answer == "n"){
            System.out.println("This new vehicle belongs to the dark side");
            return false;
        } else {
            System.out.println("Invalid answer.");
        }
        return true;

    }






}
