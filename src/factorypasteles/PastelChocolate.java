/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypasteles;

/**
 *
 * @author mario
 */
public class PastelChocolate implements Pastel{

    @Override
    public String sabor() {
        return "Chocolate";
    }

    @Override
    public String size() {
        return "Grande";
    }

    @Override
    public int porciones() {
        return 12;
    }
    
    @Override
    public void mostrar() {
        System.out.println("El Cheesecake sabe a "+sabor()+" y es de tamaño "+size()+", además tiene "+porciones()+" porciones.");
    }
}
