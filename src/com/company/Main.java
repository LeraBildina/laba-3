package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Byldina Valeria
 * @version 2.1
 */

public class Main {

    public static void main(String[] args) throws IOException {
        // открываем файл
        BufferedReader buffreader = new BufferedReader(new FileReader(
                "C:\\Users\\user\\Desktop\\foreign_names.csv"));

        // считываем построчно
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Person> personList = new ArrayList<>();

        line = buffreader.readLine();
        scanner = new Scanner(line);
        scanner.next();  //пропускаем первую строку с заголовками столбцов в документе

        while ((line = buffreader.readLine()) != null) {  //разбиваем строку на элементы с соответсвующими index'ами: ID, Name, Gender, BirthData, Division, Salary
            Person pers = new Person();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");   //указываем scanner'у разделитель, который используется у нас в документе

            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)    //первым будет ID
                    pers.setId(Long.parseLong(data));
                else if (index == 1)
                    pers.setName(data);
                else if (index == 2)
                    pers.setSex(data);
                else if (index == 3)
                    pers.setBirth(data);
                else if (index == 4) {
                    Division tmp= new Division(data);
                    pers.setDivision(tmp);
                }
                else if (index == 5)
                    pers.setSalary(data);
                else
                    System.out.println("Некорректные данные" + data);
                index++;   //идем дальше по элементам строки
            }
            index = 0;  //прошли строку, обнулили index
            personList.add(pers);  //добавили человека в List
        }

        //закрываем наш ридер
        buffreader.close();
        System.out.println(" Всего пользователей: " + personList.size());  //выводим количество и видим что объект List заполнен данными из документа
        for(int i=0; i<10; i++)
            System.out.println(personList.get(i));  //выводим любые элементы из объекта List

    }

}