package org.example.test;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    //Когда число книг делится на 5 без остатка
    @Test
    public void whenAmountOfBooks10(){
        Main main = new Main();
        List<String> listBooks1 = new ArrayList<>();
        listBooks1.add("Мастер и Маргарита");
        listBooks1.add("Собачье сердце");
        listBooks1.add("Двенадцать стульев");
        listBooks1.add("Мёртвые души");
        listBooks1.add("Граф Монте-Кристо");
        listBooks1.add("Золотой теленок");
        listBooks1.add("Война и мир");
        listBooks1.add("Гранатовый браслет");
        listBooks1.add("Горе от ума");
        listBooks1.add("Обломов");

        List<List<String>> actualResult = main.distributeBooks2(listBooks1);

        List<String> shelf1 = new ArrayList<>(){{
            add("Война и мир");
            add("Горе от ума");
        }};
        List<String> shelf2 = new ArrayList<>(){{
            add("Гранатовый браслет");
            add("Граф Монте-Кристо");
        }};
        List<String> shelf3 = new ArrayList<>(){{
            add("Двенадцать стульев");
            add("Золотой теленок");
        }};
        List<String> shelf4 = new ArrayList<>(){{
            add("Мастер и Маргарита");
            add("Мёртвые души");
        }};
        List<String> shelf5 = new ArrayList<>(){{
             add("Обломов");
             add("Собачье сердце");
        }};

        List<List<String>> expected = new ArrayList<>(){{
            add(shelf1);
            add(shelf2);
            add(shelf3);
            add(shelf4);
            add(shelf5);
        }};

        Assertions.assertEquals(expected,actualResult);
    }

    //Когда остаток меньше 0,5
    @Test
    public void whenAmountOfBooks11(){
        Main main = new Main();
        List<String> listBooks2 = new ArrayList<>();
        listBooks2.add("Мастер и Маргарита");
        listBooks2.add("Собачье сердце");
        listBooks2.add("Двенадцать стульев");
        listBooks2.add("Мёртвые души");
        listBooks2.add("Граф Монте-Кристо");
        listBooks2.add("Золотой теленок");
        listBooks2.add("Война и мир");
        listBooks2.add("Гранатовый браслет");
        listBooks2.add("Горе от ума");
        listBooks2.add("Обломов");
        listBooks2.add("Спарта");

        List<List<String>> actualResult = main.distributeBooks2(listBooks2);

        List<String> shelf1 = new ArrayList<>(){{
            add("Война и мир");
            add("Горе от ума");
        }};
        List<String> shelf2 = new ArrayList<>(){{
            add("Гранатовый браслет");
            add("Граф Монте-Кристо");
        }};
        List<String> shelf3 = new ArrayList<>(){{
            add("Двенадцать стульев");
            add("Золотой теленок");
        }};
        List<String> shelf4 = new ArrayList<>(){{
            add("Мастер и Маргарита");
            add("Мёртвые души");
        }};
        List<String> shelf5 = new ArrayList<>(){{
            add("Обломов");
            add("Собачье сердце");
            add("Спарта");
        }};

        List<List<String>> expected = new ArrayList<>(){{
            add(shelf1);
            add(shelf2);
            add(shelf3);
            add(shelf4);
            add(shelf5);
        }};

        Assertions.assertEquals(expected,actualResult);
    }

    //Когда остаток больше 0,5
    @Test
    public void whenAmountOfBooks14(){
        Main main = new Main();
        List<String> listBooks3 = new ArrayList<>();
        listBooks3.add("Мастер и Маргарита");
        listBooks3.add("Собачье сердце");
        listBooks3.add("Двенадцать стульев");
        listBooks3.add("Мёртвые души");
        listBooks3.add("Граф Монте-Кристо");
        listBooks3.add("Золотой теленок");
        listBooks3.add("Война и мир");
        listBooks3.add("Гранатовый браслет");
        listBooks3.add("Горе от ума");
        listBooks3.add("Обломов");
        listBooks3.add("Над пропастью во ржи");
        listBooks3.add("Атлантида");
        listBooks3.add("Гордость и предубеждения");
        listBooks3.add("Спарта");

        List<List<String>> actualResult = main.distributeBooks2(listBooks3);

        List<String> shelf1 = new ArrayList<>(){{
            add("Атлантида");
            add("Война и мир");
            add("Гордость и предубеждения");
        }};
        List<String> shelf2 = new ArrayList<>(){{
            add("Горе от ума");
            add("Гранатовый браслет");
            add("Граф Монте-Кристо");
        }};
        List<String> shelf3 = new ArrayList<>(){{
            add("Двенадцать стульев");
            add("Золотой теленок");
            add("Мастер и Маргарита");
        }};
        List<String> shelf4 = new ArrayList<>(){{
            add("Мёртвые души");
            add("Над пропастью во ржи");
            add("Обломов");
        }};
        List<String> shelf5 = new ArrayList<>(){{
            add("Собачье сердце");
            add("Спарта");
        }};

        List<List<String>> expected = new ArrayList<>(){{
            add(shelf1);
            add(shelf2);
            add(shelf3);
            add(shelf4);
            add(shelf5);
        }};

        Assertions.assertEquals(expected,actualResult);


    }
}
