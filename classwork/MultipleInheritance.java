interface Mother{
   public  void pocketMoney1();
}
interface Father{
   public  void pocketMoney2();

}

class Money implements Mother,Father{
   public  void pocketMoney1(){
        System.err.println("mom gives 50 rupees");
    }
   public void pocketMoney2(){
        System.err.println("father gives 100 rupees");
    }
}

public  class MultipleInheritance{
    public static void main(String[] args) {
        Father father = new Money();
        Mother mother = new Money();

        father.pocketMoney2();
        mother.pocketMoney1();

        
    }
}
