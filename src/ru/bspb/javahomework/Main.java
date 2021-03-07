package ru.bspb.javahomework;

public class Main {

    public static void main(String[] args) {

        Client[] clients = new Client[]{
                new ClientIP("Александрова Анна Ивановна (ИП)----", 1937, 15487878718L),
                new ClientFL("Иванов Петр Сидорович----", 1980, Sex.MALE),
                new ClientFL("Александрова Анна Ивановна", 1937, Sex.FEMALE),
                new ClientFL("Петров Сидор Иванович", 1992, Sex.MALE),
                new ClientFL("Михайлова Василиса Петровна", 1991, Sex.FEMALE),
                new ClientFL("Юрьев Александр Сергеевич", 1981, Sex.MALE),
                new ClientFL("Алексеев Вдадимир Александрович", 1986, Sex.MALE),
                new ClientFL("Евгеньева Елена Владимировна", 1980, Sex.FEMALE),
                new ClientFL("Иванов Петр Сидорович----", 1980, Sex.MALE),
                new ClientFL("Николаева Наталья Сергеевна", 1989, Sex.FEMALE),
                new ClientFL("Владимиров Олег Викторович", 1955, Sex.MALE),
                new ClientIP("Иванов Петр Сидорович (ИП)", 1980, 21321546498L),
                new ClientIP("Александрова Анна Ивановна (ИП)----", 1937, 15487878718L),
                new ClientIP("Петров Сидор Иванович (ИП)", 1955, 12354797991L),
                new ClientIP("Михайлова Василиса Петровна (ИП)", 1991, 32454648999L),
                new ClientIP("Александрова Анна Ивановна (ИП)----", 1937, 15487878718L),
                new ClientIP("Юрьев Александр Сергеевич (ИП)", 1981, 15489784897L),
        };

        Utils.clientsSort(clients);
        Utils.printClientArray(Utils.clientDublicateDelete(Utils.clientSexFilter(clients)));
    }

}
