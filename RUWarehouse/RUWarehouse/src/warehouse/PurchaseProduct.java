package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile("purchaseproduct.in");
        StdOut.setFile("purchaseproductout.in");

        Warehouse wa = new Warehouse();
        int size = StdIn.readInt();
        for(int i = 0; i < size; i++) {
            String ra = StdIn.readString();

            if(ra.equals("purchase")) {
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int stock = StdIn.readInt();
                wa.purchaseProduct(id, day, stock); 
            } else {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            wa.addProduct(id, name, stock, day, demand);
            }

        }

        StdOut.print(wa.toString());
    }
}
