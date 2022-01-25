package lesson6;

public class StringUtils {


    /**
     * 1 - модификатор доступа (одно из 4-х видов слов,
     * которое регулирует область видимости данного метода)
     * public - этот метод доступен внутри всего проекта
     * ______ - доступен внутри текущего пакета
     * protected - доступен внутри текущего проекта и классам наследникам
     * private - доступ внутри текущего класса
     * 2 - static (или пишем или нет).
     * 3 - возвращаемый тип (int, String, Date, ...) или void если ничего не возвращается
     * 4 - название метода
     * 5 - входящие параметры (String text, int count) ...
     * 6 - тело метода, то что будет происходить при вызове данного метода
     */

    public static int countGlassDromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'i' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'u') {
                count++;

            }
        }
        return count;
    }

    public static void printTextByWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.replace("//?", "");
        text = text.replace(";", "");
        text = text.replace(":", "");
        text = text.replace(">", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
    }

    public static void Coding(String TextByCoding) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (int i = 0; i < TextByCoding.length(); i++) {
            int index = alphabet.indexOf(TextByCoding.charAt(i));
            if (index >= 0) {
                result = result + alphabet.charAt(index+1);
            }else {
                result = result + TextByCoding.charAt(i);
            }

        }

    }
}


