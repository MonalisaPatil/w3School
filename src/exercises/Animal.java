package exercises;

public class Animal  {

    void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{


    void speak(){
        System.out.println("Dog barkss");
//        super.speak();
    }

//    public static void main(String[] args) {
//        Animal d = new Dog();
//        d.
//    }

}

//class TestMethodOverriding{
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.speak();
//    }
//}
