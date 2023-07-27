package encapsulation;

import javax.swing.*;

public class MainAddition {
    public static void main(String[] args) {
        Addition sum = new Addition();
        sum.setNumb1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: ")));
        sum.setNumb2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: ")));
        JOptionPane.showConfirmDialog(null, "La suma es: " + sum.sumar());
    }
}
