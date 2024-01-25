/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4_melvinrivas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author l3306
 */
public class Tarea4_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList <Mascota> mas = new ArrayList<>();
        int op = 0;
          do {
              
              System.out.println("Bienvenido al gestionador de mascotas");
              System.out.println("1. Agregar una mascota");
              System.out.println("2. Listar mascotas");
              System.out.println("3. Editar mascota");
              System.out.println("4. Borra mascota");
              System.out.println("5. Salir");
              System.out.print("Que desea realizar: ");
              op = input.nextInt();
              switch (op) {
                  case 1: {
                      System.out.print("Ingrese el nombre de su mascota: ");
                      String nom = input.nextLine();
                      nom = input.nextLine();
                      int codigo = 0;
                      do{
                      System.out.print("Ingrese el codigo de su mascota: ");
                      codigo = input.nextInt();
                      }while (codigo < 0 && codigo > 100);
                      System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
                      String fecha = input.nextLine();
                      fecha = input.nextLine();
                        SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha3 = fecha2.parse(fecha);
                        Color color ;
                        JColorChooser colorcito = new JColorChooser();
                        color = colorcito.showDialog(null,"Selecciona un color",Color.GRAY);
                    
                        System.out.print("Ingrese el precio de la mascota: ");
                        double pre = input.nextDouble();
                        
                        Mascota mascota = new Mascota(nom,codigo,color,fecha3,pre);
                        mas.add(mascota);
                      
                      break;
                  }
                  case 2: {
                      System.out.println("Lista de mascotas: ");
                      for (int i = 0; i < mas.size(); i++) {
                            System.out.println(i+". "+mas.get(i).toString());
                      }
                      System.out.println("");
                      break;
                  }
                  case 3: {
                      for (int i = 0; i < mas.size(); i++) {
                          System.out.println(i + ". " + mas.get(i).toString());
                      }
                      System.out.println("Ingrese mascota a editar");
                      int editar = input.nextInt();
                      System.out.println("1. color");
                      System.out.println("2. codigo");
                      System.out.println("3. fecha");
                      System.out.println("4. precio");
                      System.out.println("Cual desea modificar: ");
                      int modificaciones = input.nextInt();
                      if (modificaciones == 1) {
                            Color color ;
                        JColorChooser colorcito = new JColorChooser();
                        color = colorcito.showDialog(null,"Selecciona un color",Color.GRAY);
                        color = mas.get(editar).setcolor(color);
                        
                      }else if (modificaciones == 2) {
                          System.out.println("Ingrese el nuevo codigo: ");
                          int cod = input.nextInt();
                          mas.get(editar).setCodigo(cod);
                      }else if (modificaciones == 3) {
                          System.out.println("Ingrese la nueva fecha: ");
                        String  fecha = input.nextLine();
                        SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha3 = fecha2.parse(fecha);
                        mas.get(editar).setFecha(fecha3);
                      }else if (modificaciones == 4) {
                          System.out.println("Ingrese el nuevo precio: ");
                          double precio = input.nextDouble();
                          mas.get(editar).setprecio(precio);
                      }
                      
                      break;
                  }
                  case 4: {
                      for (int i = 0; i < mas.size(); i++) {
                          System.out.println(i + ". " + mas.get(i).toString());
                      }
                      System.out.println("Ingrese mascota a ser elminada: ");
                      int borrar = input.nextInt();
                      mas.remove(borrar);
                      break;
                  }
                  case 5: {
                      System.out.println("Gracias por su preferencia");
                      break;
                  }
                  default: {
                      System.out.println("Caracter invalido");
                      break;
                  }
              }
              
        } while (op != 5);
      
      
        
    }
    
}
