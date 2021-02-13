public class JavaLesson2 {
// 10 клиентов - фио, возраст, пол. вывод списка клиентов, по полу, сортировка по возрасту,
    public static void main(String[] args) {

        String [] clientArray = new String [] {
                "Иванов Петр Сидорович",
                "Клара Цеткин",
                "Абдурахман ибн Хаттаб",
                "Роза Люксембрг",
                "Александров Александр Александрович",
                "Джозеф Сталинн",
                "Баттлфилд Комбикорм",
                "Гвен Стейси",
                "Баба Нюра",
                "Дед Максим"
        };
        int [] birthYearArray = new int [] {
                1980,
                1899,
                -10000,
                1877,
                2000,
                1878,
                1976,
                1965,
                1917,
                1917
        };
        char [] sexArray = new char[] {'м', 'ж', 'м', 'ж', 'м', 'м', 'м', 'ж', 'ж', 'м'};
        char sex = 'м'; //выбор по полу

        for (int i = 0; i<birthYearArray.length; i++) {
            for (int j = i + 1; j < birthYearArray.length; j++) {
                if (birthYearArray[j] < birthYearArray[i]) {
                    int birthYearTemp = birthYearArray[i];
                    String clientTemp = clientArray[i];
                    char sexTemp = sexArray[i];

                    birthYearArray[i] = birthYearArray[j];
                    clientArray[i] = clientArray[j];
                    sexArray[i] = sexArray[j];

                    birthYearArray[j] = birthYearTemp;
                    clientArray[j] = clientTemp;
                    sexArray[j] = sexTemp;
                }
            }
            if (sexArray[i] == sex) {
                System.out.print(clientArray[i] + " ");
                System.out.print(birthYearArray[i] + " ");
                System.out.println(sexArray[i]);
            }
        }
    }
}
