package Homework3.model;

public class Person {
    String name;
    String lastName;
    String patronymic;
    String birthday;
    String phone;
    String gender;
    public Person(String name, String lastName, String patronymic, String birthday, String phone, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [<" + name + "><" + lastName + "><" + patronymic + "><"
                + birthday + "><" + phone + "><" + gender + ">]";
    }
}