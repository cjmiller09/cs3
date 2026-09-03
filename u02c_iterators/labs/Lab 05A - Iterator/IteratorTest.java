import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Iterator;

class IteratorTest {
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
      Iterator<String> it = list.iterator();
      while(it.hasNext()){
         String i = it.next();
         if(i.equals(toRemove)){
            it.remove();
         }
      }
      out.println(list.toString());
   }

}