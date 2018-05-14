package factorypasteles;

public class FactoryPasteles {

    public static void main(String[] args) {
        
        Pastel pastel = FabricaPasteles.getPastel(TiposPastel.CHEESECAKE);
        pastel.mostrar();
        
        pastel = FabricaPasteles.getPastel(TiposPastel.CHOCOLATE);
        pastel.mostrar();
        
    }
    
}
