package com.company;

public class Main <T> {

    int [] int_arr =  {1,2,3,4,5,6};
    char[] char_arr = {'a','b','c','d','f','e'};
 //метод, меняющий местами два элемента с указанными индексами в передаваемом массиве
 public T[] changeUnits (T[]my_arr, int index1, int index2){
T unit1 = my_arr[index1];
T unit2 = my_arr[index2];
my_arr[index1]=unit2;
my_arr[index2]=unit1;
return my_arr;
 }


    public  void main(String[] args) {

        changeUnits(int_arr,0,5);
        System.out.println(int_arr.toString());
    }
}
