import java.util.*; 
import java.io.*; 
 
 
 
class Book //Parent class Book extended by Faculty and Student. 
{ 
 void auther()throws IOException , FileNotFoundException     // auther function which shows Auther for different Book. 
{ 
  Book b1 = new Book(); 
 int auth=0; 
 Scanner sc1 = new Scanner(System.in); 
 System.out.println("---------Welcome Now You Can Choose The Book By Number---------"); 
 System.out.println("Auther for CSE are= \n1.. PROGRAMMING IN C by ASHOK N. KAMTHANE,, Pearson Education India  \n2. JAVA THE COMPLETE REFERENCE by HERBERT SCHILDT, MCGRAW HILL EDUCATION \n3. DATA COMMUNICATIONS AND NETWORKING by BEHROUZ FOROUZAN, MCGRAW HILL EDUCATION \n4.PROGRAMMING WITH C++ by D RAVICHANDRAN, MCGRAW HILL EDUCATION \n5. OBJECT ORIENTED PROGRAMMING IN C++ by E BALAGURUSAMY, MCGRAW HILL EDUCATION \n6.. DATA STRUCTURES AND ALGORITHMS by ALFRED V. AHO, JEFFREY D. ULLMAN AND JOHNE. HOPCROFT, PEARSON  \n7. Go to Main Menu"); 
 System.out.println("Enter your Choice in Numeric="); 
 int a2=sc1.nextInt(); 
 if(a2==2) 
   { 
   System.out.println("************\nJava syllabus\n************"); 
   System.out.println("1. Basics of Java \n2. OOPS Conecpts \n3. String Handling \n4. Exception Handling \n5. Nested Classes \n6. Multithreading"); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==1) 
   { 
   System.out.println("************\n C syllbus \n***********"); 
   System.out.println("1. Basics and introduction to C \n2. Control structures and Input/Output functions \n3. User defined functions and Storage classes\n4.Arrays in C \n5. Pointers, Dynamic memory allocation and Strings  \n6. Derived types including structures and unions"); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==3) 
   { 
    System.out.println("************\n NETWORKS SYLLBUS \n***********"); 
   System.out.println("1.NETWORK MODELS \n2.PHYSICAL LAYER: Signal & Media  \n3.DATA LINK LAYER \n4.NETWORK LAYER: IP Addressing  \n5.NETWORK LAYER: Routing  \n6.TRANSPORT LAYER "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==4) 
   { 
       System.out.println("************\n C++ SYLLBUS \n***********"); 
   System.out.println("1.Concepts and Basics of C++ Programming  \n2.Pointers, Reference Variables, Arrays and String Concepts \n3.Constructors, Destructors and File Handling \n4.Operator Overloading and Type Conversion  \n5.Dynamic Memory Management and Polymorphism \n6.Exception Handling, Templates and Standard Template Library (STL) "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==5) 
   { 
       System.out.println("************\n C++ SYLLBUS \n***********"); 
   System.out.println("1.Concepts and Basics of C++ Programming  \n2.Pointers, Reference Variables, Arrays and String Concepts \n3.Constructors, Destructors and File Handling \n4.Operator Overloading and Type Conversion  \n5.Dynamic Memory Management and Polymorphism \n6.Exception Handling, Templates and Standard Template Library (STL) "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==6) 
   { 
    System.out.println("************\n DATA STRUCTURE SYLLBUS\n***********"); 
   System.out.println("1.Intruduction,Array and Sorting and Searching  \n2.Linked Lists  \n3.Stack,Queues and Recursion  \n4.Trees \n5.AVL trees and Heaps \n6.Graph and Hashing "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==7) 
   { 
   } 
   else 
   { 
   System.out.println("Wrong choice Enter again"); 
   b1.auther(); 
   } 
 } 
   void BookName()throws IOException , FileNotFoundException  
   {  
  Book b1 = new Book(); 
 int auth=0; 
 Scanner sc1 = new Scanner(System.in); 
 System.out.println("---------Welcome To Book Nmae ---------"); 
 System.out.println("Auther for CSE are= \n1.. PROGRAMMING IN C  \n2. JAVA THE COMPLETE REFERENCE  \n3. DATA COMMUNICATIONS AND NETWORKING  \n4.PROGRAMMING WITH C++  \n5. OBJECT ORIENTED PROGRAMMING IN C++ \n6.. DATA STRUCTURES AND ALGORITHMS   \n7. Go to Main Menu"); 
 System.out.println("Enter your Choice in Numeric="); 
 int a2=sc1.nextInt(); 
 if(a2==2) 
   { 
   System.out.println("************\nJava syllabus\n************"); 
   System.out.println("1. Basics of Java \n2. OOPS Conecpts \n3. String Handling \n4. Exception Handling \n5. Nested Classes \n6. Multithreading"); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==1) 
   { 
   System.out.println("************\n C syllbus \n***********"); 
   System.out.println("1. Basics and introduction to C \n2. Control structures and Input/Output functions \n3. User defined functions and Storage classes\n4.Arrays in C \n5. Pointers, Dynamic memory allocation and Strings  \n6. Derived types including structures and unions"); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==3) 
   { 
    System.out.println("************\n NETWORKS SYLLBUS \n***********"); 
   System.out.println("1.NETWORK MODELS \n2.PHYSICAL LAYER: Signal & Media  \n3.DATA LINK LAYER \n4.NETWORK LAYER: IP Addressing  \n5.NETWORK LAYER: Routing  \n6.TRANSPORT LAYER "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==4) 
   { 
       System.out.println("************\n C++ SYLLBUS \n***********"); 
   System.out.println("1.Concepts and Basics of C++ Programming  \n2.Pointers, Reference Variables, Arrays and String Concepts \n3.Constructors, Destructors and File Handling \n4.Operator Overloading and Type Conversion  \n5.Dynamic Memory Management and Polymorphism \n6.Exception Handling, Templates and Standard Template Library (STL) "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==5) 
   { 
       System.out.println("************\n C++ SYLLBUS \n***********"); 
   System.out.println("1.Concepts and Basics of C++ Programming  \n2.Pointers, Reference Variables, Arrays and String Concepts \n3.Constructors, Destructors and File Handling \n4.Operator Overloading and Type Conversion  \n5.Dynamic Memory Management and Polymorphism \n6.Exception Handling, Templates and Standard Template Library (STL) "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==6) 
   { 
    System.out.println("************\n DATA STRUCTURE SYLLBUS\n***********"); 
   System.out.println("1.Intruduction,Array and Sorting and Searching  \n2.Linked Lists  \n3.Stack,Queues and Recursion  \n4.Trees \n5.AVL trees and Heaps \n6.Graph and Hashing "); 
   System.out.println("Enter 1 to get Auther for CSE Menu"); 
   auth=sc1.nextInt(); 
   b1.auther(); 
   } 
   else if(a2==7) 
   { 
   } 
   else 
   { 
   System.out.println("Wrong choice Enter again"); 
   b1.auther(); 
   } 
 }
} 
 
 
 
 
class Student extends Book              //Student class extends Book and has addional function required by students. 
{ 
int imc=0; 
public void auther()throws IOException , FileNotFoundException   // syllabus function 
 { 
 user u4 =new user(); 
 Book b2=new Book(); 
 b2.auther(); 
 u4.check3(); 
 } 
 
}

 
 
 
 
class Faculty extends Book     // Faculty class which also extends student and have diif function which needs. 
 { 
public void Auther()throws IOException , FileNotFoundException     // syllabus function. 
 { 
 user u5 =new user(); 
 Book b4=new Book(); 
 b4.auther(); 
 u5.check2(); 
 } 



}
 
 
 
class user    // user class from where are class awake. 
{ 
void check()throws IOException , FileNotFoundException   // check function to get type of login and pass and exit. 
 { 
 Scanner sn1 = new Scanner(System.in); 
 user u1 =new user(); 
 System.out.println("-----------------Type of LOGIN----------------"); 
 System.out.println("Enter \n1. 'Press F for Faculty' for LOGIN \n2. 'Press S for Student' LOGIN \n3. 'exit' if you want to Exit:"); 
 String use=sn1.next(); 
 if(use.equals("F")) 
    { 
       System.out.println("---------------Welcome Faculty--------------"); 
       u1.check2(); 
       } 
       else if(use.equals("S")) 
       { 
       System.out.println("---------------Welcome Student---------------"); 
       u1.check3(); 
       } 
       else if(use.equals("exit")) 
       { 
       System.out.println("---Thank you for Using Book Management System---"); 
       } 
       else 
       { 
       System.out.println("--Wrong Choice Please Try Again--"); 
       u1.check(); 
    } 
 } 
void check2()throws IOException , FileNotFoundException  //check2 function to get and call all functions that Faculty can do. 
 { 
 Scanner sn2 = new Scanner(System.in); 
 user u2 =new user(); 
 Faculty s3 = new Faculty(); 
 System.out.println("Enter 'Faculty' as PASS="); 
 String pass1=sn2.next(); 
 if(pass1.equals("Faculty")) 
   { 
     System.out.println("-------Welcome Now you can enjoy reading...--------"); 
     System.out.println("Yo can search by...="); 
     System.out.println("1. Auther \n2. Book name \n3. Go to Login Page"); 
     System.out.println("Give your Choice by numeric="); 
     int a1=sn2.nextInt(); 
     if(a1==1) 
     { 
     s3.auther(); 
     } 
     else if(a1==2) 
     { 
     s3.BookName(); 
     } 
     else if(a1==3) 
     { 
    u2.check(); 
     } 
    else 
     { 
    System.out.println("Wrong choice You Type PASS again"); 
    u2.check2(); 
     } 
   } 
  else 
  { 
  System.out.println("Wrong PASS Please Try Again"); 
  u2.check2(); 
  } 
 } 
void check3()throws IOException , FileNotFoundException ,InputMismatchException  //check3 function to get and call all function that studnet can do. 
 { 
 Scanner sn3 = new Scanner(System.in); 
 Student s2 = new Student(); 
 user u3 =new user(); 
 System.out.println("Enter 'student' as PASS="); 
 String pass2=sn3.next(); 
 if(pass2.equals("student")) 
   { 
     System.out.println("########  Welcome Student  #######"); 
     System.out.println("Functions You Can Do="); 
     System.out.println("1. Auther \n2. Bookname \n3. Go to Login Page"); 
     System.out.println("Give your Choice by numeric="); 
     int a1=sn3.nextInt(); 
     if(a1==1) 
     { 
     s2.auther(); 
     } 
     else if(a1==2) 
     { 
     s2.BookName(); 
     } 
     else if(a1==3) 
     { 
     u3.check(); 
     } 
     else 
     { 
     System.out.println("Wrong choice You Type PASS again"); 
     u3.check3(); 
     } 
   } 
   else 
   { 
   System.out.println("Wrong PASS Please Try Again"); 
   u3.check3(); 
   } 
 } 
 public static void main(String... aa)throws IOException , FileNotFoundException 
 { 
 Scanner sn3 = new Scanner(System.in); 
 user u =new user(); 
 System.out.println("********-Wellcome to Book Mangement System -**********"); 
 u.check(); 
 } 
}