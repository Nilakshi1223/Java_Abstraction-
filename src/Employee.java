abstract class Employee {
    private String name;
    Employee(String name){
        this.name = name;
    }

    public abstract void work();

    public String getName(){
        return name;
    }
}
class SE extends Employee{
    SE(String name){
        super(name) ;
    }

    @java.lang.Override
    public void work() {
        System.out.println( getName() + " working on Tiktok project!");
    }
}
class ITEngineer extends Employee{
    ITEngineer(String name){
        super(name);
    }

    @java.lang.Override
    public void work() {
        System.out.println(getName() + " working on computer issues!");
    }
}
class Text3{
    public static void main(String[] args) {
        Employee e,em ;
        e = new SE("Gawesh");
        em = new ITEngineer("Prabashwara");
        e.work();
        em.work();
    }
}
