public class CookingMashed extends CookingPotato{

    @Override
    public void cutting() {
        System.out.println("Cutting potato for mash.");
    }

    @Override
    public void addSpices() {
        System.out.println("Add some spices for mash.");
    }

    @Override
    public void heatTheArea() {
        System.out.println("Heating a pot of water.");
    }

    @Override
    public void getOut() {
        System.out.println("Get out and mash potatoes.");
    }
}