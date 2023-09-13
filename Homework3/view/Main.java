package Homework3.view;

import Homework3.exceptions.BirthDayException;
import Homework3.fileWorker.AddToFile;
import Homework3.model.Person;

public class Main {
    public static void main(String[] args) throws BirthDayException {
        Person person = new ViewNoteData().addPerson();
        System.out.println(person);
        AddToFile.addToFile(person);
    }
}