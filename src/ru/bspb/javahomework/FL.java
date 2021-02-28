package ru.bspb.javahomework;

import java.util.Objects;

public class FL extends Client {
    private final String name;
    private final int year;
    private Sex sex;

    public FL(String name, int year, Sex sex) {
        this.name = name;
        this.year = year;
        this.sex = sex;
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
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
        FL client = (FL) o;
        return year == client.year && name.equals(client.name) && sex.equals(client.sex);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, year, sex);
    }


}
