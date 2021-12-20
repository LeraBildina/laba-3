package com.company;

public class Division {

    private long idDivision;
    private String title;


    /**
     * Присваивает значение переменной id
     * @param id id Подразделения Человека
     */
    public void setIdDivision(long id) {
        this.idDivision = id;
    }

    /**
     * Получение значения переменной id Подразделения
     * @return  id Подразделения
     */
    public long getIdDivision() {
        return idDivision;
    }

    /**
     * Присваивает значение переменной Название Подразделения
     * @param title Название Подразделения
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Получение значения переменной Название Подразделения
     * @return Название Подразделения
     */
    public String getTitle() {
        return title;
    }

}
