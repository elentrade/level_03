package com.company;

import java.awt.*;
import java.util.ArrayList;

public class GenericClass <T>{
    //метод, принимающий на вход массив с любым типом данных, меняющий местами любые два элемента массива
    public <T> void changeUnits (T []arr, int index1, int index2){
        System.out.println();
        System.out.print("Array income");
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        if(index1>=arr.length || index1<0 ) {
            throw new ArrayIndexOutOfBoundsException(index1);
        }
        if(index2>=arr.length || index2<0 ) {
            throw new ArrayIndexOutOfBoundsException(index2);
        }
        T unit1 = arr[index1];
        T unit2 = arr[index2];
        arr[index1]=unit2;
        arr[index2]=unit1;
        System.out.print("\n"+"Array outcome");
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //метод, принимающий на вход массив и преобразующие его в ArrayList
    public <T>ArrayList transformArrayToList (T []arr){
        ArrayList<T> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}