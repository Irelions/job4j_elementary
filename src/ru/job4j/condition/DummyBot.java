package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {

        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals(question)) {
            return "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            return "До скорой встречи.";
        }
        return rsl;
    }
}
