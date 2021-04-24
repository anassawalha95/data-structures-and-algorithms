package utilities;
public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){


        stacksandqueues.Stack Brackets = new stacksandqueues.Stack();

        for (char character: input.toCharArray()   ) {

                if (character =='[' || character =='{' || character =='(') {
                    Brackets.push(character);

                }

                if (character ==']' ){
                    if (Brackets.peek().equals('[')) {
                        Brackets.pop();

                    }else {
                        return false;

                    }
                }
            if (character =='}' ){
                if (Brackets.peek().equals('{')){
                    Brackets.pop();

            }else{

                    return false;
                }

            }
            if (character ==')' ){
                if (Brackets.peek().equals('(')){
                    Brackets.pop();

            }else {

                    return false;
                }


            }



        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        String input= "()[[Extra Characters]]";
        input="{(})";
        System.out.println(multiBracketValidation(input));

    }
}
