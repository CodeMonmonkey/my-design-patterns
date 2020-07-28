package _10_responsibility_chain;

/**
 * 副董事长类
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单" + request.getNumber());
            System.out.println("金额：" + request.getAmount());
            System.out.println("采购目的" + request.getPurchase());
        } else {
            this.successor.processRequest(request);//不满足条件交给后继处理人
        }
    }
}
