package _10_responsibility_chain;

public class President extends Approver {

    public President(String name) {
        super(name);
    }
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {//满足条件的话自己处理
            System.out.println("董事长" + this.name + "审批采购单" + request.getNumber());
            System.out.println("金额：" + request.getAmount());
            System.out.println("采购目的" + request.getPurchase());
        } else {
            this.successor.processRequest(request);//不满足条件交给后继处理人
        }
    }
}
