public class MyTable {
    private final static  int letter = 97;

    private Entry entries = new Entry();

    public String get(char c) {            
        if (c-letter<0 || c-letter>26 ) {
            System.out.println("this char:"+c+" is not a - z");
            return "";
        }
        return entries.keys[c-letter];
    }

 
    public void add(char c, String s) {
      
        if (c-letter<0 || c-letter>26 ) {
            System.out.println("this char:"+c+" is not a - z");
            return ;
        }
        entries.keys[c-letter] = s;
    }


    public String toString() {
              return entries.toString();
    }

    private static class Entry {

        public static String[] keys = new String[26];

        Entry() {

        }

                            
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<keys.length;i++){
                char c = (char)(i+letter) ;
                if (keys[i] == null) continue;
                String temp = c + ">"+keys[i];
                sb.append("\n" +temp);
                if (i!=keys.length-1)
                    sb.append(";");
            }
            return sb.toString();
        }
    }


    public static void main(String arg[]){
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('s', "Segni");
        t.add('l',"Debela");
        

      
        System.out.println("" +t);
    }
}



