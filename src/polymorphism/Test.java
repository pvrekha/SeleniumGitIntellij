package polymorphism;

public class Test {
    public static void main(String[] args) {
        Features bv=new BasicVariant();
        Features mv= new MiddleVariant();
        Features tv= new TopendVariant();
        bv.airbags();
        mv.powerwindows();
        tv.sunroof();

        CommercialTax mvt = new MiddleVariant();  // Interface name object = new Implementing class name (class name)
        CommercialTax tvt = new TopendVariant();   // Interface name object = new Implementing class name (class name)

         mvt.tax();
         tvt.tax();

    }
}
