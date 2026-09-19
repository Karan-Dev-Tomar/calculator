package calculator;
import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        System.out.println("WELCOME TO KARAN'S CALCULATOR");
        while(true){
            float a,c,d;
            char b;
            String e;
            System.out.print("enter your number: ");
            Scanner sc= new Scanner(System.in);
            a=sc.nextInt();
            System.out.print("operator: ");
            Scanner op= new Scanner(System.in);
            b=op.next().charAt(0);
            System.out.print("next number: ");
            Scanner nm= new Scanner(System.in);
            c=nm.nextInt();
            if (b == '+'){
                d=a+c;
                System.out.println((a + c));
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
            else if (b=='-'){
                d=a-c;
                System.out.println(d);
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
            else if (b=='*'|| b=='x'){
                d=a*c;
                System.out.println(d);
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
            else if (b=='/'){
                d=a/c;
                System.out.println(d);
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
            else if(b=='p'){
                d=a/c;
                d=d*100;
                System.out.println(d+"%");
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"||e!="Y"){
                        break;
                    }
            }
            else if (b=='%'){
                d=a%c;
                System.out.println(d);
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
            else{
                System.out.println("invalid input");
                System.out.print("do you want to continue (y/n): ");
                Scanner ou=new Scanner(System.in);
                e=ou.nextLine();
                    if (e!="y"){
                        break;
                    }
            }
        }
    }
}