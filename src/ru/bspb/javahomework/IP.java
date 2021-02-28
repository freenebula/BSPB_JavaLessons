package ru.bspb.javahomework;

import java.util.Objects;

public class IP extends Client{
    private final String name;
    private final int year;
    private long ogrn;
//    private String sex;

    public IP(String name, int year, long ogrn) {
        this.name = name;
        this.year = year;
        this.ogrn = ogrn;
    }


     public long getOgrn() {
        return ogrn;
    }

    public void setOgrn(long ogrn) {
        this.ogrn = ogrn;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IP client = (IP) o;
        return year == client.year && name.equals(client.name) && ogrn == client.ogrn;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, year, ogrn);
    }


}
