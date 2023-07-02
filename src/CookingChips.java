public class CookingChips extends CookingPotato {

    @Override
    public void cutting() {
        System.out.println("Cutting potato for chips.");
    }

    @Override
    public void addSpices() {
        System.out.println("Add some spices for chips.");
    }

    @Override
    public void heatTheArea() {
        System.out.println("Heating a deep fryer.");
    }

    @Override
    public void getOut() {
        System.out.println("Get out chips.");
    }
}