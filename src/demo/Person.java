package demo;

public class Person {
    private String name ;
    private int age;
    private String gender;

    public Person(String name,int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
        public void printPersondetails(Person obj){
            System.out.println("Name of the person" + obj.name);
            System.out.println("Age of the person" + obj.age);
            System.out.println("Gender of the person" + obj.gender);

        }

    public static void main(String[] args) {
        Person objRam = new Person("Ram",20,"Male");
        Person objSyam = new Person("Syam",30,"Male");
        Person objgeeta = new Person("Geeta",25,"Female");
        objRam.printPersondetails(objRam);

        objSyam.printPersondetails(objSyam);
        objgeeta.printPersondetails(objgeeta);

    }
    }

