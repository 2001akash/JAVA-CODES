class Bill {
    int itemPrice;

    public Bill(int itemPrice) {
        this.itemPrice = itemPrice;

    }

    void display() {

        int itemPrice = 20;
        System.out.print(itemPrice);

    }

}

class Demo {

    public static void main(String[] args) {

        Bill billobj = new Bill(10);

        System.out.print(billobj.itemPrice + "\t");

        billobj.display();
    }
}