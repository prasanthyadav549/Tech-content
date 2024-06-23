package solid-principles.LSP.problematicCode;

public class RupeeCard extends Card {

    @Override
    public void tapAndPay() {
        System.out.println("tap and  pay");
    }

    @Override
    public void internationalPay() {
        throw new NoSuchMethodException();
    }

    @Override
    public void upiPay() {
        System.out.println("upiPay");
    }
}
