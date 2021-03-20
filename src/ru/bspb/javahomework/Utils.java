package ru.bspb.javahomework;

import java.util.*;
import java.util.stream.Stream;

public class Utils {

/**
 * Методы работы с массивом клиентов через массивы. Д.з. 4-5
 *
 */

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

    public static void clientsSortOld(Object[] o) {
        Arrays.sort(o);
    }

    public static void printClientArray (Object[] o){
        for (int i = 0; i < o.length; i++) {
           System.out.println(o[i].toString());
        }
    }


/**
 * Методы работы с массивом клиентов через коллекции. Д.з. 6
 *
 */

    public static void clientsDublicateDelete (ArrayList<Client> o){
        Set<Client> unicClients = new LinkedHashSet<>(o);
        o.clear();
        o.addAll(unicClients);
    }

    public static void clientsSort (ArrayList<Client> o){
        Collections.sort(o, Comparator.comparing(Client::getYear));
    }

    public static void clientsFilter (ArrayList<Client> o){
        Iterator<Client> iterator = o.iterator();
        while (iterator.hasNext()){
            Client client = iterator.next();
            if (client instanceof ClientFL) {
                if (((ClientFL<?>) client).getSex().equals(Sex.FEMALE)) {
                    iterator.remove();
                }
            }
            else
                iterator.remove();
        }
    }

    public static void clientsPrint (ArrayList<Client> o){
        o.forEach(System.out::println);
    }


/**
 * Методы работы с массивом клиентов через потоки с лямбда-выражениями. Д.з. 7
 *
 */

    public static void clientStream(ArrayList<Client> clients){
        clients.stream()
            .sorted(Comparator.comparing(Client::getYear))
            .distinct()
            .filter(o -> o instanceof ClientFL)
            .filter(o -> ((ClientFL<?>) o).getSex().equals(Sex.MALE))
            .forEach(System.out::println);
    }

}


