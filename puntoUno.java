
import javax.swing.JOptionPane;

public class puntoUno

{

    public static void main(String[] args)
    
    {
        String nombre="";
        String n1="", n2="", n3="", n4="", n5="", n6="", n7="", n8="", n9="", n10=""; 
        float salarioB1=0, salarioB2=0, salarioB3=0, salarioB4=0, salarioB5=0, salarioB6=0, salarioB7=0, salarioB8=0, salarioB9=0, salarioB10=0;
        float salarioN1=0, salarioN2=0, salarioN3=0, salarioN4=0, salarioN5=0, salarioN6=0, salarioN7=0, salarioN8=0, salarioN9=0, salarioN10=0;
        float SalarioH=0, horasT=0, salarioB=0, salarioN=0, totalB=0, totalD=0;
        int c;
        
     
        for (c=1;c<=2;c++)
        
        {

            JOptionPane.showMessageDialog(null," Por favor, ingrese los datos del trabajador numero " + c + ":");
            nombre = JOptionPane.showInputDialog("Por favor, ingrese el nombre del trabajador: ");
            SalarioH = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el salario básico por hora del trabajador: "));
            horasT = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el salario básico por hora del trabajador: "));
            totalB = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el salario básico por hora del trabajador: "));
            totalD = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el salario básico por hora del trabajador: "));

            
            salarioB=SalarioH*horasT;
            salarioN=salarioB+totalB-totalD;
            
            
            switch (c) {
                case 1:
                    n1=nombre;
                    salarioB1=salarioB;
                    salarioN1=salarioN;
                    break;
                case 2:
                    n2=nombre;
                    salarioB2=salarioB;
                    salarioN2=salarioN;
                    break;
                case 3:
                    n3=nombre;
                    salarioB3=salarioB;
                    salarioN3=salarioN;
                    break;
                case 4:
                    n4=nombre;
                    salarioB4=salarioB;
                    salarioN4=salarioN;
                    break;
                case 5:
                    n5=nombre;
                    salarioB5=salarioB;
                    salarioN5=salarioN;
                    break;
                case 6:
                    n6=nombre;
                    salarioB6=salarioB;
                    salarioN6=salarioN;
                    break;
                case 7:
                    n7=nombre;
                    salarioB7=salarioB;
                    salarioN7=salarioN;
                    break;
                case 8:
                    n8=nombre;
                    salarioB8=salarioB;
                    salarioN8=salarioN;
                    break;
                case 9:
                    n9=nombre;
                    salarioB9=salarioB;
                    salarioN9=salarioN;
                    break;
                case 10:
                    n10=nombre;
                    salarioB10=salarioB;
                    salarioN10=salarioN;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n1+", tiene un salario bruto de: "+salarioB1+", y un salario neto de: "+salarioN1);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n2+", tiene un salario bruto de: "+salarioB2+", y un salario neto de: "+salarioN2);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n3+", tiene un salario bruto de: "+salarioB3+", y un salario neto de: "+salarioN3);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n4+", tiene un salario bruto de: "+salarioB4+", y un salario neto de: "+salarioN4);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n5+", tiene un salario bruto de: "+salarioB5+", y un salario neto de: "+salarioN5);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n6+", tiene un salario bruto de: "+salarioB6+", y un salario neto de: "+salarioN6);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n7+", tiene un salario bruto de: "+salarioB7+", y un salario neto de: "+salarioN7);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n8+", tiene un salario bruto de: "+salarioB8+", y un salario neto de: "+salarioN8);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n9+", tiene un salario bruto de: "+salarioB9+", y un salario neto de: "+salarioN9);
        JOptionPane.showMessageDialog(null,"El trabajador con nombre "+n10+", tiene un salario bruto de: "+salarioB10+", y un salario neto de: "+salarioN10);        
    }   
}
