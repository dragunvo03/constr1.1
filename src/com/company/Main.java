package com.company;
//імпорт бібліотеки java.util.ArrayList
import java.util.ArrayList;
/*
Основна точка входу в програму
*/
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




