
class Student{
    String name;
    int Roll;
    String dept;
    int DOB;

    Student(String name,int Roll,String dept, int DOB){
        this.name = name;
        this.Roll = Roll;
        this.dept = dept;
        this.DOB = DOB;

    }

    void displayinfo(){
        System.out.println("name: " + name+"\nRoll "+Roll+"\nDepatment"+dept+"\nDOB"+DOB);
        
    }
    

}