package _10_responsibility_chain;

import lombok.Data;

/**
 * 审批者类
 */
@Data
public abstract class Approver {

    protected Approver successor;//后继对象

    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest request);

}
