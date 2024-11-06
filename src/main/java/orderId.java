public class orderId {
    private String customerName;
    private String productName;
    private Integer quantity;

     public orderId(){
    this.customerName = "";
    this.productName = "";
    this.quantity = "";

}



    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName(){
         return productName;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getQuantity(){
         return quantity;
    }
}
