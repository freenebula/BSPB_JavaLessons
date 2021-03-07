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




    static int countOrig (Client[] clients) {
        int a = 0;
        for (int i = 0; i < clients.length; i++) {
            int d = 0;
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[i].equals(clients[j])) {
                    d = 1;
                    break;
                }
            }
            if (d == 0) {
                a++;
            }
        }
        return a;
    }


    public static Client[] clientDublicateDelete (Client[] clients){
        int a = countOrig(clients);
        Client [] clients2 = new Client[a];
        int b = 0;
        for (int i = 0; i < clients.length; i++) {
            int d = 0;
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[i].equals(clients[j])) {
                    d = 1;
                    break;
                }
            }
            if (d == 0) {
                clients2[b] = clients[i];
                b++;
            }
        }
        return clients2;
    }


    static int countSex (Client[] clients) {
        int a = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] instanceof ClientFL && ((ClientFL) clients[i]).getSex().equals(Sex.MALE)) {
                a++;
            }
        }
        return a;
    }

    public static Client[] clientSexFilter (Client[] clients){
        int a = countSex(clients);
        Client [] clients2 = new Client[a];
        int b = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] instanceof ClientFL && ((ClientFL) clients[i]).getSex().equals(Sex.MALE)){
                clients2[b] = clients[i];
                b++;
            }
        }

        return clients2;
    }


    public static void clientsSort(Object[] o) {
        Arrays.sort(o);
    }

    public static void printClientArray (Object[] o){
        for (int i = 0; i < o.length; i++) {
           System.out.println(o[i].toString());
        }
    }

}


