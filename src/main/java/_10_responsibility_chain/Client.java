package _10_responsibility_chain;

public class Client {
    public static void main(String[] args) {
        Director director = new Director("主任");
        VicePresident vicePresident = new VicePresident("副董事长");
        President president = new President("董事长");
        Congress congress = new Congress("董事会");

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        PurchaseRequest purchaseRequest01 = new PurchaseRequest(9000.0, 01, "购买电脑");
        PurchaseRequest purchaseRequest02 = new PurchaseRequest(300.0, 02, "购买香蕉");
        PurchaseRequest purchaseRequest03 = new PurchaseRequest(100000.0, 03, "购买汽车");

        director.processRequest(purchaseRequest01);
        director.processRequest(purchaseRequest02);
        director.processRequest(purchaseRequest03);
    }
}
