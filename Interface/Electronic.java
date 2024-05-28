
public interface Electronic {
boolean onOff = false;
    boolean on();
    boolean off();
    
    default void electronic (){
        if(onOff){
            System.out.println("Default");
        }
    }
}
