package ru.mirea.lab2;

import java.sql.SQLOutput;

class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        String str = name + " " + email + " " + gender;
        return str;
    }
}

public class class1 {
    public static void main(String[] args) {
        Author a = new Author("Sanya", "asd@mail.ru", 'M');
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        a.setEmail("zxc@mail.ru");
        System.out.println(a.toString());
    }
}
