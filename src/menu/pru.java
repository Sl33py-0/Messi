package menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pru extends JFrame {
    private Men menu;
    private JTextArea textArea;
    
    public pru() {
        menu = new Men();
        initComponents();
    }
    
    private void initComponents() {
        // Configuración de la ventana principal
        setTitle("Agenda de Contactos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Área de texto para mostrar los resultados
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        
        JButton btnIngreso = new JButton("Ingresar Contacto");
        JButton btnListado = new JButton("Listar Contactos");
        JButton btnBusqueda = new JButton("Buscar Contacto");
        JButton btnExtras = new JButton("Extras");
        JButton btnSalir = new JButton("Salir");
        
        // Acciones de los botones
        btnIngreso.addActionListener(e -> ingreso());
        btnListado.addActionListener(e -> listado());
        btnBusqueda.addActionListener(e -> busqueda());
        btnExtras.addActionListener(e -> extra());
        btnSalir.addActionListener(e -> System.exit(0));
        
        // Añadir botones al panel
        panel.add(btnIngreso);
        panel.add(btnListado);
        panel.add(btnBusqueda);
        panel.add(btnExtras);
        panel.add(btnSalir);
        
        // Layout principal
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);
    }
    
    private void ingreso() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String telefono = JOptionPane.showInputDialog("Teléfono:");
        String correo = JOptionPane.showInputDialog("Correo:");
        String edadStr = JOptionPane.showInputDialog("Edad:");
        int edad = Integer.parseInt(edadStr);
        String direccion = JOptionPane.showInputDialog("Dirección:");
        String estadoCivilStr = JOptionPane.showInputDialog("¿Está casado? (true o false):");
        boolean estadoCivil = Boolean.parseBoolean(estadoCivilStr);
        
        menu.nombres[menu.cont] = nombre;
        menu.apellidos[menu.cont] = apellido;
        menu.telefonos[menu.cont] = telefono;
        menu.correos[menu.cont] = correo;
        menu.edades[menu.cont] = edad;
        menu.direcciones[menu.cont] = direccion;
        menu.EC[menu.cont] = estadoCivil;
        menu.cont++;
        
        textArea.setText("Contacto ingresado con éxito.");
    }
    
    private void listado() {
        StringBuilder output = new StringBuilder();
        if (menu.cont == 0) {
            output.append("No hay contactos registrados.\n");
        } else {
            for (int i = 0; i < menu.cont; i++) {
                output.append("Nombre: ").append(menu.nombres[i])
                      .append(", Apellido: ").append(menu.apellidos[i])
                      .append(", Teléfono: ").append(menu.telefonos[i])
                      .append(", Correo: ").append(menu.correos[i])
                      .append(", Edad: ").append(menu.edades[i])
                      .append(", Dirección: ").append(menu.direcciones[i])
                      .append(", Estado Civil: ").append(menu.EC[i] ? "Casado" : "Soltero")
                      .append("\n");
            }
        }
        textArea.setText(output.toString());
    }
    
    private void busqueda() {
        String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");
        boolean encontrado = false;
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < menu.cont; i++) {
            if (menu.nombres[i].equalsIgnoreCase(buscarNombre)) {
                output.append("Nombre: ").append(menu.nombres[i])
                      .append(", Apellido: ").append(menu.apellidos[i])
                      .append(", Teléfono: ").append(menu.telefonos[i])
                      .append(", Correo: ").append(menu.correos[i])
                      .append(", Edad: ").append(menu.edades[i])
                      .append(", Dirección: ").append(menu.direcciones[i])
                      .append(", Estado Civil: ").append(menu.EC[i] ? "Casado" : "Soltero")
                      .append("\n");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            output.append("Contacto no encontrado.");
        }
        
        textArea.setText(output.toString());
    }
    
    private void extra() {
        if (menu.cont == 0) {
            textArea.setText("No hay contactos registrados.");
        } else {
            int suma = 0;
            for (int i = 0; i < menu.cont; i++) {
                suma += menu.edades[i];
            }
            double promedio = (double) suma / menu.cont;
            textArea.setText("El promedio de edad de los contactos es: " + promedio);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new pru().setVisible(true);
        });
    }
}
