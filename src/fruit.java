//Write a program in Java having three classes Fruit, Banana and Cherry. Class Banana and Cherry are inherited from class Fruit and each class have their own member function show() .
class Fruit {
    void show(){
        System.out.println("FRUIT.");
    }
}
class Banana extends Fruit{
    void show(){
        super.show();
        System.out.println("BANANA.");
    }
}
class Cherry extends Fruit{
    void show(){
        super.show();
        System.out.println("CHERRY.");
    }
}
class FruitDemo{
    public static void main(){
        Cherry obj1=new Cherry();
        Banana obj2=new Banana();
        obj1.show();
        obj2.show();
    }
}