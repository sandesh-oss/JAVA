class Student{
    String name  = "don";
    int sum(int a,int b){
        //System.out.println(a+b);
        return a+b;
    }
}
class hello{
    public static void main(String[] args){
        Student obj =  new Student();
        //Student obj1 = new Student();
        System.out.println(obj.name);
        System.out.println(obj.sum(5,4));
    }
}