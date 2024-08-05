public class Q6 {
    public static void main(String[] args) {
        String s = "meet me at the clock tower";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            switch(i % 3) {
                case 0:
                    char[] ch = arr[i].toCharArray();
                    for (int j = 0; j < ch.length; j++) {
                        if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                            ch[j] = '%';
                        }
                    }
                    arr[i] = new String(ch);
                    break;
                case 1:
                    char[] r = arr[i].toCharArray();
                    for (int j = 0; j < r.length; j++) {
                        if (r[j] != 'a' && r[j] != 'e' && r[j] != 'i' && r[j] != 'o' && r[j] != 'u') {
                            r[j] = '#';
                        }
                    }
                    arr[i] = new String(r);
                    break;
                default:
                    arr[i] = arr[i].toUpperCase();
                    break;

            }

        }
        for (String i : arr) {
            System.out.print(i+" " );
        }
        
    }
}