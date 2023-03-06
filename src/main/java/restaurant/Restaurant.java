package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Hello world");
        MenueItem item1 = new MenueItem("Salad", "Delicious Greens", 7.99, "Healthy", true);
        MenueItem item2 = new MenueItem("Salad", "Delicious Greens", 7.99, "Healthy", true);
        MenueItem item3 = new MenueItem("Greens", "Delicious Oranges", 8.97, "Healthy", false);
        MenueItem item4 = new MenueItem("veggies", "Delicious Oranges", 7.77);

        System.out.println(item1.equals(item2));
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        System.out.println("\nmy menu");



    }

}
