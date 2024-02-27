import java.util.Date;

public class Visit {

    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Date date) {
        customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTatalExpense() {
        double serviceRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productRate = DiscountRate.getProductDiscountRate(customer.getMemberType());

        productExpense -= (productExpense*productRate);
        serviceExpense -= (serviceExpense*serviceRate);
        return productExpense+serviceExpense; 
    }

    @Override
    public String toString() {
        return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
                + ", productExpense=" + productExpense + "]";
    }

    
}