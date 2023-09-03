/*Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall,
имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса
 - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.


 */

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("1111","A300",333);
        System.out.println("Number: " + phone.number);
        System.out.println("Model: " + phone.model);
        System.out.println("Weight: " + phone.weight);
        phone.receiveCall("Pavel");
        System.out.println(", " + phone.getNumber());
        System.out.println(" ");

        Phone phone2 = new Phone("222","CX222");
        System.out.println("Number: " + phone2.number);
        System.out.println("Model: " + phone2.model);
        phone2.receiveCall("Vitya");
        System.out.println(", " + phone2.getNumber());
        System.out.println(" ");

        Phone phone3 = new Phone();
        phone3.receiveCall("George");
        System.out.println(" " + phone3.getNumber());


    }
}

class Phone {

    String number;
    String model;
    double weight;

    public void  receiveCall(String Name) {
        System.out.print("Звонит: " + Name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public Phone() {
    }

}
