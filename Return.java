public class Return {
    public static void main(String[]args){
        System.out.println("Start of program");
        checkNumber(5);
        System.out.println("End of the progrom");
    }
    public static void checkNumber(int num){
        if(num<0){
            System.out.println("Negative number");
            return;
        }
        System.out.println("Positive number or zero");
    }
       
    
}
