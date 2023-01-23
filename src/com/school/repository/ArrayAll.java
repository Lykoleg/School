package com.school.repository;

import com.school.model.Model;

public class ArrayAll<T extends Model> {


    int CAPACITY = 100;
    int size = 0;


    public T[] arrayAll;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {

            System.out.println(" Array is empty ");
            return true;
        }

        System.out.println("   Array is not empty  ");
        return false;
    }


    public void add(T element) {
        for (int i = 0; i < arrayAll.length; i++) {
            if (arrayAll[i] == null) {
                arrayAll[i] = element;
                size++;
                System.out.print(" Add element" + element);
                return;

            }
        }
        expandArrayAll();
        add(element);
    }
    public void  add(int index, T element) {
        arrayAll[index]=element;

        }
    public void  remove(int index) {
        arrayAll[index] = null;
        System.out.print(" Delete ArrayAll with index" + index);

    }

    public T[] getArrayAll() {
        return arrayAll;
    }

    private void expandArrayAll() {
      /*  int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        T[] tmpArray = new T[CAPACITY];
        System.arraycopy(arrayAll, 0, tmpArray, 0, tmpCapacity);
        arrayAll = tmpArray;*/

    }

    public void delete(int ID) {
        for (int i = 0; i < arrayAll.length; i++) {
            if (arrayAll[i].getID() == (ID)) {
                String name = arrayAll[i].getName();
                arrayAll[i] = null;
                size--;
                System.out.print(" Delete ArrayAll " + name + "  " + ID);
                break;
            }  //видалення за ID

        }

    }

    public T get(int index) {
        System.out.println("element with this index" + index + arrayAll[index]);
        return arrayAll[index];

        // пошук елемента массива за індексом

    }
    public T getById(int ID) {
        for (int i = 0; i < arrayAll.length; i++) {
            if (arrayAll[i].getID() == (ID)) {
                String name = arrayAll[i].getName();
                System.out.print(" GetByID arrayAll " + name + "  " + ID);
                return arrayAll[i];
            }  //виклик за ID

        }
        System.out.println("No model with this ID" + ID);
        return null;
    }
}




