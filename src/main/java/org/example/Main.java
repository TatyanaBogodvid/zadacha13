package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Количество полок
    private static final int AMOUNT_OF_SHELVES = 5;

    public static void main(String[] args) {
        /*
        Задача
        Необходимо реализовать следующий метод:
•	На вход получаем список названий книг.
•	Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг.
•	Все книги должны быть отсортированы по алфавиту с первой до последней полки.
•	Количество полок константное — 5 штук.
•	Вернуть книги, распределенные по полкам.
        */

        // Список книг
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("Мастер и Маргарита");
        bookTitles.add("Собачье сердце");
        bookTitles.add("Двенадцать стульев");
        bookTitles.add("Мёртвые души");
        bookTitles.add("Граф Монте-Кристо");
        bookTitles.add("Золотой теленок");
        bookTitles.add("Война и мир");
        bookTitles.add("Гранатовый браслет");
        bookTitles.add("Горе от ума");
        bookTitles.add("Обломов");
        bookTitles.add("Над пропастью во ржи");
        bookTitles.add("Атлантида");
        bookTitles.add("Гордость и предубеждения");
        bookTitles.add("Атлантида");



        // Вызов метода
        //Collections.sort(bookTitles);
        //System.out.println(bookTitles);
        System.out.println(bookTitles.size());
        System.out.println(distributeBooks(bookTitles));
        System.out.println(distributeBooks2(bookTitles));



    }

    // Метод раскладывает книги по одной на каждую полку, повторяя цикл, пока книги не закончатся
    public static List<List<String>> distributeBooks(List<String> bookTitles) {
        //Все полки
        List<List<String>> shelves = new ArrayList<>();

        // Создание необходимого количества пустых списков
        for (int i = 0; i < AMOUNT_OF_SHELVES; i++) {
            shelves.add(new ArrayList<>());
        }
        // Сортировка списка книг по алфавиту
        Collections.sort(bookTitles);

        int shelfIndex = 0;
        for (String bookTitle : bookTitles) {
            shelves.get(shelfIndex).add(bookTitle);
            shelfIndex++;
            if (shelfIndex == AMOUNT_OF_SHELVES) {
                shelfIndex = 0;
            }
        }
        return shelves;
    }

    public static List<List<String>> distributeBooks2(List<String> bookTitles) {
        //Все полки
        List<List<String>> shelves = new ArrayList<>();

        // Создание необходимого количества пустых списков
        for (int i = 0; i < AMOUNT_OF_SHELVES; i++) {
            shelves.add(new ArrayList<>());
        }

        // Сортировка списка книг по алфавиту
        Collections.sort(bookTitles);

        //Если количество книг делится на количество полок без остатка
        if (bookTitles.size() % AMOUNT_OF_SHELVES == 0) {
            //количество книг на одной полке
            int amountOfBooks = bookTitles.size() / AMOUNT_OF_SHELVES;
            int i = 0;
            for (int j = 0; j < AMOUNT_OF_SHELVES; j++) {
                while (shelves.get(j).size() < amountOfBooks) {
                    shelves.get(j).add(bookTitles.get(i));
                    i++;
                }
            }
        }
        //Если количество книг не делится на количество полок без остатка
        else {
            //Находим среднее количество книг на каждой полке
            double amountOfBooksDouble = (double) bookTitles.size() / (double) AMOUNT_OF_SHELVES;
            //Выделяем дробную часть (остаток от деления)
            double fraction = amountOfBooksDouble - (int) amountOfBooksDouble;
            int n = 0;
            // Если остаток от деления больше или равен 0,5, округляем число книг не полке в большую сторону
            if (Math.abs(fraction) >= 0.5) {
                //Заполняем первые 4 полки получившимся значением книг
                for (int j = 0; j < (AMOUNT_OF_SHELVES-1); j++) {
                    while (shelves.get(j).size() <= (int) amountOfBooksDouble) {
                        shelves.get(j).add(bookTitles.get(n));
                        n++;
                    }
                }
                // если остаток от деления меньше 0,5, то округляем число книг на полке в меньшую сторону
            } else {
                //Заполняем первые 4 полки получившимся значением книг
                for (int j = 0; j < (AMOUNT_OF_SHELVES-1); j++) {
                    while (shelves.get(j).size() < (int) amountOfBooksDouble) {
                        shelves.get(j).add(bookTitles.get(n));
                        n++;
                    }
                }
            }
                //Добавить оставшиеся книги на последнюю полку
                for (int a = n; a < bookTitles.size(); a++){
                    shelves.get(AMOUNT_OF_SHELVES - 1).add(bookTitles.get(n));
                }
        }
        return shelves;
    }
}