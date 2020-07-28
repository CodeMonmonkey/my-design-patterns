package _10_responsibility_chain;

public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会" + this.name + "审批采购单" + request.getNumber());
        System.out.println("金额：" + request.getAmount());
        System.out.println("采购目的" + request.getPurchase());

    }
}
