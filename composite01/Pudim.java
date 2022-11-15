
/**
 * Escreva uma descri��o da classe Pudim aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Pudim extends MenuComponent
{
    public Pudim(){        
    }
    
    public String getName(){
        return "Pudim";
    }
    
    public String getDescription(){
        return "Pudim de leite";
    }
    
    public double getPrice(){
        return 5;
    }
        
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
    }
}