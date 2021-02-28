package ru.bspb.javahomework;

public abstract class Client implements Comparable<Client>{
    private ClientType clientType;
    private String name;
    private int year;
    private Sex sex;
    private long ogrn;

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public long getOgrn() {
        return ogrn;
    }

    public void setOgrn(long ogrn) {
        this.ogrn = ogrn;
    }
//    public Client() {}

    public Client(ClientType clientType, String name, int year) {
        this.clientType = clientType;
        this.name = name;
        this.year = year;
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

        @Override
    public int compareTo(Client o) {
        if (this.year > o.year){
            return +1;
        } else if (this.year == o.year) {
            return 0;
        } else {
            return -1;
        }
    }


}
