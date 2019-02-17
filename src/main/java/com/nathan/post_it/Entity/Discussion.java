package com.nathan.post_it.Entity;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Discussion extends PostBase {
    private String title;
    //private ArrayList<String> tags;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }*/
}
