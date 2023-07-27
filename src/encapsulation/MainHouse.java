package encapsulation;

import javax.swing.*;

public class MainHouse {
    public static void main(String[] args) {
        House house = new House();
        house.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección de la casa: "));
        house.setPropietario(JOptionPane.showInputDialog("Ingrese el nombre del propietario: "));
        house.setNumeroAlcobas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alcobas")));
        JOptionPane.showConfirmDialog(null, "Nombre del prpietario: " + house.getPropietario() + " \nDirección de la casa: " + house.getDireccion() + " \nNumero de alcobas: " + house.getNumeroAlcobas());
    }
}
