/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.work;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
//    private ClubManger cm;
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = 0;
        Club c1 = new Club();
        Student s1 = new Student();
        do{
            choice = menu();
            switch (choice){
                case 1:  
                    c1.create();
                    break;
                case 2:
                    s1.subscribe(c1);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nPlease Select 1-6 ONLY\n");
            }
        }while (choice!=6);
    }
    
    private static int menu(){
        System.out.println("        <<Main Menu>>");
        System.out.println("==============================");
        System.out.println("1. New Club");
        System.out.println("2. Membership Subscribe");
        System.out.println("3. Edit Membership Infromation");
        System.out.println("4. Membership Unsubscribe");
        System.out.println("5. List Members");
        System.out.println("6. Exit");
        System.out.println("==============================");
        System.out.print("Enter Your Menu[1-6] : ");
        int selected = sc.nextInt();
        sc.nextLine();
        return selected;
    }
    
}
