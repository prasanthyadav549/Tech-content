public abstract class Card {
    private String ccNumber;
    private String ownerName;
    private String cvv;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public abstract void tapAndPay();

    public abstract void internationalPay();

    public abstract void upiPay();
}