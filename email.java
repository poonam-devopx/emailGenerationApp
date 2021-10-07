package email;

import java.util.Locale;
import java.util.Scanner;

public class email {
        private String firstName;
        private String lastName;
        private String password;
        private int passwordLength=6;
        private String Email;
        private String department;
        private int mailBoxCapacity =1000;
        private String alternateEmail;
        private  String changePassword;
        private  String companySuffix="VRtechniche.in";


    //        Constructor to receive first and last name
        public email(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
//            System.out.println("Email Created "+this.firstName+" "+this.lastName);
//            call a method for department
            this.department=setDepartment();
//            System.out.println("Department is"+this.department);

//            call a method to return random password
            this.password=randomPassword(passwordLength);
//            System.out.println("Your password is"+this.password);

//            combine elements to generate email
            Email =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//            System.out.println("your email is "+email);
        }

//    Ask for the department
        public  String setDepartment(){
            System.out.println("New Worker:" +firstName+ " Department Codes \n1 for sales for development\n2 for Accounting\n3 and for none Enter ur department code:");
            Scanner in = new Scanner(System.in);
            int depChoice=in.nextInt();
            if(depChoice==1){
                return  "sales";
            }
            else if (depChoice==2){
                return  "development";
            }
            else if(depChoice==3){
                return  "Accounts";
            }
            else {
                return  "yet to define";
            }

        }
    //    Generate a random password
        private  String randomPassword(int length){
            String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
            char password[]= new char[length];
            for (int i=0;i<length;i++){
                int rand=(int)(Math.random()*passwordSet.length());
                password[i]=passwordSet.charAt(rand);

            }
            return  new String(password);
        }

//    set the mailbox capacity
    public void setMailBoxCapacity(int Capacity){
            this.mailBoxCapacity=Capacity;
        }

//    set the alternate email

    public void setAlternateEmail(String altemail){
            this.alternateEmail=altemail;
    }
//    change the password
    public  void  setChangePassword(String changepsword){
            this.changePassword=changepsword;
    }

    public  int getMailBoxCapacity(){
            return  mailBoxCapacity;
    }

    public String getAlternateEmail(){
            return alternateEmail;
    }
    public String getPassword(){
            return  "Your password is "+ password;
    }
    public  String showinfo(){
            return  "Display Name: "+firstName+" "+lastName+"\n"+
                    " email is: "  + Email+"\n"+
                    " MailBox Capacity: " +mailBoxCapacity;
    }

}
