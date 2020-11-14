package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Auto> arr = new ArrayList();
        arr.add(new Car("ВАЗ"));
        arr.add(new Track("ГАЗель"));
        arr.add(new Car("Mercedes"));
        arr.add(new Track("КамАЗ"));
        Visitor visitor = (Visitor) new AutoVisitor();
        for(Auto a:arr){
            a.Accept(visitor);
        }
    }
}




