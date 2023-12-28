package oop;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valueObject = new ValueData();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println(valueObject.value);
    }
}
