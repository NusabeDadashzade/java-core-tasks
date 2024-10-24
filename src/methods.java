
/*public class methods {
    public static void main(String[] args) {
        char c= 65;
        System.out.println(c);
    }
}*/
/*
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("enter number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt() ;
        test(a);
    }

    public static void test (int a ){
        for (int i=0; i<=a; i++) {
            System.out.println(i+"-ci salam");
        }
    }
}*/

/*
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("c=");
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        System.out.print("d=");
        int d = sc.nextInt() ;
         int sum =test (c,d);
        System.out.println(sum);
    }
    public static int test (int b, int a){
     return a;
    }
}*/

/* Burda Stringde toplama nece olut ki??
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
       String test = test();
       test = test + " rose ";
        System.out.println(test);
    }

    public static String  test (){
        String s= "i love  ";
        return s;
    }
}*/

/*
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.println("pls enter number ");
        Scanner sc=new Scanner(System.in);
           int a = sc.nextInt() ;
           int x= factorial(a);
        System.out.println(x);
    }
    public static int factorial (int a ){
        if(a == 1){
            return 1;
        }
        return a * factorial ( a-1 ) ;
    }
}*/
/* burda bes meselen 5+4+3+2+1 nece yazdirim consola
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.println("enter random number ");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt() ;
        int sum = sum (a);
        System.out.println(sum );


    }
    public static int sum (int a ){
        if(a == 1){
            return 1;
        }
        return a+ sum (a-1);
    }
}*/
/*
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.println("bir soz daxil edin");
        Scanner sc = new Scanner(System.in);
        String word = sc.next() ;
        String reversednumber = reversedn(word);
        System.out.println(reversednumber );
    }
    public static String reversedn (String  word  ){
        String sum = "";
        for(int i = 0; i<word.length(); i++ ){
            System.out.println(word.charAt(i) );
            sum = sum + word.charAt(i);
        }
        return sum ;
    }
}*/

/* 1. Alinmr
import java.util.Random;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter number ");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt() ;
        int result = random(number);
        System.out.println(result);

    }
    public static int random (int number ){
        for(int i= 1; i<=number ; i++){
            int x;
            Random rnd =new Random();
            if(i==1){
                 x= rnd.nextInt(100);
                return x;
            }else if (i==2){
                x=rnd.nextInt(100) ;
                if(x>=65 && x<=90){
                    char y= (char)x;
                   return y;
                }
            }else if (i==3){
                x=rnd.nextInt(100) ;
                if(x>=97 && x<=122){
                    char y= (char)x;
                    return y;
                }
            }
            else if (i ==4){
                x=rnd.nextInt(100) ;
                if((x>=33 && x<=46) || (x>=58 && x<=64) || (x>=91 && x<=96) || (x>=123 && x<=126) ){
                    char y= (char)x;
                   return y;
                }
            }
            else {
                x= rnd.nextInt(100);
                return x;
            }

        }

    }
}*/

/* 2.
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("enter word ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println("Sait sayi --> " + sait(word));

    }
    public static int sait(String word ){
     int count=0;
        for(int i=0 ; i<word.length(); i++){
            int y= (int ) word.charAt(i);
            if(y ==65 || y== 69 || y==73 || y==79 || y==85 || y==97 || y==101 || y==105 || y==111 || y==117) {
                count++;
            }
        }
        return count ;
    }
}*/

/* 3.
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("please enter word  " );
        Scanner sc= new Scanner(System.in);
        String word = sc.next() ;
        System.err.print("Final word --> " + soz(word));

    }
    public static String soz (String word ){
        String finalw = "";
        for (int i=0; i<word.length(); i++){
            int y= (int ) word.charAt(i);
            if(y ==65 || y== 69 || y==73 || y==79 || y==85 || y==97 || y==101 || y==105 || y==111 || y==117) {
               continue;
            }
            System.out.println(word.charAt(i));
            finalw=finalw + word.charAt(i);
        }


        return finalw;
    }
}*/

/* 4.
import java.util.Locale;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("enter random word ");
        Scanner sc=new Scanner(System.in);
        String word = sc.next() ;
        System.out.println(bn(word));
    }
    public static String bn (String word ){
        String x1=String.valueOf( word.charAt(0));
        String x2 = x1.toUpperCase();
        String sum = x2;
        for (int i= 1; i<word.length(); i++){
            sum+=word.charAt(i);
        }
        return sum ;

    }

} */

/* 5. / sonda basqa reqemde cixir niye????
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter metn");
       Scanner sc=new Scanner(System.in );
       String metn = sc.next();
        System.out.println(reqem(metn));

    }
    public static int reqem (String metn ){
        int r=0 ;
      for(int i= 0; i<metn.length(); i++){
          int ascii = (int) metn.charAt(i);
          if(ascii >= 48 && ascii<=57 ){
              System.out.println((char)metn.charAt(i));
              r=(int)metn.charAt(i);
          }
      }
      return r;
    }


}*///burda return r niye burda yazilib

/* 6.
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter random word ");
        Scanner sc=new Scanner(System.in);
        String word = sc.next();
        System.out.println("The final text  " + sezar(word));
    }
    public static String sezar (String word){
        String sum ="";
        for(int i =0 ; i<word.length(); i++){
            System.out.print(word.charAt(i) +"    ");
            System.out.print((int)word.charAt(i) + "  ");
            int reqem=(int)word.charAt(i);
            int reqem2= reqem-5;
            System.out.print( reqem2);
            char c= (char) reqem2;
            System.out.println("  (" + reqem2+"-nin qarshiligi --> " + c +")");
            sum+=c;

        }
        return sum ;





    }
}*/
//Stringbuilder nedi?? sc.nextline nedi??
/* 7. boyude bilmedim, tekce birlesdirdm
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter sentence  ");
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("birleshmish formasi-->" + ccase(sentence));
    }
    public static String ccase (String sentence){
    String sum="";
    for(int i=0; i<sentence.length(); i++){
        int a =(int) sentence.charAt(i) ;
        if(a==32){
            continue;
        }
        sum+=sentence.charAt(i);
    }
     return sum ;




    }


}/
 */

/* 8.
import java.util.Scanner;

public class methods{
    public static void main(String[] args) {
        System.out.print("pls enter random number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Factorial -->> " + factorial(a));
    }
    public static int factorial (int a){
        if(a==1){
            return 1;
        }
        return a* factorial(a-1);
    }
}*/

/* 1.
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter random word ");
        Scanner sc= new Scanner(System.in);
        String word = sc.next();
        System.out.println("The final number of vowels -->  " + snumber(word ));

    }
    public static int snumber  (String word ){
        int count =0 ;
        for(int i=0; i<word.length(); i++){
            char herf= word.charAt(i);
            int reqem = (int) word.charAt(i) ;
            if(reqem ==65 || reqem == 69 || reqem==73 || reqem==79 || reqem==85 || reqem==97 || reqem==101 || reqem==105 || reqem==111 || reqem==117) {
                System.out.println(herf );
                count ++;
            }


        }
        return count;
    }
}*/
/* 2.
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter random word ");
        Scanner sc= new Scanner (System.in);
        String word =sc.next();
        System.out.println("the final word --> " + word2(word));
    }
    public static String word2 (String word){
        String sum ="";
        for (int i=0; i<word.length(); i++){
            int reqem = (int) word.charAt(i);
            if(reqem ==65 || reqem == 69 || reqem==73 || reqem==79 || reqem==85 || reqem==97 || reqem==101 || reqem==105 || reqem==111 || reqem==117) {
                  continue ;
            }
            System.out.println(word.charAt(i));
            sum+=word.charAt(i);

        }
        return sum ;


    }



}*/

/*
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("pls enter word ");
        Scanner sc=new Scanner(System.in);
        String word = sc.next();
        System.out.println("final word --> " + word2(word));
    }
    public static String word2 (String word){
        String sum= "";
        for(int i = 0; i<word.length(); i++){
            String c = String.valueOf(word.charAt(i));
            if(i==0){
               c= c.toUpperCase();
            }
            sum += c;
        }
        return sum ;
    }
}*/
//1. methodun icinde bashqa method yazmaq olar?
//String c = String.valueOf(word.charAt(i)); bu nedi? stringe char menimsedende yazilir
//Stringbuilder nedi?? sc.nextline nedi?? 1.5.7


import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.println("pls enter sentence ");
        Scanner sc= new Scanner(System.in);
        String sentence = sc.next();
        System.out.println("all  digits in the sentence -->  " + reqem(sentence ));
    }
    public static int reqem (String sentence ){
        int sum =0;
        for(int i=0; i<sentence.length(); i++){
            int reqem = (int) sentence.charAt(i);
            if(reqem>=48 && reqem <= 57){
                System.out.println(sentence.charAt(i));
                sum+=(int)sentence.charAt(i);
            }
        }
        return sum ;
    }
}






