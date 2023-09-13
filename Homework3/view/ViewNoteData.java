package Homework3.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Homework3.exceptions.BirthDayException;
import Homework3.exceptions.MyDataException;
import Homework3.model.Person;

public class ViewNoteData {

    public Person addPerson() throws BirthDayException {
        try (Scanner scan = new Scanner(System.in);) {

            System.out.print("Введите ФИО через пробел: ");
            String[] nameString = scan.nextLine().split(" ");
            if (nameString.length != 3) {
                throw new RuntimeException("Ошибка, количество введённых данных ФИО не совпадает с требуемым");
            }
            for (int i = 0; i < nameString.length; i++) {
                if (nameString[i].matches(".*\\d.*")) {
                    throw new RuntimeException("Ошибка, введённые данные содержат цифры");
                }
            }
            String lastName = nameString[0];
            String name = nameString[1];
            String patronymic = nameString[2];

            System.out.print("Введите дату рождения в формате: dd.mm.yyyy: ");
            String birthDay = scan.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String date = birthDay;
            try {
                LocalDate localDate = LocalDate.parse(date, formatter);
                LocalDate currentDate = LocalDate.now();
                if (!localDate.isBefore(currentDate)) {
                    throw new BirthDayException("Введённая дата не соответствует прошедшему времени.");
                }
            } catch (DateTimeParseException e) {
                throw new BirthDayException("Ошибка ввода даты.");
            }

            System.out.print("Введите номер телефона без символов: ");
            String phoneNumber = scan.next();
            try {
                Long.parseLong(phoneNumber);
            } catch (NumberFormatException e) {
                throw new MyDataException(
                        "ошибка преобразования строки в число, телефонный номер введён неверно.");
            }

            System.out.print("Enter your gender f/m: ");
            String gender = scan.next();
            if (!gender.equals("f") | gender.equals("m"))
                throw new RuntimeException("пол введён неверно");
                Person person = new Person(name, lastName, patronymic, birthDay, phoneNumber, gender);
                return person;
        }
    }
}