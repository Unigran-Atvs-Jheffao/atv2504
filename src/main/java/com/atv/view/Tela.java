package com.atv.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Tela extends JDialog {
    JTextField nome;
    JTextField dataValidade;

    JButton cadastro;
    public Tela(){
        setModal(true);
        setTitle("Cadastro");
        setSize(600,300);
        setLocationRelativeTo(null);

        attachComponents();
        attachActions();

        setVisible(true);
    }

    void attachComponents(){

        nome = new JTextField();
        dataValidade = new JTextField();

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2,2));

        painel.add(new JLabel("Nome"));
        painel.add(nome);
        painel.add(new JLabel("Data validade"));
        painel.add(dataValidade);

        painel.setBorder(new EmptyBorder(100,100,100,100));
        add(painel);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        cadastro = new JButton("Cadastro");

        panel.add(cadastro);

        add(cadastro, BorderLayout.SOUTH);
    }

    void attachActions() {
        
    }
}