package factorypasteles;

public class Cheesecake implements Pastel{

    @Override
    public String sabor() {
        return "Queso";
    }

    @Override
    public String size() {
        return "Pequeño";
    }

    @Override
    public int porciones() {
        return 8;
    }
    
    @Override
    public void mostrar() {
        System.out.println("El Cheesecake sabe a "+sabor()+" y es de tamaño "+size()+", además tiene "+porciones()+" porciones.");
    }
}
