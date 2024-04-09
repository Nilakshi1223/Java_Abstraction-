abstract class CentralBank {
    abstract int vat();
}
class HNB extends CentralBank{
    @java.lang.Override
    int vat() {
        return 18;

    }
}

class Seylon extends CentralBank{
    @java.lang.Override
    int vat() {
        return 18;
    }
}
class Test2{
    public static void main(String[] args) {
        CentralBank cb;
        cb = new HNB();
        System.out.println("VAT : - " + cb.vat());
        cb = new Seylon();
        System.out.println("VAT : - " + cb.vat());
    }
}
