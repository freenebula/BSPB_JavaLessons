package ru.bspb.javahomework;

import java.util.Arrays;
import java.util.Comparator;

public class Utils {

    public static void sort(FL[] clients) {
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


    public static void filter(FL[] clients) {
        for (int i = 0; i < clients.length; i++) {
            int d = 0;
            switch (clients[i].getSex()) {
                case MALE:
                    for (int j = i + 1; j < clients.length; j++) {
                        if (clients[i].equals(clients[j])) {
                            d = 1;
                            break;
                        }
                    }
                    if (d == 0) {
                        System.out.println(clients[i]);
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


