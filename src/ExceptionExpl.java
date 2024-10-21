// В Java для обработки исключений используются ключевые слова:

// try – блок, в котором может возникнуть исключение.
// catch – блок для обработки исключения.
// finally – блок, который выполняется всегда, вне зависимости от того, было исключение или нет.
// throw – оператор для выброса исключения.
// throws – используется в сигнатуре метода для указания, что метод может выбросить исключение.


import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExpl {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Возможна ошибка деления на ноль
            FileReader reader = new FileReader("file.txt");
            System.out.println("Результат вычисления равен: " + result);
            throw new SQLException();
        } catch (IOException | ArithmeticException | SQLException ex1) {
            System.out.println("Ошибка: Деление на ноль!");
        }


//        try () {
//            int read = reader.read();
//        } catch (IOException e) {
//            System.out.println("Файл не найден!");
//        }

//        validateAge(10);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Возраст должен быть больше 18 лет");
        }
    }

}

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}