package Homework3.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Person> listPersons = new ArrayList<>();
  
    public void initPersons(List<Person> persons) {
      this.listPersons = persons;
    }
  
    public List<Person> getListPersons() {
      return listPersons;
    }
  
    public void setListPersons(List<Person> persons) {
      this.listPersons = persons;
    }

    @Override
    public String toString() {
      String result = "";
      for (Person person : listPersons) {
        result += person.toString() + "\n";
      }
      return result;
    }
}