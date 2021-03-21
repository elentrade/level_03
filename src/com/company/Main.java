package com.company;

public class Main {
    public static String [] str_arr = new String[] {"qaz","wsx","edc","rfv","tgb","yhn"};
    public static Integer [] int_arr = new Integer[]{1,2,3,4,5,6};
    public static Float [] fl_arr = new Float[] {0.0f,1.1f,2.2f,3.3f };
    public static void main(String[] args) {
////method takes String type
        GenericClass str = new GenericClass<String[]>();
        str.changeUnits(str_arr, 0, 5);
////method takes Integer type
        GenericClass in = new GenericClass<Integer[]>();
        str.changeUnits(int_arr, 0, 5);
////method takes Float type
        GenericClass fl = new GenericClass<Float[]>();
        fl.transformArrayToList(fl_arr);
        for (int i = 0; i < in.transformArrayToList(fl_arr).size(); i++) {
            System.out.print(in.transformArrayToList(fl_arr).get(i)+" ");
        }
    }
}
