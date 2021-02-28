package ru.bspb.javahomework;

public enum ClientType {
    IP("Индивидуальный предприниматель"),
    FL("Физическое лицо");

    ClientType (String clientType){
        this.clientType = clientType;
    }

    private final String clientType;

    public String getClienType() {
        return clientType;
    }
    @Override
    public  String toString() {
        return clientType;
    }
}
