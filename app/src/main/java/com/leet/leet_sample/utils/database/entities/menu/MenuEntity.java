package com.leet.leet_sample.utils.database.entities.menu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YasuhiraChiba on 2017/10/31.
 */

public class MenuEntity {

    private String name = "";
    private MenuNutritionsEntity nutritions;
    private String price;
    private MenuTagsEntity tags;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public MenuNutritionsEntity getNutritions() {
        return nutritions;
    }
    public void setNutritions(MenuNutritionsEntity nutritions) {
        this.nutritions = nutritions;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public MenuTagsEntity getTags() {
        return tags;
    }
    public void setTags(MenuTagsEntity tags) {
        this.tags = tags;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}