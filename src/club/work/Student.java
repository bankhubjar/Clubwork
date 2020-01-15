package club.work;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private long id;
    private String faculty;

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
    
    public void subscribe(Club c1){
        if(c1.isOpenStatus()==false){
            System.out.println("CAN'T ENTER CLUB IS FULL");
            return;
        }
    }
    
}
