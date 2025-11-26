

class FirstClass{

    public  void show(){
        System.out.println("Hello Java");
    }
}
class SecondClass extends FirstClass{
     public  void show(){
        System.out.println("Hello Python");
    }

}

public class Polymorphism {
    
public static void main(String[] args) {
    
FirstClass obj = new FirstClass();
obj.show();

obj = new SecondClass();
obj.show();

}
}

