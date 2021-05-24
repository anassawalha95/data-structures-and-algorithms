package RepeatedWord;

import java.util.HashSet;
import java.util.Set;

public
class RepeatedWord {

    public static String repeatedWord(String text){
        text=text.toLowerCase();
        String[] values = text.replaceAll("^[-.,\\s]+", "").split("[-.,\\s]+");
        Set<String> noDublicatesArray = new HashSet<String>();


        if(values.length == 0 || values.length == 1  )
            return "";
        else {

            for (String value: values  ) {
                if (noDublicatesArray.contains(value)) {
                    return value;
                }else
                    noDublicatesArray.add(value);
            }
        }


        return "";
    }

   
}
