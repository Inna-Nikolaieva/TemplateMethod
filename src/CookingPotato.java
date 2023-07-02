public abstract class CookingPotato {

    public void Cooking(){
        cleaning();
        cutting();
        addSpices();
        heatTheArea();
        getOut();
        serve();
    }

    public  void cleaning(){
        System.out.println("Washing potatoes.");
    }
    public abstract void cutting();
    public abstract void addSpices();
    public abstract void heatTheArea();
    public abstract void getOut();
    public void serve(){
        System.out.println("Serve a potato dish.");
    }
}