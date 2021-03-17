package ru.bspb.javahomework;

import java.util.Objects;

public class ClientFL<T> extends Client {


    public ClientFL(String name, int year, Sex sex) {
        super(name,year);
        setSex(sex);
    }

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return getName() + " " + getYear() + " " + getSex();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientFL client = (ClientFL) o;
        return getYear() == client.getYear() && getName().equals(client.getName()) && getSex().equals(client.getSex());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getSex());
    }


}
