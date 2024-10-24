/* 1.
import java.util.Scanner;

public class All{
    public static void main (String[] args){
        System.out.print("pls enter  a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt() ;
        if(a>0){
            System.out.println(a+" 0dan boyukdur");
        }else if(a<0){
            System.out.println(a+ "  0dan kicikdir");
        }else {
            System.out.println(a+" 0a beraberdir  ");
        }
    }
}*/

/* 2.
public class All {
    public static void main(String[] args){
        int a =0;
        for(int i=1 ; i<100; i++){
            if(i%3 ==0){
                a++;
                System.out.println("i"+a +"="+i );

            }
        }




    }
} */


/* 3.
public class All{
    public static void main (String[] args ){
        int sum =0;
        for( int i=1; i<100; i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("the sum is "+ sum  );
    }
}*/

/* 4.
import java.util.Scanner;

public class All {
    public static void main(String[] args){
        int a ;
       do{
           System.out.println("pls enter a number between 1 and 12" );
           Scanner sc= new Scanner(System.in);
            a = sc.nextInt() ;
        } while (a <1 && a>12);
       String s="";
         switch (a){
            case 1 -> s="January ";
            case 2 -> s="February";
            case 3 -> s= " March";
            case 4 -> s=" April";
            case 5 ->  s="May";
            case 6 -> s= "June";
            case 7 ->  s="July";
            case 8 ->  s="August";
            case 9 -> s= "September";
            case 10 ->  s="October";
            case 11 ->  s="November";
            case 12 ->  s= "December";// ama String s= switch (a) yazsaydq mutleq default yazmalisan ki alnsn
        };
        System.out.println("Month -->" + s);
    }
}  */


/* 5.
import java.util.Scanner;
public class All {
    public static void main(String[] args){
        int a ;
        do{
            System.out.print("pls enter a number between 1 and 12" );
            Scanner sc= new Scanner(System.in);
            a = sc.nextInt() ;
        } while (a <1 && a>12);
        switch(a){
            case 1, 2, 12 :
                System.out.println("Qish");break;
            case 3,4,5 :
                System.out.println("Yaz");break;
            case 6,7,8 :
                System.out.println("Yay");break;
            case 9,10,11 :
                System.out.println("Payiz");break;
        }

    }
}*/


/* 6.
import java.util.Scanner;
public class All {
    public static void main(String[] args){
        System.out.print("Pls enter your point");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() ;
        if(a>90 && a<=100){
            System.out.println("A");
        }else if(a>80){
            System.out.println("B");
        }else if(a>70){
            System.out.println("C");
        }else if(a>60){
            System.out.println("D");
        }else if(a>50){
            System.out.println("E");
        } else{
            System.out.println("kesilmisiz");
        }
    }
}*/





/* 7.
public class All {
    public static void main(String[] args){
        int count=0;
        for(int i=1; i<100; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
                count ++;
            }
        }
        System.err.println("the count of these digits is "+ count);
    }
}*/


/*8.
import java.util.Scanner;

public class All {
    public static void main(String[] args){
       int a, sum =0 , count =0;

          do{
              System.out.print("Please enter a random number");
              Scanner scanner = new Scanner(System.in);
               a = scanner.nextInt() ;
               sum+=a;
               count++;
          }while(a != 0);
        System.out.println("The sum of the digits since you enter 0--"+ sum);
        System.out.println("The count of these digits is " + count );
    }
}// */


/*
import java.util.Scanner;

public class All{
    public static void main(String[] args){
        System.out.print("pls enter random number ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt() , sum =0 ;

    while(a>0){
        sum+=a%10 ;
        a=a/10;
    }
        System.out.println("the sum is " + sum);
    }
}*/



/* 1.
public class All {
    public static void main (String[] args ){
        int count =0;
        for(int i =2; i<=100; i++){
            count=0;
       for(int j=1; j<=i; j++){
           if(i%j==0){
               count++;
           }
       }
            if(count ==2){
                System.out.println(i+"--> Sadedir");
            }else{
                System.out.println(i+ "--> Murekkebdir ");
            }

        }

    }
} */

/* 2.
public class All{
public static void main(String[] args) {
    int x=10,y=8;
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("x= "+x + "  y= " +y);
}
        }*/

/* 3.
import java.util.Scanner;

public class All {
    public static void main(String[] args) {
        System.out.println("pls enter two number ");
        System.out.println("first number ");
        Scanner sc= new Scanner(System.in);
        int x1=sc.nextInt() ;
        System.out.println("second number ");
        int x2 =sc.nextInt() ;
        char operator;
        do{
            System.out.println(" Enter operator (+ , -, *, /)");
             operator = sc.next().charAt(0);
        }while(operator !='+' && operator != '-' && operator != '*' && operator != '/' );

        String s= switch(operator){
            case '+' -> {
                yield "x1+x2="+(x1+x2);
            }
            case '-' -> {
               yield  "x1-x2="+(x1-x2);
            }
            case '*' -> {
                yield "x1*x2=" + (x1*x2);
            }
            case '/' ->{
               yield  "x1/x2=" + (x1 / x2);
            }
            default -> "duzgun daxil edilmeyb";
        };
        System.out.println(s);

    }
}*/

/* 4.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.println("enter minutes ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt() , hour, minute  ;
        hour = x/60;
        minute = x%60 ;
        System.out.println("Hour ->" + hour );
        System.out.println("Minute -> " + minute );

    }
}*/

/* 5.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.print("pls enter number ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt() , fac=1;
        for (int i=1 ; i<=x; i++){
            fac= fac*i;
        }
        System.out.println("factorial-> " + fac);

    }
}*/

/* 6.
import java.util.Scanner;

public class All{
    public static void main(String[] args){
        System.out.println("pls enter a random number ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt(), reversed=0,b ;
       while (x>0){
           b=x%10;
           reversed=reversed*10+ b;
           x=x/10;
       }
        System.out.println("reversed number is   " + reversed );

    }
}*/

/* 7.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.print("pls enter a number ");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt() , multiplication ;
        for(int i=0; i<=10; i++){
            multiplication = i*x;
            System.out.println(x +" * " +i + " = " +  multiplication );
        }
    }
}*/

/* 8.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.print("pls enter number");
        Scanner sc=new  Scanner(System.in);
        int a= sc.nextInt(), sum =0, b ;
        while(a != 0){
             b= a%10;
             sum = sum +b;
             a=a/10;
        }
        System.out.println("the sum of digits is " + sum );
    }
}*/
/* 9.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.print("pls enter your age");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt() ;
      if ( a>=0 && a<=12){
          System.out.println("Ushaq ");
      }else if(a>= 13 && a<=30){
          System.out.println("Genc");
      }else if(a >=31 && a<= 59){
          System.out.println(" Yetgin");
      }else {
          System.out.println("Yashli");
      }

    }
}*/
/* 10.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        int a;
        do {
            System.out.print("pls enter month number ");
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
        }while( a<1 || a>12);
        switch(a){
            case 1:
                System.out.println("Yanvar 31");break;
            case 2 :
                System.out.println("fevral 28");break;
            case 3:
                System.out.println("Mart 31");break;
            case 4 :
                System.out.println("April 30");break;
            case 5 :
                System.out.println("May 31");break;
            case 6 :
                System.out.println("June 30");break;
            case 7:
                System.out.println("july 31");break;
            case 8:
                System.out.println("August  31");break;
            case 9:
                System.out.println("September 30");break;
            case 10:
                System.out.println("October 31");break;
            case 11:
                System.out.println("November 31");break;
            case 12:
                System.out.println(" December 31");break;

        }

    }
}*/

/* 11.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.println("pls enter decimal digit ");
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble() ,  kesr ;
        int tam ;
        tam = (int) a/1;
        kesr = a %1;
        System.out.println("Tam = " + tam);
        System.out.println("Kesr= " + kesr);
    }
}*/

/* 12.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        int a, sum=0 ;
        do {
            System.out.print("Ardicil ededleri daxil edin");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            sum+=a;
        }while(sum <= 100);
        System.out.println("Cem oldu --> " + sum );
    }
}*/

/* 13.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.println("pls enter three  digit ");
        Scanner sc= new Scanner(System.in);
        System.out.print("First is");
        int a = sc.nextInt() ;
        System.out.print("Second is");
        int b= sc.nextInt() ;
        System.out.print("Third is ");
        int c= sc.nextInt() ;

        if(a<b && a<c) {
            if(c>a && c> b){
                System.out.println(a +" " +  b +" "+  c );
            }
            if(b>a && b> c){
                System.out.println(a +" " +  c +" "+  b );
            }

        }
        if(b<a && b<c){
            if(a>b & a>c){
                System.out.println(b +" " +  c +" "+  a );
            }
            if(c>a && c> b){
                System.out.println(b +" " +  a +" "+  c);
            }

        }
        if(c<a && c<b){
            if(a>b & a>c){
                System.out.println(c +" " +  b +" "+  a );
            }
            if(b>a && b> c){
                System.out.println(c +" " +  a +" "+  b);
            }
        }

    }
}*/

/* 14.
import java.util.Scanner;

public class All{
    public static void main(String[] args) {
        System.out.print("enter random number ");
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt(), reversedn=0 , b , pa;//pa= previous a
        pa = a;
      while (a != 0){
          b= a%10 ;
          reversedn= reversedn*10 + b;
         a=  a/10;
      }
        System.out.println("The reversed number is "+ reversedn);
       if( reversedn == pa){
           System.out.println("polindromdur");
       }else {
           System.out.println("polindrom deyil ");
       }


    }
}*/

//Star Tasks

/* 1.
public class All{
    public static void main(String[] args) {
        for (int i = 1 ; i<= 5; i++){//setirler
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }//sutunlar
            System.out.println();
        }

    }
}*/

/* 2.
public class All{
    public static void main(String[] args) {
        for (int i = 1 ; i<= 5; i++){//setirler
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }//sutunlar
            System.out.println();
        }
    }
}*/

/* 3.
public class All{
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){//row
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int j= 1; j<i; j++){
                System.out.print("*");
            }
            System.out.print("*");
            for(int j = 1; j<i; j++){
                    System.out.print("*");

            }
            System.out.println();
        }

    }
}*/


/* 4.
public class All{
    public static void main(String[] args) {
        int x=1;
        for (int i = 1; i<= 5; i++){//setir
            for(int j=1; j<=i; j++){//sutun
                System.out.print( x + " ");
                x++;
            }
            System.out.println();
        }

    }
}*/

/* 5.
public class All{
    public static void main(String[] args) {
 for (int i =1; i<=5; i++){//row
     for(int j=1; j<=i; j++){//column
         System.out.print(j);
     }
     System.out.println();
 }


    }
}*/

/* 6.
public class All{
    public static void main(String[] args) {
        for (int i=1;i<=6; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print((i+j)%2 +" " );
            }
            System.out.println();
        }

    }
}*/










