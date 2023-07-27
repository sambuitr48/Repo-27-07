package encapsulation;

import javax.swing.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName(JOptionPane.showInputDialog("Ingrese el nombre"));
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")));
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

