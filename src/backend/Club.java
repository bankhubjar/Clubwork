package backend;

import java.util.Scanner;

public class Club {
    private static Scanner sc = new Scanner(System.in);
    private String fullName;
    private String abbName;
    private Student members[];
    private boolean openStatus;
    
    public void create() {
        System.out.print("Enter Your Club's Full Name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter Your Club's Abbreviation Name: ");
        this.abbName = sc.nextLine();
        System.out.print("Enter Your Club's Maximum Number of Members: ");
        this.members = new Student[sc.nextInt()];
        sc.nextLine();
        this.openStatus = true;
        System.out.println(fullName + " Club is successfully created!\n");
    }
    
    public boolean getOpenStatus() {
        return openStatus;
    }
    
    public boolean full() {
        if(members[members.length-1]!=null) {
            System.out.println("Sorry, the club is already full.\n");
            return true;
        }
        return false;
    }
    
    void regis(Student s) {
        if(members[members.length-1]!=null) {
            System.out.println("Sorry, the club is already full.\n");
            return;
        }
        for(int i=0;i<this.members.length;i++) {
            if(members[i]==null) {
                this.members[i]=s;
                if(members[members.length-1]!=null) this.openStatus=false;
                System.out.println("Your Subscription for " + fullName + " Club Is Now Confirmed.\n");
                return;
            } 
        }
    }
    
    void unregis(Student s) {
        for(int i=0;i<this.members.length;i++) {
            if(s.equals(members[i])) {
                members[i] = null;
                for(int j=i;j<this.members.length-1;j++) {
                    if(members[j+1]!=null) {
                        members[j] = members[j+1];
                        members[j+1] = null;
                    }
                }
                System.out.println("Successfully Unsubscribed You from " + fullName + " Club!\n");
                return;
            }
        }
        System.out.println("You've not yet subscribed to this club.\n");
    }
    
    public void listMembers() {
        if(members[0] == null) {
            System.out.println("No Members Yet!");
            return;
        }
        for(int i=0;i<this.members.length;i++) {
            if(members[i]!=null) System.out.println((i+1) + ") " + members[i].getInfo());
        }
    }
    
    public Student findMember(Student s) {
        for(int i=0;i<this.members.length;i++) {
            if(s.equals(members[i])) {
                return members[i];
            }
        }
        return null;
    }
}
