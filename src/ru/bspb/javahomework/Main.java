package ru.bspb.javahomework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        FL[] clients = new FL[]{
                new FL("Иванов Петр Сидорович", 1980, Sex.MALE),
                new FL("Александрова Анна Ивановна", 1937, Sex.FEMALE),
                new FL("Петров Сидор Иванович", 1955, Sex.MALE),
                new FL("Михайлова Василиса Петровна", 1991, Sex.FEMALE),
                new FL("Юрьев Александр Сергеевич", 1981, Sex.MALE),
                new FL("Алексеев Вдадимир Александрович", 1986, Sex.MALE),
                new FL("Евгеньева Елена Владимировна", 1980, Sex.FEMALE),
                new FL("Иванов Петр Сидорович", 1980, Sex.MALE),
                new FL("Николаева Наталья Сергеевна", 1989, Sex.FEMALE),
                new FL("Владимиров Олег Викторович", 1992, Sex.MALE)
        };
        IP[] clients2 = new IP[]{
                new IP("Иванов Петр Сидорович (ИП)", 1980, 21321546498L),
                new IP("Александрова Анна Ивановна (ИП)", 1937, 15487878718L),
                new IP("Петров Сидор Иванович (ИП)", 1955, 12354797991L),
                new IP("Михайлова Василиса Петровна (ИП)", 1991, 32454648999L),
                new IP("Юрьев Александр Сергеевич (ИП)", 1981, 15489784897L),
        };


//        Utils.clientsSort(clients);
        Arrays.sort(clients);
        System.out.println(Arrays.toString(clients));

//        Utils.sort(clients);
//        Utils.filter(clients);

    }

}
