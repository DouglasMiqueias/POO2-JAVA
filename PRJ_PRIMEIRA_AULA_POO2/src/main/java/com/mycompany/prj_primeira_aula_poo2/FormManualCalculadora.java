package com.mycompany.prj_primeira_aula_poo2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormManualCalculadora extends JFrame {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    private Calculadora c; // DECLARADA AQUI

    public FormManualCalculadora() {

        setTitle("Calculadora Manual");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel lblNumero1 = new JLabel("Numero 1:");
        txtNumero1 = new JTextField();

        JLabel lblNumero2 = new JLabel("Numero 2:");
        txtNumero2 = new JTextField();

        JLabel lblResultado = new JLabel("Resultado:");
        txtResultado = new JTextField();
        txtResultado.setEditable(false);

        JButton btnSomar = new JButton("Somar");
        JButton btnSubtrair = new JButton("Subtrair");
        JButton btnMultiplicar = new JButton("Multiplicar");
        JButton btnDividir = new JButton("Dividir");

        // Adicionando componentes
        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        add(txtNumero2);
        add(lblResultado);
        add(txtResultado);
        add(btnSomar);
        add(btnSubtrair);
        add(btnMultiplicar);
        add(btnDividir);

        // Instanciando a calculadora
        c = new Calculadora();

        // Eventos com Lambda (forma moderna)
        btnSomar.addActionListener(e -> calcular("+"));
        btnSubtrair.addActionListener(e -> calcular("-"));
        btnMultiplicar.addActionListener(e -> calcular("*"));
        btnDividir.addActionListener(e -> calcular("/"));
    }

    private void calcular(String operacao) {
        try {
            float num1 = Float.parseFloat(txtNumero1.getText());
            float num2 = Float.parseFloat(txtNumero2.getText());
            float resultado = 0;

            switch (operacao) {
                case "+":
                    resultado = c.somar(num1, num2);
                    break;
                case "-":
                    resultado = c.sub(num1, num2);
                    break;
                case "*":
                    resultado = c.mult(num1, num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this,
                                "Erro: Nao e possivel dividir por zero!",
                                "Erro matemático",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultado = c.div(num1, num2);
                    break;
            }

            txtResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, insira apenas numeros validos.",
                    "Erro de entrada",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}