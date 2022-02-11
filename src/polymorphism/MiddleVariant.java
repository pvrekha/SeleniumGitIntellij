package polymorphism;

public class MiddleVariant extends Features implements CommercialTax {

    public void powerwindows() {   // Features as parent class
        System.out.println("Yes");
    }

    public void sunroof() {       // Features as parent class
        System.out.println("No");
    }

    @Override
    public void tax() {    // Abstract method of Interface CommercialTax
        System.out.println("Registration fee for Middle Variant is $2200");
    }
}

