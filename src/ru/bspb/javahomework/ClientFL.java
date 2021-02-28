package ru.bspb.javahomework;

import java.util.Objects;

public class ClientFL extends Client {


    public ClientFL(ClientType clientType, String name, int year, Sex sex) {
        super(clientType, name,year);
        setSex(sex);
    }


    public int compareTo(Client o) {
        if (this.getYear() > o.getYear()){
            return +1;
        } else if (this.getYear() == o.getYear()) {
            return 0;
        } else {
            return -1;
        }
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
        return /*getClientType() == client.getClientType() &&*/ getYear() == client.getYear() && getName().equals(client.getName()) && getSex().equals(client.getSex());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getSex());
    }


}
