package ru.bspb.javahomework;

import java.util.Objects;

public class ClientIP extends Client{
//    private final String name;
//    private final int year;
//    private long ogrn;
//    private String sex;

    public ClientIP(ClientType clientType, String name, int year, long ogrn) {
        super(clientType, name, year);
        setOgrn(ogrn);
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
        return /*getClientType() == client.getClientType() &&*/ getYear() == client.getYear() && getName().equals(client.getName()) && getOgrn() == client.getOgrn();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getOgrn());
    }


}
