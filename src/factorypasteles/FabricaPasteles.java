package factorypasteles;

public class FabricaPasteles {
    
    public static Pastel getPastel(TiposPastel tipo){
    
        switch(tipo){
        
            case CHEESECAKE:
                return new Cheesecake();
            case CHOCOLATE:
                return new PastelChocolate();
        
        }    
        
        return null;
    }
    
}
