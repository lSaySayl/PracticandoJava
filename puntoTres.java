import javax.swing.JOptionPane;

public class puntoTres

{

    public static void main(String[] args) 
    
    {
       
        String nombre,sexo,estadoC;
        float estatura;
        int edad,c;

        JOptionPane.showMessageDialog(null,"Este es un programa que permite determinar las mujeres solteras, que son mayores de edad y tienen una estatura mayor a 1,80");

        for (c=1;c<=20;c++) 

        {

            nombre = JOptionPane.showInputDialog("Por favor, ingrese el nombre de la persona: ");
            edad =  Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la edad que tiene la persona: "));
            sexo = JOptionPane.showInputDialog("Por favor, ingrese el sexo de la persona (femenino o masculino)");
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese la estatura que tiene la persona: "));
            estadoC = JOptionPane.showInputDialog("Por favor, ingrese el estado civil de la persona (solter@, casad@ o unión libre)");

            if (sexo.equals("femenino") && estadoC.equals("soltera")&& edad >= 18 && estatura > 1.80) {

                JOptionPane.showMessageDialog(null,"El nombre de esta mujer soltera es: " + nombre + ", y es mayor de edad, ya que tiene: " + edad +" años");
            }
        }
        
    }
    
}

