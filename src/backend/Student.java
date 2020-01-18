package backend;

import java.util.Scanner;

public class Student {
    private static Scanner sc = new Scanner(System.in);
    private long id;
    private String firstName;
    private String lastName;
    private String faculty;

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public void subClub(Club c) {
        c.regis(this);
    }
    
    public void unsubClub(Club c){
        c.unregis(this);
    }
    
    public void editInfo() {
        String temp;
        System.out.print("Enter Your Full Name (Leave Blank If Unchanged!): ");
        temp = sc.nextLine();
        if(!"".equals(temp)) this.firstName = temp;
        System.out.print("Enter Your Last Name (Leave Blank If Unchanged!): ");
        temp = sc.nextLine();
        if(!"".equals(temp)) this.lastName = temp;
        System.out.print("Enter Your Faculty (Leave Blank If Unchanged!): ");
        temp = sc.nextLine();
        if(!"".equals(temp)) this.faculty = temp;
        System.out.println("Dear " + firstName + " " + lastName + " (" + faculty + ")" + ", Your Info Has Been Updated!\n");
    }
    
    String getInfo() {
        return "ID:" + id + " Name:" + firstName + " " + lastName + " Faculty:" + faculty;
    }
}
