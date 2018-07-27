package Expll01h.Abean;
 
import java.beans.*;
 
public class Expll01sMntExamPaperLogWsExpll01LogisticsOptionPropertyEditor extends PropertyEditorSupport {
 
   public String[] getTags() {
      String values[] = {
         "B",
         "C",
         "D",
         "A",
         "E",
         " ",
      };
      return values;
   }

   public boolean checkTag(String s) {
      String values[] = getTags();
      StringBuffer temp = new StringBuffer(s);
      while (temp.length() < 1)
         temp.append(' ');
      s = temp.toString();
      for(int n=0; n< values.length; n++) {
         if (s.compareTo(values[n]) == 0) {
            return true;
         }
      }
      return false;
   }
}
