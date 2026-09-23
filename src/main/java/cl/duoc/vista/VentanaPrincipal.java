package cl.duoc.vista;


import cl.duoc.model.ZonaDeCarga;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton botonRegistrarPedido;
    private JButton botonListaPedidos;
    private JButton botonAsignarRepartidor;
    private final ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

    public VentanaPrincipal() {
        setTitle("Ventana Principal-SpeedFast");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panelBotones = new JPanel(new GridLayout(3, 1, 0, 15));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));

        botonRegistrarPedido = new JButton("Registrar pedido");
        botonListaPedidos = new JButton("Lista de pedidos");
        botonAsignarRepartidor = new JButton("Asignar repartidor/Iniciar Reparto");

        panelBotones.add(botonRegistrarPedido);
        panelBotones.add(botonListaPedidos);
        panelBotones.add(botonAsignarRepartidor);
        setVisible(true);

        add(panelBotones, BorderLayout.CENTER);

        botonRegistrarPedido.addActionListener(e -> {
            VentanaRegistroPedido registro = new VentanaRegistroPedido(zonaDeCarga);
            registro.setVisible(true);
        });

        //botonListaPedidos.addActionListener(e -> {
         //   VentanaListaPedidos listado = new VentanaListaPedidos(zonaDeCarga);
        //    listado.setVisible(true);
        //});


    }




}
