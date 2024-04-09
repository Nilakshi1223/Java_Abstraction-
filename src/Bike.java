public abstract class Bike {
    Bike(){
        System.out.println("Bike is working!");
    }

    public abstract void ride();

    public void changeGear(){
        System.out.println("Gear Change to 4!");
    }
}

class CBHornet extends Bike{
    @java.lang.Override
    public void ride() {
        System.out.println("Running Selfy!");
    }
}

class Text1 {
    public static void main(String[] args) {
        Bike b = new CBHornet();
        b.ride();
        b.changeGear();
    }
}