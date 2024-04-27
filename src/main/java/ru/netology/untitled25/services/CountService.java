package ru.netology.untitled25.services;

public class CountService {
    public long calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = income - expenses;
        int vocation = (money - expenses) / 3;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //отдыхаем!
                count++; // увеличиваем счётчик месяцев отдыха.
                money = vocation++;
            } else {
                money = money + income - expenses;
            }
        }

        return count;

    }
}
