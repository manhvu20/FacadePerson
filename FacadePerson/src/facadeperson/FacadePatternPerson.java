package facadeperson;

import java.util.Scanner;

public class FacadePatternPerson {
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = myObj.nextLine();
        System.out.print("Enter your address: ");
        String address = myObj.nextLine();
        
        PersonInfor p = new PersonInfor(name, phone, address);
        p.displayPersonInfor();
        myObj.close();
    }
}

