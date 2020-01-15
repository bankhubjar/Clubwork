package club.work;

import java.util.Scanner;

public class Club {
    private String fullName;
    private String abbName;
    private Student members[];
    private boolean openStatus;
    
    public void create() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Club Full Name: ");
        this.fullName = input.nextLine();
        System.out.print("Enter Your Club Abbreviation Name: ");
        this.abbName = input.nextLine();
        System.out.print("Enter Number of Maximum Members: ");
        this.members = new Student[input.nextInt()];
        this.openStatus = true;
        System.out.println(fullName + " Club is successfully created!\n");
    }

    public boolean isOpenStatus() {
        return openStatus;
    }
    

    public void regis(Student s) {
        for(int i=0;i<this.members.length;i++) {
            if(members[i]==null) {
                this.members[i]=s;
                if(members[members.length-1]!=null) this.openStatus=false;
                return;
            } 
        }
    }
}
