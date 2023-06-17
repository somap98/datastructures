package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproductout.in");

        Warehouse wa = new Warehouse();
        int size = StdIn.readInt();
        for(int i = 0; i < size; i++) {
            String ra = StdIn.readString();

            if(ra.equals("delete")) {
            int id = StdIn.readInt();
            wa.deleteProduct(id);
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
