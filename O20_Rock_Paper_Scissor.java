package com.company;
import java.util.Random;
import java.util.Scanner;

public class O20_Rock_Paper_Scissor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		System.out.println("\t\t\t\t Rock Paper Scissor Game");
		int n;
		System.out.print("Enter no how may times to play: ");
		n = sc.nextInt();
		System.out.println("1. Rock\n2. Scissor.\n3. Paper.\n");
		System.out.println("SELECT ANY NUMBER ACCORDING TO YOUR SELECTION \n");
		int c;
		int c1=0;
		int u1=0;
		int i=1;
		while(i<=n){
			System.out.println("Match "+i);
			System.out.println("YOUR CHANCE!");
			int u = sc.nextInt();
			System.out.println("COMPUTER CHANCE!");
			c = ran.nextInt(3);
			System.out.println(c);
			System.out.println("   ");
			switch (c){
				case 1:
					switch (u){
						case 1:
							System.out.println("This match is TIE!");
							break;
						case 2:
							System.out.println("Computer WON this match.");
							c1++;
							break;
						case 3:
							System.out.println("Congrats! You WON this match.");
							u1++;
							break;
						default:
							System.out.println("Invalid number try again");
							i--;
					}
					break;
				case 2:
					switch (u){
						case 1:
							System.out.println("Congrates! You WON this match.");
							u1++;
							break;
						case 2:
							System.out.println("This match is TIE!");
							break;
						case 3:
							System.out.println("Computer WON this match.");
							c1++;
							break;
						default:
							System.out.println("Invalid number try again");
							i--;
					}
					break;
				case 3:
					switch (u){
						case 1:
							System.out.println("Computer WON this match.");
							c1++;
							break;
						case 2:
							System.out.println("Congrats! You WON this match.");
							u1++;
							break;
						case 3:
							System.out.println("This match is TIE!");
							break;
						default:
							System.out.println("Invalid number try again");
							i--;
					}
					break;
			}
			i++;
			System.out.println("\n\n");
		}
		System.out.printf("\nYou won %d matches.\nComputer won %d matches.", u1 , c1);

		if(c1<u1){
			System.out.println("\nYou are a WINNER of this game");
		}
		else if(c1>u1){
			System.out.println("\nComputer is a WINNER of this game");
		}
		else if(c1==u1){
			System.out.println("\nThis game is TIE");
		}
	}
}



