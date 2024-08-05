public class Q1 {
    public static void main(String[]args){
        String s = "maharashtra";
        char[] ch = s.toCharArray();
        boolean[] b= new boolean[ch.length];
        for (int i = 0; i<b.length; i++) {
            if(b[i]==false){
                int count=1;
                for(int j=i+1;j<b.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        b[j]=true;
                    }
                }
                System.out.println(ch[i]+"="+count);

            }
        }

    }
}
