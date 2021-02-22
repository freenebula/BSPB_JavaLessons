package ru.bspb.javalesson3;

import java.util.Objects;

public class Client {
    private String name;
    private int year;
    private String sex;

    public Client(String name, int year, String sex) {
        this.name = name;
        this.year = year;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return year == client.year && name.equals(client.name) && sex.equals(client.sex);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, year, sex);
    }
}
