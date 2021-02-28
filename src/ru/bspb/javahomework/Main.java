package ru.bspb.javahomework;

public class Main {

    public static void main(String[] args) {

        Client[] clients = new Client[]{
                new ClientFL(ClientType.FL,"Иванов Петр Сидорович", 1980, Sex.MALE),
                new ClientFL(ClientType.FL,"Александрова Анна Ивановна", 1937, Sex.FEMALE),
                new ClientFL(ClientType.FL,"Петров Сидор Иванович", 1992, Sex.MALE),
                new ClientFL(ClientType.FL,"Михайлова Василиса Петровна", 1991, Sex.FEMALE),
                new ClientFL(ClientType.FL,"Юрьев Александр Сергеевич", 1981, Sex.MALE),
                new ClientFL(ClientType.FL,"Алексеев Вдадимир Александрович", 1986, Sex.MALE),
                new ClientFL(ClientType.FL,"Евгеньева Елена Владимировна", 1980, Sex.FEMALE),
                new ClientFL(ClientType.FL,"Иванов Петр Сидорович", 1980, Sex.MALE),
                new ClientFL(ClientType.FL,"Николаева Наталья Сергеевна", 1989, Sex.FEMALE),
                new ClientFL(ClientType.FL,"Владимиров Олег Викторович", 1955, Sex.MALE),
//        };
//        IP[] clients2 = new IP[]{
                new ClientIP(ClientType.IP,"Иванов Петр Сидорович (ИП)", 1980, 21321546498L),
                new ClientIP(ClientType.IP,"Александрова Анна Ивановна (ИП)", 1937, 15487878718L),
                new ClientIP(ClientType.IP,"Петров Сидор Иванович (ИП)", 1955, 12354797991L),
                new ClientIP(ClientType.IP,"Михайлова Василиса Петровна (ИП)", 1991, 32454648999L),
                new ClientIP(ClientType.IP,"Александрова Анна Ивановна (ИП)", 1937, 15487878718L),
                new ClientIP(ClientType.IP,"Юрьев Александр Сергеевич (ИП)", 1981, 15489784897L),
        };

        Utils.clientsSort(clients);
        Utils.clientDublicateDelete(clients, ClientType.FL,Sex.MALE);

    }

}
