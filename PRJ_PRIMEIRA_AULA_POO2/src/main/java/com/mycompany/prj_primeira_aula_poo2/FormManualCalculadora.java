/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_primeira_aula_poo2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Iftm
 */
public class FormManualCalculadora extends JFrame 
{
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    
    public FormManualCalculadora()
    {
        setTitle("Calculadora Manual");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(5,2,5,5));
        
        JLabel lblNumero1 = new JLabel("Numero 1: ");
        txtNumero1 = new JTextField();
        
        JLabel lblNumero2 = new JLabel("Numero 2:");
        txtNumero2 = new JTextField();
        
        JLabel lblResultado = new JLabel("Resultado: ");
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        
        JButton btnSomar = new JButton("Somar");
        JButton btnSubtrair = new JButton("Subtrair");
        JButton btnMultiplicar = new JButton("Multiplicar");
        JButton btnDividir = new JButton("Dividir");
        
        add(lblNumero1);
        add(txtNumero1);
        add(lblNumero2);
        
        
        
        
        
        
    }
}
