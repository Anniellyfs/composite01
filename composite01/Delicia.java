public class Delicia extends MenuComponent
{
    public Delicia(){        
    }
    
    public String getName(){
        return "Delicia";
    }
    
    public String getDescription(){
        return "Delicia de Abacaxi";
    }
    
    public double getPrice(){
        return 10;
    }
        
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}