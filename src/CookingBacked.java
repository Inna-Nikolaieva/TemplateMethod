public class CookingBacked extends CookingPotato{

    @Override
    public void cutting() {
        System.out.println("Cutting potato into pieces for bake.");
    }

    @Override
    public void addSpices() {
        System.out.println("Add some spices for backed potato.");
    }

    @Override
    public void heatTheArea() {
        System.out.println("Preheating a oven.");
    }

    @Override
    public void getOut() {
        System.out.println("Get out backed potatoes.");
    }
}
