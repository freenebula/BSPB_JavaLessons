package ru.bspb.javalesson3;

public class Main {

    public static void main(String[] args) {

        Client[] clients = new Client[]{
                new Client("Иванов Петр Сидорович", 1980, "м"),
                new Client("Александрова Анна Ивановна", 1937, "ж"),
                new Client("Петров Сидор Иванович", 1955, "м"),
                new Client("Михайлова Василиса Петровна", 1991, "ж"),
                new Client("Юрьев Александр Сергеевич", 1981, "м"),
                new Client("Алексеев Вдадимир Александрович", 1986, "м"),
                new Client("Евгеньева Елена Владимировна", 1980, "ж"),
                new Client("Иванов Петр Сидорович", 1980, "м"),
                new Client("Николаева Наталья Сергеевна", 1989, "ж"),
                new Client("Владимиров Олег Викторович", 1992, "м")
        };

        compare(clients);
        sort(clients);
    }

    public static void compare (Client[] clients){
        for (int i = 0; i < clients.length; i++) {
            int d = 0;
            for (int j = i+1; j < clients.length; j++) {
                if (clients[i].equals(clients[j]) == true) {
                    d++;
                }
            }
            if (clients[i].getSex() == "м" && d==0) {
                System.out.println(clients[i]);
            }
        }
    }

    public static void sort (Client[] clients) {
        for (int i = 0; i < clients.length; i++) {
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[j].getYear() < clients[i].getYear()) {
                    int tempYear = clients[i].getYear();
                    clients[i].setYear(clients[j].getYear());
                    clients[j].setYear(tempYear);

                    String tempName = clients[i].getName();
                    clients[i].setName(clients[j].getName());
                    clients[j].setName(tempName);

                    String tempSex = clients[i].getSex();
                    clients[i].setSex(clients[j].getSex());
                    clients[j].setSex(tempSex);
                }
            }
        }
    }
}
