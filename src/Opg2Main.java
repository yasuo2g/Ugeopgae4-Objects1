public class Opg2Main {
    public static Opg2ProduktKlasse findMostExpensiveProduct(Opg2ProduktKlasse[] products){
        Opg2ProduktKlasse mostExpensive = products[0];
        for(Opg2ProduktKlasse p : products){
            if(p.price > mostExpensive.price){
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    public static void findProductsInPriceRange(Opg2ProduktKlasse[] products, double min, double max){
        System.out.println("Produkter mellem " + min + " og " + max + " kr:");
        for(Opg2ProduktKlasse p : products){
            if(p.price >= min && p.price <= max){
                p.printInfo();
            }
        }
    }

    public static void main(String[] args){
        Opg2ProduktKlasse p1 = new Opg2ProduktKlasse("Laptop", new String[]{"electronics", "new"}, 5999);
        Opg2ProduktKlasse p2 = new Opg2ProduktKlasse("Mouse", new String[]{"electronics", "sale"},  199);
        Opg2ProduktKlasse p3 = new Opg2ProduktKlasse("Keyboard", new String[]{"electronics", "sale"}, 499);
        Opg2ProduktKlasse p4 = new Opg2ProduktKlasse("Monitor", new String[]{"electronics"},  2499);

        Opg2ProduktKlasse[] products = {p1, p2, p3, p4};

        System.out.println("Produkter på tilbud:");
        for(Opg2ProduktKlasse p : products){
            if(p.hasTag("sale")){
                p.printInfo();
            }
        }

        System.out.println("\nDyreste produkt:");
        Opg2ProduktKlasse expensive = findMostExpensiveProduct(products);

        // Ekstra udfordring
        System.out.println();
        findProductsInPriceRange(products, 200, 1000);
    }
}
