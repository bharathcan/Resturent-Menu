import java.util.Scanner;
class Menu
{ 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("--------Welcome to Restuarent------");
 System.out.println("Select your items from menu");
 System.out.println("Enter 1 for Starters");
 System.out.println("Enter 2 for Main Meals");
 System.out.println("Enter 3 for Drinks");
 String A=sc.nextLine();
 switch(A){
 case "1":
System.out.println("Starters\n");
System.out.println("Enter C for Chicken");
System.out.println("Enter P for prawns");
System.out.println("Enter D for Dragon Chicken\n");
break;
case "2":
 System.out.println("Main Meals");
System.out.println("Enter N for Non-Veg Meals");
System.out.println("Enter V for Veg Meals"); 
break;
case "3":
System.out.println("Drinks");
System.out.println("Enter S for Sprite");
System.out.println("Enter A for Apple Juice");
System.out.println("Enter K for Fanta");
break;
default:
System.out.println("Invalid Option1");}


System.out.println("Select Your items");
String B=sc.nextLine();
switch(B)
{
case "C":
System.out.println("Chicken---------=200");
break;
case "P":
System.out.println("Prawns----------=300");
break;
case "D":
System.out.println("Dragon Chicken---=250");
break;
default:
System.out.println("Invalid Option");}
String Z=sc.nextLine();
switch(Z)
{
case "N":
System.out.println("Non-Veg Meals--------=200");
break;
case "V":
System.out.println("Veg Meals------------=100");
break;
default:
System.out.println("Invalid Option");} 

String C=sc.nextLine();
switch(C)
{
case "B":
System.out.println("Sprite-------------=50");
break;
case "A":
System.out.println("Apple Juice----------=70");
case "K":
break;
case "L":
System.out.println("Fanta----------------=40");
break;
default:
System.out.println("Invalid Option");}


}
}