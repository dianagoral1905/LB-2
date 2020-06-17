package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>(10);
        System.out.println("Введите 10 строк: ");

        for(int i = 0; i < 10; i++){
            arrayList.add(reader.readLine());
        }

        String last = "";
        for(int i = 0; i < 15; i++){
            last = arrayList.get(9);
            for(int j = 9; j > 0; j--){
                arrayList.set(j, arrayList.get(j-1));
            }
            arrayList.set(0, last);
        }
        System.out.println("Введите 5 новых строк: ");
        for(int i = 5; i < 10; i++){
            arrayList.set(i, reader.readLine());
        }

        for (String a : arrayList) {
            System.out.print(a + " ");
        }


        ArrayList <Integer> arraylist = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start1=System.nanoTime();
        for(int i=0; i<100000; i++){
            arraylist.add(0,i);
        }
        long stop1=System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало" +"ArrayList="+(stop1-start1)/1e9+"s");
        long start2=System.nanoTime();
        for(int i=0; i<100000; i++){
            arraylist.add(0,i);
        }
        long stop2=System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало" +"LinkedList="+(stop2-start2)/1e9+"s");
        long start3=System.nanoTime();
        for(int i=0; i<100000; i++){
            arraylist.get(i);
        }
        long stop3=System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого элемента" +"ArrayList="+(stop3-start3)/1e9+"s");
        long start4=System.nanoTime();
        for(int i=0; i<100000; i++){
            linkedList.get(i);
        }
        long stop4=System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого элемента" +"LinkedList="+(stop4-start4)/1e9+"s");
        long start5=System.nanoTime();
        for(int i=0; i<100000; i++){
            arraylist.set(i,i*2);
        }
        long stop5=System.nanoTime();
        System.out.println("Время выполнения операций записи каждого элемента" +"ArrayList="+(stop5-start5)/1e9+"s");
        long start6=System.nanoTime();
        for(int i=0; i<100000; i++){
            linkedList.set(i,i*2);
        }
        long stop6=System.nanoTime();
        System.out.println("Время выполнения операций записи каждого элемента" +"LinkedList="+(stop6-start6)/1e9+"s");
        long start7=System.nanoTime();
        for(int i=0; i<100000; i++){
            arraylist.remove(0);
        }
        long stop7=System.nanoTime();
        System.out.println("Время выполнения операций удаления каждого элемента" +"ArrayList="+(stop7-start7)/1e9+"s");
        long start8=System.nanoTime();
        for(int i=0; i<100000; i++){
            linkedList.remove(0);
        }
        long stop8=System.nanoTime();
        System.out.println("Время выполнения операций удаления каждого элемента" +"LinkedList="+(stop8-start8)/1e9+"s");

        //задание 3
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> arrayList3 = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            arrayList1.add(0, i);
            arrayList2.add(0, i);
            arrayList3.add(0, i + 1);
        }

        if(arrayList1.equals(arrayList2)){
            System.out.println("'List1' == 'List2'");
        }
        else{
            System.out.println("'List1' != 'List2'");
        }
        if(arrayList1.equals(arrayList3)){
            System.out.println("'List1' == 'List3'");
        }
        else{
            System.out.println("'List1' != 'List3'");
        }

        List<User> user = new ArrayList<>();

        user.add(new User("Bog", "Bogdan1", 19));
        user.add(new User("Bog", "Bogdan2", 19));
        user.add(new User("Bog", "Bogdan3", 19));

        HashSet<String> numberHashSet = new HashSet<>();


        numberHashSet.add("Балановська");
        numberHashSet.add("Баришенський");
        numberHashSet.add("Вдовицька");
        numberHashSet.add("Гаєвий");
        numberHashSet.add("Гончаренко");
        numberHashSet.add("Гораль");
        numberHashSet.add("Довбенко");
        numberHashSet.add("Євсюкова");
        numberHashSet.add("Ільге");
        numberHashSet.add("Іменинник");
        numberHashSet.add("Калина");
        numberHashSet.add("Коноверська");
        numberHashSet.add("Королович");
        numberHashSet.add("Логвиненко");
        numberHashSet.add("Місірханов");
        numberHashSet.add("Нічік");
        numberHashSet.add("Новицька");
        numberHashSet.add("Овсюченко");
        numberHashSet.add("Овчаренко");
        numberHashSet.add("Огієнко");
        numberHashSet.add("Рогинський");
        numberHashSet.add("Санжаров");
        numberHashSet.add("Семенов");
        numberHashSet.add("Топчій");
        numberHashSet.add("Трегубов");
        numberHashSet.add("Часовська");

        for (String i : numberHashSet)
            System.out.println(i);

        SortedSet<String> surnameSet = new TreeSet<>();
        surnameSet.add("Балановська");
        surnameSet.add("Баришенський");
        surnameSet.add("Вдовицька");
        surnameSet.add("Гаєвий");
        surnameSet.add("Гончаренко");
        surnameSet.add("Гораль");
        surnameSet.add("Довбенко");
        surnameSet.add("Євсюкова");
        surnameSet.add("Ільге");
        surnameSet.add("Іменинник");
        surnameSet.add("Калина");
        surnameSet.add("Коноверська");
        surnameSet.add("Королович");
        surnameSet.add("Логвиненко");
        surnameSet.add("Місірханов");
        surnameSet.add("Нічік");
        surnameSet.add("Новицька");
        surnameSet.add("Овсюченко");
        surnameSet.add("Овчаренко");
        surnameSet.add("Огієнко");
        surnameSet.add("Рогинський");
        surnameSet.add("Санжаров");
        surnameSet.add("Семенов");
        surnameSet.add("Топчій");
        surnameSet.add("Трегубов");
        surnameSet.add("Часовська");
        
    }
}
