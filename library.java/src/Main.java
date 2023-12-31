import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookServiceInterface service=new BookServiceImpl();

       do{
           System.out.println("Welcome to Book Management Application");
           System.out.println("1.Add Book\n"+
                   "2.Show All Books\n"+
                   "3.Show Available Books\n"+
                   "4.Borrow Book\n"+
                   "5.Return Book\n"+
                   "6.Add New User\n"+
                   "7.Show All User\n"+
                   "8.Add New Staff\n"+
                   "9.Show All Staff\n"+
                   "0.Exit\n");

               System.out.println("Enter Your Choice !");
               int ch = sc.nextInt();

           switch (ch){
               case 1:
                   service.addBook();
                   break;
               case 2:
                   service.showAllBooks();
                   break;
               case 3:
                   service.showAllAvailableBooks();
                   break;
               case 4:
                   service.borrowBook();
                   break;
               case 5:
                   service.returnBook();
                   break;
               case 6:
                   service.addUser();
                   break;
               case 7:
                   service.showUser();
                   break;
               case 8:
                   service.addStaff();
                   break;
               case 9:
                   service.showStaff();
                   break;
                   
               case 0:
                   System.out.println("Thank you for Using Application !!");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Please Enter Valid Choice !");

           }
       }
       while(true);
    }
}