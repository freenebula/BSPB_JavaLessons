package ru.bspb.javahomework;

import java.util.Arrays;

public class Utils {

    public static void sortOld(ClientFL[] clients) {
        for (int i = 0; i < clients.length; i++) {
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[j].getYear() < clients[i].getYear()) {
                    int tempYear = clients[i].getYear();
                    clients[i].setYear(clients[j].getYear());
                    clients[j].setYear(tempYear);

                    String tempName = clients[i].getName();
                    clients[i].setName(clients[j].getName());
                    clients[j].setName(tempName);

                    Sex tempSex = clients[i].getSex();
                    clients[i].setSex(clients[j].getSex());
                    clients[j].setSex(tempSex);
                }
            }
        }
    }


    public static void clientDublicateDelete(Client[] clients, ClientType clientType, Sex sex) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getClientType() == clientType) {
                int d = 0;
                for (int j = i + 1; j < clients.length; j++) {
                    if (clients[i].equals(clients[j])) {
                        d = 1;
                        break;
                    }
                }
                switch (clients[i].getClientType()) {
                    case FL:
                        if (d == 0 && clients[i].getSex().equals(sex)) {
                            System.out.println(clients[i]);
                        }
                        break;
                    case IP:
                        if (d == 0) {
                            System.out.println(clients[i]);
                        }
                }
            }
        }
    }



    public static void clientsSort(Object[] o) {
        Arrays.sort(o);
//            for (int i = 0; i < o.length; i++) {
//                System.out.println(o[i]);
//            }
    }
}


