package solid-principles.LSP.problematicCode;

public class MasterCard extends Card {

    @Override
    public void tapAndPay() {
        System.out.println("tap and  pay");
    }

    @Override
    public void internationalPay() {
        System.out.println("international pay");
    }

    @Override
    public void upiPay() {
        throw new NoSuchMethodException();
    }

}
