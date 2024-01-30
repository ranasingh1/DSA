import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

/*
    /* Reverse a String * /
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a word to be reversed");
        String word  = input.nextLine();
        String reverse = "";


        for (int i = word.length()-1; i>=0; i--) {

            reverse += word.charAt(i);
        }
        System.out.println("Reversed word:" +reverse);
    }
 //Vowel or consonant
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Char");
    String str = input.nextLine();
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

    }
}
//Vowel or consonant in String
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = input.nextLine();
    int vowel=0, cons = 0;
    StringBuilder vowels = new StringBuilder();
    StringBuilder consonants = new StringBuilder();
        str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            vowel++;
            vowels.append(c);
        }else {
            cons++;
            consonants.append(c);
        }

    }
        System.out.println("The vowels in string are \""+vowels+ "\" and number of vowels in string:" +vowel);
        System.out.println("The Consonants in string is \""+consonants+"\" and number of consonants in string:" +cons);

    }
*/
//    //Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//              public static void main(String[] args) {
//
//                     int days = 31;
//                     int count = 0;
//                  for (int i = 0; i <= days; i++) {
//                      if(i%2==0){
//                          count++;
//                      };
//
//                  }
//                  System.out.println("Kunal is allowed " +count+ "days");
//                     }


}