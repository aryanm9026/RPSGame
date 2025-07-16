package com.company;
import java.util.Scanner;
import java.util.Random;

public class RPSGame
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println();
        System.out.println(" Welcome ! This is a rock , paper & scissor game. ");
        System.out.println();
        System.out.println(" ROUND 1");
        System.out.println();
        Random comp= new Random();
        Scanner user= new Scanner(System.in);
        System.out.print("Enter your choice between Rock(0) , Paper(1) & Scissor(2) : ");
        int x,y,z;
        x=0;
        y=0;
        z=0;

        int a=user.nextInt();
        int b=comp.nextInt(3);
        if(b==0)
        {
            System.out.println("Computer chose \'Rock\' !");
        }
        else if(b==1)
        {
            System.out.println("Computer chose \'Paper\' !");
        }
        else
        {
            System.out.println("Computer chose \'Scissor\'");
        }
        if(a==b)
        {
            System.out.println("It's a tie !");
            x=0;
        }
        else if (a==0 && b==1)
        {
            System.out.println("You lose !");
            x=1;
        }
        else if (a==1 && b==2)
        {
            System.out.println("You lose !");
            x=1;
        }
        else if (a==2 && b==0)
        {
            System.out.println("You lose !");
            x=1;
        }
        else if (a==0 && b==2)
        {
            System.out.println("You win !");
            x=10;
        }
        else if (a==1 && b==0)
        {
            System.out.println("You win !");
            x=10;
        }
        else if (a==2 && b==1)
        {
            System.out.println("You win !");
            x=10;
        }
        System.out.println();
        System.out.println(" ROUND 2");
        System.out.println();
        System.out.print("Enter your choice between Rock(0) , Paper(1) & Scissor(2) : ");
        int c=user.nextInt();
        int d=comp.nextInt(3);
        if(d==0)
        {
            System.out.println("Computer chose \'Rock\' !");
        }
        else if(d==1)
        {
            System.out.println("Computer chose \'Paper\' !");
        }
        else
        {
            System.out.println("Computer chose \'Scissor\'");
        }
        if(c==d)
        {
            System.out.println("It's a tie !");
            y=0;
        }
        else if (c==0 && d==1)
        {
            System.out.println("You lose !");
            y=1;
        }
        else if (c==1 && d==2)
        {
            System.out.println("You lose !");
            y=1;
        }
        else if (c==2 && d==0)
        {
            System.out.println("You lose !");
            y=1;
        }
        else if (c==0 && d==2)
        {
            System.out.println("You win !");
            y=10;
        }
        else if (c==1 && d==0)
        {
            System.out.println("You win !");
            y=10;
        }
        else if (c==2 && d==1)
        {
            System.out.println("You win !");
            y=10;
        }
        System.out.println();
        System.out.println(" ROUND 3");
        System.out.println();
        System.out.print("Enter your choice between Rock(0) , Paper(1) & Scissor(2) : ");
        int e=user.nextInt();
        int f=comp.nextInt(3);
        if(f==0)
        {
            System.out.println("Computer chose \'Rock\' !");
        }
        else if(f==1)
        {
            System.out.println("Computer chose \'Paper\' !");
        }
        else
        {
            System.out.println("Computer chose \'Scissor\'");
        }
        if(e==f)
        {
            System.out.println("It's a tie !");
            z=0;
        }
        else if (e==0 && f==1)
        {
            System.out.println("You lose !");
            z=1;
        }
        else if (e==1 && f==2)
        {
            System.out.println("You lose !");
            z=1;
        }
        else if (e==2 && f==0)
        {
            System.out.println("You lose !");
            z=1;
        }
        else if (e==0 && f==2)
        {
            System.out.println("You win !");
            z=10;
        }
        else if (e==1 && f==0)
        {
            System.out.println("You win !");
            z=10;
        }
        else if (e==2 && f==1)
        {
            System.out.println("You win !");
            z=10;
        }
        System.out.println();
        int p=x+y+z;
        if(p==30 || p==20 || p==21 || p==10)
        {
            System.out.println("Congratulations ! You won the game ;)");
        }
        else if(p==12 || p==3 || p==2 || p==1)
        {
            System.out.println("Ahh ! You lost. Try again :(");
        }
        else
        {
            System.out.println("Ohh damn ! It's a tie.");
        }
        System.out.println();
        System.out.println("Thanks for using our game !");
        System.out.println("Click the run button for another game.");
    }
}
