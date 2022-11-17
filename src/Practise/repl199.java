package Practise;
import java.util.LinkedHashSet;
import java.util.Iterator;
class repl199 {

    public static void main(String[] args){
        LinkedHashSet<String> myString = new LinkedHashSet();
        myString.add("null");
        myString.add("Sohil");
        myString.add("Diego");
        myString.add("Alijon");
        myString.add("Asel");
        myString.add("Sumair");
        Iterator it = myString.iterator();

        /*for(String str:myString){
            System.out.println(str);
        }*/

        for(int i=0; i<2;i++){
            while(it.hasNext()){
                System.out.println((String)it.next());
            }
        }
    }
}