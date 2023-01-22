import javax.swing.JOptionPane;

public class puntoDos

{
    public static void main(String[] args)
    
    {

        String nombreA,lineaA;
        float precioU,valorBruto,iva = 0,valorI,valorN;
        int cantidadA,cantidadVentas,c;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de ventas: "));

        for (c=1; c<=cantidadVentas;c++)
        
        {
            JOptionPane.showMessageDialog(null,"Esta es la venta numero "+c);

            nombreA = JOptionPane.showInputDialog(null,"Por favor, ingrese el nombre del artículo");

            lineaA = JOptionPane.showInputDialog(null,"Por favor, ingrese la línea del artículo (alimento, ferretería,vestidos o electrodoméstico");

            precioU = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el precio de la unidad que tiene este artículo"));

            cantidadA = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de artículos vendidos"));

            valorBruto = precioU * cantidadA;

             
            if (lineaA.equals("alimento")) {
                iva= (float) 0.04;
            }
            else if (lineaA.equals("ferretería")) {
                iva=(float) 0.19;
            }
            else if (lineaA.equals("vestidos")) {
                iva=(float) 0.15;
            }
            else if (lineaA.equals("electrodoméstico")) {
                iva=(float) 0.22;
            }

            valorI = valorBruto*iva;
            valorN = valorBruto + valorI;

            JOptionPane.showMessageDialog(null,"Esta es la venta numero "+c);
            JOptionPane.showMessageDialog(null,"El artículo que fue comprado es: " + nombreA);
            JOptionPane.showMessageDialog(null,"El valor bruto es: "+valorBruto);
            JOptionPane.showMessageDialog(null,"El valor neto es: "+valorN);

        }

    }

}
