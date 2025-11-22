
class  Human
{
    private int age =11;
    private String name ="Naveen"; 

    public int getAge(){
        return age;
      
    
    }

    public void setAge(int age )
{
    this.age = age;
}
public void setName (String name)
{
   this.name = name;
}
    public  String getName(){
        return  name;
    }




}

public class encapsulation {

public static void main(String args[]){

    Human obj = new Human();
    // obj.age = 11;
    // obj.name = "naveen";
obj.setAge(10);
obj.setName("Muruga");
obj.setAge(18);
obj.setName("Naveen");

System.out.println(obj.getName() + ":" + obj.getAge()); 

}
}