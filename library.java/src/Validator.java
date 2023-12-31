import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static final String RED="\u001B[31m";
    public static final String RESET="\u001B[0m";
    private static Pattern ID_PATTERN = Pattern.compile("^\\d{1,4}$");
    private static Pattern AuthorTitle_Pattern=Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern PublishYear_Pattern=Pattern.compile("^\\d{4}$");
    private static Pattern Phone_Pattern=Pattern.compile("^\\d{10}$");
    private static Pattern Salary_Pattern=Pattern.compile("(?!0$)[0-9]+(?:\\\\.[0-9]+)?");
    Scanner sc = new Scanner(System.in);

    public String validateId() {
        String bookid;
        while (true) {
            System.out.println("Enter Book ID ");
            bookid = sc.nextLine();
            if (!ID_PATTERN.matcher(bookid).matches()) {
                System.out.println(RED+"SORRY ! PLEASE ENTER VALID BOOK ID "+RESET);
            } else {
                break;
            }
        }
        return bookid;
    }
    public String validateAuthorTitle(String input){
        String result;
        while (true){
            if(input=="Title"){
                System.out.println("Enter Title");
            }else{
                System.out.println("Enter Author");
            }
            result=sc.nextLine();
            if(!AuthorTitle_Pattern.matcher(result).matches()){
                System.out.println(RED+"Please Enter Valid "+input+RESET);
            }
            else{
                break;
            }

        }
        return result;
    }
    public String validatePublishYear(){
        String year;
        while(true){
            System.out.println("Enter Publish Year of Book ");
            year=sc.nextLine();
            if(!PublishYear_Pattern.matcher(year).matches()){
                System.out.println(RED+"Enter valid Publish Year"+RESET);
            }
            else{
                break;
            }
        }
        return year;
    }
    
    public String validateUserId() {
        String userid;
        while (true) {
            System.out.println("Enter User ID ");
            userid = sc.nextLine();
            if (!ID_PATTERN.matcher(userid).matches()) {
                System.out.println(RED+"SORRY ! PLEASE ENTER VALID User ID "+RESET);
            } else {
                break;
            }
        }
        return userid;
    }
    
    public String validateUserName(String input){
        String result;
        while (true){
            if(input=="Name"){
                System.out.println("Enter Name");
            }
            result=sc.nextLine();
            if(!AuthorTitle_Pattern.matcher(result).matches()){
                System.out.println(RED+"Please Enter Valid Name"+input+RESET);
            }
            else{
                break;
            }

        }
        return result;
    }
    
    public String validateUserPhone(){
        String phone;
        while(true){
            System.out.println("Enter Phone number of User ");
            phone=sc.nextLine();
            if(!Phone_Pattern.matcher(phone).matches()){
                System.out.println(RED+"Enter valid Phone number"+RESET);
            }
            else{
                break;
            }
        }
        return phone;
    }
    
    public String validateStaffId() {
        String staffid;
        while (true) {
            System.out.println("Enter Staff ID ");
            staffid = sc.nextLine();
            if (!ID_PATTERN.matcher(staffid).matches()) {
                System.out.println(RED+"SORRY ! PLEASE ENTER VALID Staff ID "+RESET);
            } else {
                break;
            }
        }
        return staffid;
    }
    
    public String validateStaffName(String input){
        String result;
        while (true){
            if(input=="Name"){
                System.out.println("Enter Name");
            }
            result=sc.nextLine();
            if(!AuthorTitle_Pattern.matcher(result).matches()){
                System.out.println(RED+"Please Enter Valid "+input+RESET);
            }
            else{
                break;
            }

        }
        return result;
    }
    
    public String validateStaffPhone(){
        String phone;
        while(true){
            System.out.println("Enter Phone number of Staff ");
            phone=sc.nextLine();
            if(!Phone_Pattern.matcher(phone).matches()){
                System.out.println(RED+"Enter valid Phone number"+RESET);
            }
            else{
                break;
            }
        }
        return phone;
    }
    
    public String validateSalary(){
        String salary;
        while(true){
            System.out.println("Enter Salary of Staff");
            salary=sc.nextLine();
            if(!Salary_Pattern.matcher(salary).matches()){
                System.out.println(RED+"Enter valid Salary"+RESET);
            }
            else{
                break;
            }
        }
        return salary;
    }
    
}