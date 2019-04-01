public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] ary = s.split(" ");
      MyDeque<Double> helper = new MyDeque<Double>(ary.length);
      for (int i = 0; i < ary.length; i++){
        //checks if string is = to each operator and performs that operation if necessary
        if (ary[i].equals("+")){
          double a = helper.removeLast();
          double b = helper.removeLast();
          helper.addLast(a + b);
        } else if (ary[i].equals("-")){
          double a = helper.removeLast();
          double b = helper.removeLast();
          helper.addLast(b - a);
        } else if (ary[i].equals("*")){
          double a = helper.removeLast();
          double b = helper.removeLast();
          helper.addLast(a * b);
        } else if (ary[i].equals("/")){
          double a = helper.removeLast();
          double b = helper.removeLast();
          helper.addLast(b / a);
        } else if (ary[i].equals("%")){
          double a = helper.removeLast();
          double b = helper.removeLast();
          helper.addLast(b % a);
        } else {
          helper.addLast(Double.parseDouble(ary[i]));
        }
      }
      return helper.removeLast();
    }
}
