// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
          Syntax of if statements:
          if (boolean expression T or F){
          //body
          } else
          {
                  //do this
          }



         */

        int salary = 44662;
//        if(salary>50000){
//            salary+=20000;
//        }else {
//            salary+=10000;
//        }

        //MULTIPLE IF ELSE
        if(salary>50000){
            salary+=2000;
        } else if (salary>6000) {
            salary+=3000;
        }else {
            salary+=10000;
        }


        System.out.println(salary);
                }

}