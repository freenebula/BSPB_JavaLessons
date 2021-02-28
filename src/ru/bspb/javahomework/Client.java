package ru.bspb.javahomework;

public class Client implements Comparable<Client>{
    private String name;
    private int year;

    public Client() {}

//    public Client(ClientType clientType, String name, int year) {
//        this.clientType = clientType;
//        this.name = name;
//        this.year = year;


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
