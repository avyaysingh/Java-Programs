package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strArrayList = new ArrayList<String>();
//        strArrayList.add("Shubham singh");
//
////        ArrayList<int> intArrayList = new ArrayList<int>();
//
//        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
//        intClassArrayList.add(new IntClass(300));
//
//        Integer integer = new Integer(100);
//        Double doubleValue = new Double(18.66);
//
//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//
//        for (int i=0; i<10; i++){
//            integerArrayList.add(Integer.valueOf(i));  //here this is autoboxing
//        }
//
//        for (int i=0; i<10; i++){
//            System.out.println(i  + " --> " + integerArrayList.get(i).intValue());
//        }
//
//        Integer myIntValue = 56;           //  Integer.valueOf(55);


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }







    }
}
