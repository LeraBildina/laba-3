package com.company;

public class Person {

    private long id;
    private String name;
    private String sex;
    private String salary;
    private String birth;
    private Division division;

    /**
     * Конструктор c параметрами класса Person,
     * заполняющий поле Divisison
     * @param division_id - id подразделения
     * @param title - название подразделения
     */

    public Person(long division_id, String title) {
        setDivision(new Division(division_id,title));
    }

    /**
     * Конструктор без параметров класса Person
     */

    public Person() {
    }

    /**
     * Присваивает значение переменной id
     * @param id - id человека
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Получение значения переменной id
     * @return id человека
     */
    public long getId() {
        return id;
    }

    /**
     * Присваивает значения переменной Имя
     * @param name - имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение значения переменной Имя
     * @return Имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Присваивает значение переменной Пол
     * * @param sex - Пол человека
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Получение значения переменной Пол
     * @return Пол человека
     */
    public String getSex() {
        return sex;
    }

    /**
     * Присваивает значение переменной Зарплата
     * @param salary - Зарплата человека
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * Получение значения переменной Пол
     * @return Зарплата
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Присваивает значение переменной День Рождения
     * @param birth День Рождения
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * Получение значения переменной День Рождения
     * @return День Рождения
     */
    public String getBirth() {
        return birth;
    }

    /**
     *Устаналивает Division
     * @param
     */
    public void setDivision(Division division) {
        this.division= division;
    }

    /**
     *Возвращает Division
     * @return
     */
    public Division getDivision() {
        return division;
    }
    //переопределение метода toString для удобства вывода на печать

    /**
     * Метода toString для вывода на печать
     * @return Строка вывода
     */
    @Override
    public String toString(){
        return "\nID=" + getId() + " Name = " + getName() + " Sex = " + getSex() + " BirthData = " + getBirth() + " Division = " + division.getTitle() + " Salary = " + getSalary();
    }
}