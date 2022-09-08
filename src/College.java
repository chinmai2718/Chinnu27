public class College {
    void name()
    {
        System.out.println("welome to mlritm");
    }
}
class Student extends College{
    void branch()
    {
        System.out.println("we all are civil branch");
    }
}
class University extends Student{
    void type()
    {
        System.out.println("we all belongs to autonomous");
    }
}
class TestMultilevel{
    public static void main(String[]args){
        University obj = new University();
        obj.name();
        obj.branch();
        obj.type();
    }
}
