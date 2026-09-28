public class Opg2ProduktKlasse {
    String name;
    String[] tags;
    double price;

    public Opg2ProduktKlasse(String name, String[] tags, double price){
        this.name = name;
        this.tags = tags;
        this.price = price;
    }

    public void printInfo(){
        System.out.println(name + " - " + price + " kr");
        System.out.print("  Tags: ");
        for(int i=0;i<tags.length;i++){
            System.out.println(tags[i]);
            if(i< tags.length-1){
                System.out.println(", ");
            }
        }
        System.out.println();
    }

    public boolean hasTag(String tag){
        for(String t : tags){
            if(t.equals(tag)){
                return true;
            }
        }
        return false;
    }
}
