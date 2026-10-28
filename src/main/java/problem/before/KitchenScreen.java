package problem.before;

public class KitchenScreen {
    private String message ;
    public KitchenScreen(){
        this.message = "";
    }
    public void show(String message){
        System.out.println("[kitchen] "+message);
    }
}
