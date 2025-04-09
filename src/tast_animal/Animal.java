package tast_animal;

/**
 * Ստեղծիր մի class՝ Animal
 *
 * Ունենա փոփոխական՝ name
 *
 * Ունենա constructor, որը կստանա անունը որպես պարամետր
 *
 * Ունենա մեթոդ՝ speak(), որը կարտահայտի՝ "Animal is making a sound"
 *
 * Ստեղծիր մի class՝ Dog, որը ժառանգում է Animal-ից
 *
 * Ունենա իր constructor, որը կստանա անունը ու կանչի ծնողի constructor
 *
 * Override արա speak() մեթոդը ու տպի՝ "Dog barks!"
 *
 * Ստեղծիր մի class Main, որի մեջ կստեղծես Animal ու Dog օբյեկտներ և կանչես speak() մեթոդները։
 */
public class Animal {
    public String name;
    public Animal(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("Animal is making a sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    public void speak(){
        System.out.println("Dog Barks!");
    }
}
class Main{
    public static void main(String[] args) {
        //Animal animal = new Animal("Generic Animal");
        Animal animal = new Dog("Bobby");
        System.out.println(animal.name);
        //Dog dog = new Dog("Max");
       // animal.speak();
        //dog.speak();

    }


}
