package com.school.repository;

import com.school.model.Course;
import com.school.model.Model;

import java.lang.reflect.Array;

public class Repository {
    int CAPACITY = 10;

    private Model[] models = new Model[CAPACITY];
    public int getCAPACITY() {
        return CAPACITY;
    }


    public Model[] getAll() {

        return models;
    }


    public void add(Model model) {
        for (int i = 0; i < models.length; i++) {
            if (models[i] == null) {
                models[i] = model;
                System.out.print(" Add model" + model);
                return;

            }
        }
        expandArray();
        add(model);
    }



    private void expandArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Model[] tmpArray = new Model[CAPACITY];
        System.arraycopy(models, 0, tmpArray, 0, tmpCapacity);
        models = tmpArray;

    }

    public void delete(String name) {
        for (int i = 0; i < models.length; i++) {
            if (models[i].getName().equals(name)) {
                models[i] = null;
                System.out.print(" Delete Arrays model " + name);
                break;//видалення за ім'ям


            }
        }
    }

    public void delete(int ID) {
        for (int i = 0; i < models.length; i++) {
            if (models[i].getID() == (ID)) {
                String name = models[i].getName();
                models[i] = null;
                System.out.print(" Delete Arrays model " + name + "  " + ID);
                break;
            }  //видалення за ID

        }

    }

    public Model getbyid(int ID) {
        for (int i = 0; i < models.length; i++) {
            if (models[i].getID() == (ID)) {
                String name = models[i].getName();
                System.out.print(" GetByID model " + name + "  " + ID);
                return models[i];
            }  //виклик за ID

        }
        System.out.println("No model with this ID" + ID);
        return null;
    }
}