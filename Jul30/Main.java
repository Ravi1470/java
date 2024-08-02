abstract class Animal{
    abstract  void printhello();
}

class Cat extends Animal {
   public void printhello(){
     System.out.println("Cat");
   }
}


public class Main{
     public static void main(String[] args) {
          Animal cat = new Cat();
       

          cat.printhello();
         
     }
}
	
	
	
	


