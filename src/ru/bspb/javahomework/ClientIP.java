package ru.bspb.javahomework;

import java.util.Objects;

public class ClientIP<T> extends Client{


    public ClientIP(String name, int year, long ogrn) {
        super(name, year);
        setOgrn(ogrn);
    }

    private long ogrn;

    public long getOgrn() {
        return ogrn;
    }

    public void setOgrn(long ogrn) {
        this.ogrn = ogrn;
    }

    @Override
    public String toString() {
        return getName() + " " + getYear() + " " + getOgrn();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientIP client = (ClientIP) o;
        return getYear() == client.getYear() && getName().equals(client.getName()) && getOgrn() == client.getOgrn();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getOgrn());
    }


}
