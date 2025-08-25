import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MainApp extends JFrame {
    private JTextArea inputArea;
    private JTextArea outputArea;
    private JButton runButton;
    private JButton loadButton;
    private JButton saveButton;
    private JButton saveButton1;

    public MainApp(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Traductor Ru");
        setSize(new Dimension(1084, 720));
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cambiar el color de fondo del JFrame (content pane)
        getContentPane().setBackground(new Color(35, 10, 64));

        // Etiqueta título general arriba centrada y grande
        JLabel tituloGeneral = new JLabel("Traductor Ru");
        tituloGeneral.setFont(new Font("Verdana", Font.BOLD, 50));
        tituloGeneral.setForeground(Color.WHITE);
        tituloGeneral.setHorizontalAlignment(SwingConstants.CENTER);
        tituloGeneral.setBounds(0, 5, 1080, 30);  // Ocupa todo el ancho y está un poco abajo del borde superior
        add(tituloGeneral);

        JLabel inputLabel = new JLabel("CODIGO:");
        inputLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setBounds(225, 45, 200, 20);
        add(inputLabel);

        inputArea = new JTextArea();
        JScrollPane inputScroll = new JScrollPane(inputArea);
        inputScroll.setBounds(20, 65, 500, 550);
        add(inputScroll);

        JLabel outputLabel = new JLabel("SALIDA:");
        outputLabel.setForeground(Color.WHITE);
        outputLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        outputLabel.setBounds(755, 45, 200, 20);
        add(outputLabel);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane outputScroll = new JScrollPane(outputArea);
        outputScroll.setBounds(560, 65, 500, 550);
        add(outputScroll);

        runButton = new JButton("Ejecutar");
        runButton.setFont(new Font("Verdana", Font.BOLD, 20));
        runButton.setBackground(new Color(	45,	231,	51));
        runButton.setOpaque(true);
        runButton.setBorderPainted(false);
        runButton.setBounds(102, 625, 150, 40);
        add(runButton);

        loadButton = new JButton("Cargar archivo");
        loadButton.setFont(new Font("Verdana", Font.BOLD, 20));
        loadButton.setBackground(new Color(192,214,228));
        loadButton.setOpaque(true);
        loadButton.setBorderPainted(false);
        loadButton.setBounds(270, 625, 230, 40);
        add(loadButton);

        saveButton = new JButton("Guardar Codigo");
        saveButton.setFont(new Font("Verdana", Font.BOLD, 20));
        saveButton.setBackground(new Color(192,214,228));
        saveButton.setOpaque(true);
        saveButton.setBorderPainted(false);
        saveButton.setBounds(522, 625, 230, 40);
        add(saveButton);

        saveButton1 = new JButton("Guardar salida");
        saveButton1.setFont(new Font("Verdana", Font.BOLD, 20));
        saveButton1.setBackground(new Color(192,214,228));
        saveButton1.setOpaque(true);
        saveButton1.setBorderPainted(false);
        saveButton1.setBounds(772, 625, 230, 40);
        add(saveButton1);

        // Botón Ejecutar
        runButton.addActionListener(e -> ejecutarCodigo(inputArea.getText()));

        // Botón Cargar archivo
        loadButton.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser(new java.io.File("."));
            int opcion = chooser.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    inputArea.read(reader, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al leer el archivo");
                }
            }
        });

        // Botón Guardar Codigo
        saveButton.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showSaveDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    inputArea.write(writer);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo del codigo");
                }
            }
        });
        // Botón Guardar salida
        saveButton1.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showSaveDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    outputArea.write(writer);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo de salida");
                }
            }
        });
    }

    private void ejecutarCodigo(String codigo) {
        //System.out.println(codigo);
        Launcher lanzador = new Launcher(codigo);
        lanzador.IniciarProceso();

        File archivoSalida = new File("src/salida.txt");

        if (!archivoSalida.exists()) {
            System.err.println("El archivo de salida no existe.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoSalida))) {
            String linea;
            outputArea.setText("");  // Se limpia antes de cargar nuevo contenido

            while ((linea = reader.readLine()) != null) {
                outputArea.append(linea + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        new MainApp().setVisible(true);
    }
}
