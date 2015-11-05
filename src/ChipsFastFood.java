
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class ChipsFastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

//Ask the user for his/her choice of Burger
        System.out.println("Welcome to Chip’s Fast Food Emporium, Please enter a burger choice:");
int Firstnumber = in.nextInt();

if(Firstnumber ==1){
    Firstnumber = 461;
}
    
if(Firstnumber == 2){
    Firstnumber = 431;
}
if(Firstnumber == 3){
    Firstnumber = 420;
}
if(Firstnumber == 4){
    Firstnumber = 0;
}
//Ask the user for his/her choice of Drink
        System.out.println("Please enter a drink choice");
int Secondnumber = in.nextInt();

if(Secondnumber == 1){
    Secondnumber = 130;
}
if(Secondnumber == 2){
    Secondnumber = 160;
}
if(Secondnumber == 3){
    Secondnumber = 118;
}
if(Secondnumber == 4){
    Secondnumber = 0;
}
//Ask the user for his/her choice of Side order
        System.out.println("Please enter a side order choice");
int Thirdnumber = in.nextInt();

if(Thirdnumber == 1){
    Thirdnumber = 100;
}
if(Thirdnumber == 2){
    Thirdnumber = 57;
}
if(Thirdnumber == 3){
    Thirdnumber = 70;
}
if(Thirdnumber == 4){
    Thirdnumber = 0;
}
//Ask the user for his/her choice of Dessert
        System.out.println("Please enter a dessert choice:");
int Fourthnumber = in.nextInt();

if(Fourthnumber == 1){
    Fourthnumber = 167;
}
if(Fourthnumber == 2){
    Fourthnumber = 266;
}
if(Fourthnumber == 3){
    Fourthnumber = 75;
}
if(Fourthnumber == 4){
    Fourthnumber = 0;
}
//Total up the users Calorie amount
        System.out.println("Your total Calorie count is: " + (Firstnumber + Secondnumber + Thirdnumber + Fourthnumber));

    }
}
