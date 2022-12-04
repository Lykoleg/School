package com.school.model;

public class Model {
    private int ID;
    private String name;

    public Model(String name, int ID) {
        this.ID = ID;
        this.name = name;

    }


    public int getID() {
        return this.ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model name" + name+ " "+ ID;
    }

}
