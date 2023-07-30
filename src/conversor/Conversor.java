/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author RobertoFlores
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    
    public static double usdToEur(double amountUSD) {
        // Realizar la conversión a Euros (valor ficticio para este ejemplo)
        return amountUSD * 0.85;
    }

    public static double usdToGbp(double amountUSD) {
        // Realizar la conversión a Libras Esterlinas (valor ficticio para este ejemplo)
        return amountUSD * 0.75;
    }

    public static double usdToJpy(double amountUSD) {
        // Realizar la conversión a Yen Japonés (valor ficticio para este ejemplo)
        return amountUSD * 110.0;
    }

    public static double usdToKrw(double amountUSD) {
        // Realizar la conversión a Won sur-coreano (valor ficticio para este ejemplo)
        return amountUSD * 1200.0;
    }

    public static double eurToUsd(double amountEUR) {
        // Realizar la conversión de Euros a USD (valor ficticio para este ejemplo)
        return amountEUR / 0.85;
    }

    public static double gbpToUsd(double amountGBP) {
        // Realizar la conversión de Libras Esterlinas a USD (valor ficticio para este ejemplo)
        return amountGBP / 0.75;
    }

    public static double jpyToUsd(double amountJPY) {
        // Realizar la conversión de Yen Japonés a USD (valor ficticio para este ejemplo)
        return amountJPY / 110.0;
    }

    public static double krwToUsd(double amountKRW) {
        // Realizar la conversión de Won sur-coreano a USD (valor ficticio para este ejemplo)
        return amountKRW / 1200.0;
    }
    
    public static void main(String[] args) {
        
        String[] options = { "Convertir a Euros", "Convertir a Libras Esterlinas", "Convertir a Yen Japonés",
                "Convertir a Won sul-coreano", "Convertir de Euros a USD", "Convertir de Libras Esterlinas a USD",
                "Convertir de Yen Japonés a USD", "Convertir de Won sul-coreano a USD", "No", "Cancelar" };

        while (true) {
            String input = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión:",
                    "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (input == null || input.equals("Cancelar")) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                break;
            } else if (input.equals("No")) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                break;
            } else {
                double result = 0;
                if (input.equals("Convertir a Euros")) {
                    double amountUSD = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
                    result = usdToEur(amountUSD);
                    JOptionPane.showMessageDialog(null, amountUSD + " USD equivale a " + result + " Euros.");
                } else if (input.equals("Convertir a Libras Esterlinas")) {
                    double amountUSD = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
                    result = usdToGbp(amountUSD);
                    JOptionPane.showMessageDialog(null, amountUSD + " USD equivale a " + result + " Libras Esterlinas.");
                } else if (input.equals("Convertir a Yen Japonés")) {
                    double amountUSD = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
                    result = usdToJpy(amountUSD);
                    JOptionPane.showMessageDialog(null, amountUSD + " USD equivale a " + result + " Yen Japonés.");
                } else if (input.equals("Convertir a Won sul-coreano")) {
                    double amountUSD = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en USD:"));
                    result = usdToKrw(amountUSD);
                    JOptionPane.showMessageDialog(null, amountUSD + " USD equivale a " + result + " Won sul-coreano.");
                } else if (input.equals("Convertir de Euros a USD")) {
                    double amountEUR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en Euros:"));
                    result = eurToUsd(amountEUR);
                    JOptionPane.showMessageDialog(null, amountEUR + " Euros equivale a " + result + " USD.");
                } else if (input.equals("Convertir de Libras Esterlinas a USD")) {
                    double amountGBP = Double
                            .parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en Libras Esterlinas:"));
                    result = gbpToUsd(amountGBP);
                    JOptionPane.showMessageDialog(null, amountGBP + " Libras Esterlinas equivale a " + result + " USD.");
                } else if (input.equals("Convertir de Yen Japonés a USD")) {
                    double amountJPY = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en Yen Japonés:"));
                    result = jpyToUsd(amountJPY);
                    JOptionPane.showMessageDialog(null, amountJPY + " Yen Japonés equivale a " + result + " USD.");
                } else if (input.equals("Convertir de Won sul-coreano a USD")) {
                    double amountKRW = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en Won sul-coreano:"));
                    result = krwToUsd(amountKRW);
                    JOptionPane.showMessageDialog(null, amountKRW + " Won sul-coreano equivale a " + result + " USD.");
                }

                int choice = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                }
            }
        }
    }
    
}
