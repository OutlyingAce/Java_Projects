package Class_10;

import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname;
        firstname= sc.next();
        firstname = firstname.toLowerCase();
        System.out.println("Enter your last name: ");
        String lastname;
        lastname= sc.next();
        lastname = lastname.toLowerCase();
        System.out.println("Enter your organization: ");
        String org;
        org = sc.next();
        org = org.toLowerCase();
        System.out.println("Enter your mail server of choice: ");
        String server;
        server = sc.next();
        server = server.toLowerCase();
        switch (server){
          case "com":
              System.out.println(firstname+"."+lastname+"@"+org+".com");
                break;
          case "org":
              System.out.println(firstname+"."+lastname+"@"+org+".org");
                break;
            case "edu":
                System.out.println(firstname+"."+lastname+"@"+org+".edu");
            default:
                System.out.println("Not a valid Server.");
                break;
    }
    }
}
