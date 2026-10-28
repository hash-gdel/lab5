package problem.before;

public class SmsSender {
    private String customer ;
    private String message;
    public SmsSender(){
        this.customer = "" ;
        this.message ="";
    }
    public String getCustomer(){
        return this.customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void send(String customer , String message){
        System.out.println("[sms to "+customer+" ] :"+message);
    }
}
