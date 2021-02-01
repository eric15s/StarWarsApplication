package com.company;
import java.util.LinkedList;
import java.util.List;

public class Vehicles extends AbstractVehicles implements LightSide{



    private String isHeroAnswer;
    private String lightAnswer;



    public Vehicles(){
        super();
        vehicle.add("U-Wing; Age of the Rebellion");
        vehicle.add("N-1 Starfighter; Age of the Republic ");
        sort(vehicle);
        String h = heroBinarySearch(vehicle, 0, vehicle.size() - 1, "Y-Wing; Age of the Rebellion and Resistance");
        System.out.println(vehicle);

    }

    public Vehicles(String name, String era){


        super(name, era);
        vehicle.add(name + "; " + era);
        vehicle.add("BTL-A4 Y-Wing; Age of the Rebellion");
        vehicle.add("Yoda's Actis-Class Light Interceptor");

        sort(vehicle);
        heroBinarySearch(vehicle, 0, vehicle.size() - 1, name);

        System.out.println(vehicle);
    }
    public boolean isHero(String isHeroAnswer){
        if(isHeroAnswer == "y"){
            System.out.println("There are hero vehicles present.");
            return true;
        } else if(isHeroAnswer == "n") {
            System.out.println("There are no hero vehicles present.");

            return false;

        } else {
            System.out.println("Invalid answer");
        }
        return false;

    }
    @Override
    public boolean lightSide(String lightAnswer){
        if(lightAnswer == "y") {
            System.out.println("This vehicle belongs to the Light Side");
            return true;

        } else if(lightAnswer == "n"){
            System.out.println("This Vehicle belongs to the dark side");
            return false;
        } else {
            System.out.println("Invalid answer.");
        }
        return true;

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
    public String getName(){
        return name;
    }
    @Override
    public String getEra(){
        return era;
    }



}






