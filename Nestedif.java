public class Nestedif {
    public static void main(String[]args){
        int marks = 84;
        if(marks>= 50){
            System.out.println("You passed the exam.");

            if(marks>=90){
                System.out.println("Grade:A+");
            }else if(marks>=75){
                System.out.println("Grade: B");
            }
        }else{
            System.out.println("You failed the exam.");
        }
    }
    
}

// import java.util.*;
// public class Nestedif {
//     public static void main(String[]args){
        
//         if(marks>= 50){
//             System.out.println("You passed the exam.");

//             if(marks>=90){
//                 System.out.println("Grade:A+");
//             }else if(marks>=75){
//                 System.out.println("Grade: B");
//             }
//         }else{
//             System.out.println("You failed the exam.");
//         }
//     }
    
// }