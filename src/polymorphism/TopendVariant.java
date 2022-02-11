package polymorphism;

public class TopendVariant extends Features implements CommercialTax{


    @Override
    public void powerwindows() {     // Features as parent class
        System.out.println("Yes");
    }

    @Override
    public void sunroof() {        // Features as parent class
        System.out.println("Yes");
    }

    @Override
    public void tax() {    // Abstract method of Interface CommercialTax
        System.out.println("Registration fee is $2500");
    }
}

