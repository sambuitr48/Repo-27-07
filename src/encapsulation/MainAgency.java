package encapsulation;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del inmueble: ")));
        agency.setAddress(JOptionPane.showInputDialog("Ingrese la dirección del inmuebble: "));
        agency.setAgentName(JOptionPane.showInputDialog("Ingrese el nombre de la agencia: "));
        JOptionPane.showConfirmDialog(null, "nombre de la agencia " + agency.getAgentName());
    }
}
