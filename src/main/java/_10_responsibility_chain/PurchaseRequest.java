package _10_responsibility_chain;

        import lombok.Data;

/**
 * 采购单类
 */
@Data
public class PurchaseRequest {

    private Double amount;//采购金额

    private int number;//采购单编号

    private String purchase;//采购目的

    public PurchaseRequest(Double amount, int number, String purchase) {
        this.amount = amount;
        this.number = number;
        this.purchase = purchase;
    }
}
