package com.leet.leet_sample.utils.database.entities.menu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YasuhiraChiba on 2017/11/01.
 */

public class MenuNutritionsEntity {

    private String cholesterol;
    private String dietaryFiber;
    private String protein;
    private String satFat;
    private String sodium;
    private String sugars;
    private String carb;
    private String totalFat;
    private String calories;
    private String servingSize;
    private ArrayList<ArrayList<String>> allergens = new ArrayList<>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public MenuNutritionsEntity(){

    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(String dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getSatFat() {
        return satFat;
    }

    public void setSatFat(String satFat) {
        this.satFat = satFat;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getCarb() {
        return carb;
    }

    public void setCarb(String carb) {
        this.carb = carb;
    }

    public String getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(String totalFat) {
        this.totalFat = totalFat;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public ArrayList<String> getAllergens() {
        return this.allergens.get(0);
    }

    public void setAllergens(ArrayList<String> name) {
        this.allergens.add(name);
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

