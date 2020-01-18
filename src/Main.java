import backend.Club;
import backend.Student;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Club c = new Club();
        boolean clubCreated = false;
        
        int choice = 0;
        do{
            choice = menu();
            switch (choice){
                case 1:
                    c.create();
                    clubCreated = true;
                    break;
                case 2:
                    if(clubCreated == false) {System.out.println("No Club Yet!"); break;}
                    if(c.full()==true) break;
                    Student tempS = new Student();
                    System.out.print("Enter Your ID: ");
                    tempS.setId(sc.nextLong());
                    sc.nextLine();
                    if(c.findMember(tempS)!=null) {
                        System.out.println("You're already a member of this club!\n");
                        break;
                    }
                    System.out.print("Enter Your First Name: ");
                    tempS.setFirstName(sc.nextLine());
                    System.out.print("Enter Your Last Name: ");
                    tempS.setLastName(sc.nextLine());
                    System.out.print("Enter Your Faculty: ");
                    tempS.setFaculty(sc.nextLine());
                    tempS.subClub(c);
                    break;
                case 3:
                    if(clubCreated == false) {System.out.println("No Club Yet!"); break;}
                    Student tempSS = new Student();
                    System.out.print("Enter Your ID: ");
                    tempSS.setId(sc.nextLong());
                    Student RealSS = c.findMember(tempSS);
                    if(RealSS==null) {
                        System.out.println("No This Member in the Club!\n");
                        break;
                    }
                    RealSS.editInfo();
                    break;
                case 4:
                    if(clubCreated == false) {System.out.println("No Club Yet!"); break;}
                    Student tempSSS = new Student();
                    System.out.print("Enter Your ID: ");
                    tempSSS.setId(sc.nextLong());
                    tempSSS.unsubClub(c);
                    break;
                case 5:
                    if(clubCreated == false) {System.out.println("No Club Yet!"); break;}
                    System.out.println("-------------------------------------------");
                    c.listMembers();
                    System.out.println("-------------------------------------------");
                    System.out.println("Press ANY Key to Return to Main Menu");
                    sc.nextLine();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nPlease Select ONLY 1-6 !\n");
            }
        }while (choice!=6);
    }
    
    private static int menu(){
        System.out.println("         <<Main Menu>>");
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
