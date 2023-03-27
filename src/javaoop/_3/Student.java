package javaoop._3;

import java.util.SplittableRandom;

public class Student {
     private String name;
     private String surname;
     private int age;
     private String ID;
     private String codiceFiscale;
     private int ageCounter;

     public void setName(String name) {
          this.name = name;
     }
     public String getNome() {
          return name;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }
     public String getSurname() {
          return surname;
     }

     public void setAge(int age) {
          if (age < 0) {
          System.out.println("Invalid age.");
     } else {
          this.age = age;
          }
     }
     public int getAge() {
          ageCounter++;
          return age;
     }

     public int getAgeCounter(){
          return ageCounter;
     }

     public void setID(String ID) {
          this.ID = ID;
     }
     public String getID() {
          return ID;
     }
     public void setCodiceFiscale(String codiceFiscale) {
          if (codiceFiscale.length() < 16) {
               System.out.println("Invalid Codice Fiscale.");
          } else {
               this.codiceFiscale = codiceFiscale;
          }
     }
     public String getCodiceFiscale() {
          return codiceFiscale;
     }
}
