package encapsulation;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Ingrese la placa:"));
        car.setColor(JOptionPane.showInputDialog("Ingrese el color del vehículo: "));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehículo")));
        JOptionPane.showConfirmDialog(null, car.getPlate());
    }
}
