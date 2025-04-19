import java.util.Scanner;

class ClothItem{
    private String name;
    private double price;

    public ClothItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Gents extends ClothItem{
    public Gents(String name, double price){
        super(name, price);
    }

    public void item(){
        int choice;
        int quantity;

        System.out.println("What is your item:");
        System.out.println("1. Shirt");
        System.out.println("2. Trouser");
        System.out.println("3. T-Shirt");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("Enter the quantity:");
        quantity = sc.nextInt();

        double price = 0;
        String itemName = "";

        switch (choice){
            case 1:
                itemName = "Shirt";
                price = calculatePriceForGentsShirt();
                break;
            case 2:
                itemName = "Trouser";
                price = calculatePriceForGentsTrouser();
                break;
            case 3:
                itemName = "T-Shirt";
                price = calculatePriceForGentsTShirt();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        double totalPrice = price * quantity;
        System.out.println("Your total price for " + quantity + " " + itemName + "(s) is Rs." + totalPrice + "/=");
    }

    private double calculatePriceForGentsShirt(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1500;
                break;
            case 2:
                price = 1200;
                break;
            case 3:
                price = 1000;
                break;
            case 4:
                price = 1800;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForGentsTrouser(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 2000; 
                break;
            case 2:
                price = 1800; 
                break;
            case 3:
                price = 1600; 
                break;
            case 4:
                price = 2200; 
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForGentsTShirt(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1200;
                break;
            case 2:
                price = 1000;
                break;
            case 3:
                price = 800;
                break;
            case 4:
                price = 1500;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }
}

class Ladies extends ClothItem{
    public Ladies(String name, double price){
        super(name, price);
    }

    public void item1(){
        int choice;
        int quantity;

        System.out.println("What is your item:");
        System.out.println("1. Shirt");
        System.out.println("2. Trouser");
        System.out.println("3. Blouse");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("Enter the quantity:");
        quantity = sc.nextInt();

        double price = 0;
        String itemName = "";

        switch (choice){
            case 1:
                itemName = "Shirt";
                price = calculatePriceForLadiesShirt();
                break;
            case 2:
                itemName = "Trouser";
                price = calculatePriceForLadiesTrouser();
                break;
            case 3:
                itemName = "Blouse";
                price = calculatePriceForLadiesBlouse();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        double totalPrice = price * quantity;
        System.out.println("Your total price for " + quantity + " " + itemName + "(s) is Rs." + totalPrice + "/=");
    }

    private double calculatePriceForLadiesShirt(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1400;
                break;
            case 2:
                price = 1200;
                break;
            case 3:
                price = 1000;
                break;
            case 4:
                price = 1600;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForLadiesTrouser(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size) {
            case 1:
                price = 1800;
                break;
            case 2:
                price = 1600;
                break;
            case 3:
                price = 1400;
                break;
            case 4:
                price = 2000;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForLadiesBlouse(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1200;
                break;
            case 2:
                price = 1000;
                break;
            case 3:
                price = 800;
                break;
            case 4:
                price = 1400;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }
}

class Kids extends ClothItem{
    public Kids(String name, double price){
        super(name, price);
    }

    public void item1(){
        int choice;
        int quantity;

        System.out.println("What is your item:");
        System.out.println("1. Shirt");
        System.out.println("2. Shorts");
        System.out.println("3. Frock");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("Enter the quantity:");
        quantity = sc.nextInt();

        double price = 0;
        String itemName = "";

        switch (choice){
            case 1:
                itemName = "Shirt";
                price = calculatePriceForKidsShirt();
                break;
            case 2:
                itemName = "Shorts";
                price = calculatePriceForKidsShorts();
                break;
            case 3:
                itemName = "Frock";
                price = calculatePriceForKidsFrock();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        double totalPrice = price * quantity;
        System.out.println("Your total price for " + quantity + " " + itemName + "(s) is Rs." + totalPrice + "/=");
    }

    private double calculatePriceForKidsShirt(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1300;
                break;
            case 2:
                price = 1100;
                break;
            case 3:
                price = 900;
                break;
            case 4:
                price = 1500;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForKidsShorts(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1000;
                break;
            case 2:
                price = 800;
                break;
            case 3:
                price = 600;
                break;
            case 4:
                price = 1200;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForKidsFrock(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size){
            case 1:
                price = 1200;
                break;
            case 2:
                price = 1000;
                break;
            case 3:
                price = 800;
                break;
            case 4:
                price = 1400;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }
}

class Shoes extends ClothItem{
    public Shoes(String name, double price){
        super(name, price);
    }

    public void item1(){
        int choice;
        int quantity;

        System.out.println("What is your item:");
        System.out.println("1. NIKE");
        System.out.println("2. ADIDAS");
        System.out.println("3. FILA");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("Enter the quantity:");
        quantity = sc.nextInt();

        double price = 0;
        String itemName = "";

        switch (choice){
            case 1:
                itemName = "NIKE";
                price = calculatePriceForShoesNIKE();
                break;
            case 2:
                itemName = "ADIDAS";
                price = calculatePriceForShoesADIDAS();
                break;
            case 3:
                itemName = "FILA";
                price = calculatePriceForShoesFILA();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        double totalPrice = price * quantity;
        System.out.println("Your total price for " + quantity + " " + itemName + "(s) is Rs." + totalPrice + "/=");
    }

    private double calculatePriceForShoesNIKE(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size) {
            case 1:
                price = 5000;
                break;
            case 2:
                price = 4000;
                break;
            case 3:
                price = 3000;
                break;
            case 4:
                price = 6000;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForShoesADIDAS(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size) {
            case 1:
                price = 4800;
                break;
            case 2:
                price = 3800;
                break;
            case 3:
                price = 2800;
                break;
            case 4:
                price = 5600;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }

    private double calculatePriceForShoesFILA(){
        int size;
        System.out.println("What is your size: 1. Large 2. Medium 3. Small 4. XL");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        double price = 0;

        switch (size) {
            case 1:
                price = 5200;
                break;
            case 2:
                price = 4200;
                break;
            case 3:
                price = 3200;
                break;
            case 4:
                price = 6200;
                break;
            default:
                System.out.println("Invalid size choice");
        }

        return price;
    }
}

class ClothShop{
    public static void main(String[] args){
        int choice;
        System.out.println("Welcome to Clothzz..");
        System.out.println("What is your choice:");
        System.out.println("1. Gents items");
        System.out.println("2. Ladies items");
        System.out.println("3. Kids section");
        System.out.println("4. Shoes section");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice){
            case 1:
                Gents gents = new Gents("Gents Item", 0); 
                gents.item();
                break;

            case 2:
                Ladies ladies = new Ladies("Ladies Item", 0); 
                ladies.item1();
                break;

            case 3:
                Kids kids1 = new Kids("Kids Item", 0);
                kids1.item1();
                break;

            case 4:
                Shoes shoes = new Shoes("Shoes Item", 0); 
                shoes.item1();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}