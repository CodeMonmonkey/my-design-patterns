package _10_responsibility_chain;

/**
 * 主任类
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 5000) {//满足条件的话自己处理
            System.out.println("主任" + this.name + "审批采购单" + request.getNumber());
            System.out.println("金额：" + request.getAmount());
            System.out.println("采购目的" + request.getPurchase());
        } else {
            this.successor.processRequest(request);//不满足条件交给后继处理人
        }

    }
}
