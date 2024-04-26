package com.atv.view;

import com.atv.model.Produto;
import com.atv.persist.PersistenciaDoParaguai;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Listagem extends JFrame {

    JTable table;
    DefaultTableModel model;
    JScrollPane pane;
    JMenuBar bar;
    JMenu menu;
    JMenuItem create;
    public Listagem() throws HeadlessException {
        setTitle("Listagem Produtos");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        attachComponents();
        attachActions();
        update();

        setVisible(true);
    }

    void attachComponents(){

        bar = new JMenuBar();
        menu = new JMenu("Produtos");
        create = new JMenuItem("Cadastro");

        menu.add(create);
        bar.add(menu);

        setJMenuBar(bar);


        model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Data Validade");
        table = new JTable(model);
        pane = new JScrollPane(table);
        add(pane);
    }

    void attachActions(){
        create.addActionListener(e -> {
            // insert a tela aqui ó
            update();
        });
    }

    void update(){
        model.setRowCount(0);
        for (Produto produto : PersistenciaDoParaguai.produtoList) {
            model.addRow(new Object[]{produto.getName(),produto.getData()});
        }
    }
}
