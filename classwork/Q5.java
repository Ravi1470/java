public class Q5{

    public static void func(int n){
        if(n==0) return;
        System.out.println(n);
        func(n-1);
    }
    public static void main(String[] args) {
        func(10);
    }
}

// method calling itself is known as method recursion