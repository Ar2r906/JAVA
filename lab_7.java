/*
 * 
 * Дан набор значений, где есть 5 символов и команада, которая указывается в начале сообщения. Нужно выявить есть ли совпадения в значениях. 
 * Если есть совпадения - вывести ошибку, если нет - вывести параметры: каждый с новой строчки.
 * 
 */

package lab_7_string;

public class lab_7 {
    public static void main(String[] args) {
        String commandLine = "знчение 1 2 3 4 5";

        String[] tokens = commandLine.split("\\s+");

        String command = tokens[0];

        String[] parameters = new String[Math.min(tokens.length - 1, 5)];

        boolean uniqueParams = true;
        for (int i = 1; i < tokens.length; i++) {
            parameters[i - 1] = tokens[i];
            for (int j = 0; j < i - 1; j++) {
                if (parameters[j].equals(parameters[i - 1])) {
                    uniqueParams = false;
                    break;
                }
            }
        }

        System.out.println("Команда: " + command);
        if (uniqueParams) {
            System.out.println("Параметры:");
            for (String param : parameters) {
                if (param != null) {
                    System.out.println(param);
                }
            }
        } else {
            System.out.println("Ошибка: Некоторые параметры совпадают.");
        }
    }
}




