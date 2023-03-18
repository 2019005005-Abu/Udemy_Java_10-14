  import java.util.*;
  class Rifat {
    public static void main(String[] args) {
     System.out.println("Rifat");   
     double a=1.0;
     double b=2.90;
     double c=6.89;
     double d=78.8;
     boolean b1=a==b;
     String n="Abu Al Shahriar Rifat";
     String n1="bangladesh";
     System.out.println(b1);
     System.out.println(n);
     boolean comparing=n1==n;
     System.out.println(comparing);
     boolean comparing_2x=(a>b && c>d);
     System.out.println(comparing_2x);

     //using if and if else
     double a1=1;
     double a2=2;
     double a3=3;
     if(a1<a2 && a1<a3){
        System.out.println(a1);
     }else if(a1>a2 && a2>a3){
        System.out.println(a2);
     }else{
        System.out.println(a3);
     }
     Scanner input=new Scanner(System.in);
    System.out.println("Enter Your Name");
    String name=input.next();
    System.out.println("My Name is "+name);
    if(name.equals("Rifat")){
      System.out.println("Are you a student of a job holder");
      String ans=input.next();
      if(ans.equals("yes")){
        System.out.println("Thanks for your ans");
      }
    }else{
        System.out.println("Have a Nice day"+name);
    }

    
    }
}