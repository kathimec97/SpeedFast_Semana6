package cl.duoc.vista;

import cl.duoc.model.TipoPedido;
import cl.duoc.model.ZonaDeCarga;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroPedido extends JFrame {
    private ZonaDeCarga zonaDeCarga;
    private JLabel lblId;
    private JLabel lblDireccion;
    private JLabel lblTipo;
    private JTextField txtId;
    private JTextField txtDireccion;
    private JComboBox comboTipo;
    private JButton btnGuardar;

    public VentanaRegistroPedido(ZonaDeCarga zonaDeCarga) {
        this.zonaDeCarga = zonaDeCarga;
        this.setTitle("Registro de pedidos");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel panelRegistro = new JPanel(new GridLayout(4, 2, 10, 10));
        panelRegistro.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));


        JLabel lblId = new JLabel("ID");
        JLabel lblDireccion = new JLabel("Direccion");
        JLabel lblTipo = new JLabel("Tipo");

        txtId = new JTextField();
        txtDireccion = new JTextField();
        comboTipo = new JComboBox<>(TipoPedido.values());
        btnGuardar = new JButton("Guardar");

        panelRegistro.add(lblId);
        panelRegistro.add(txtId);
        panelRegistro.add(lblDireccion);
        panelRegistro.add(txtDireccion);
        panelRegistro.add(lblTipo);
        panelRegistro.add(comboTipo);
        panelRegistro.add(new JLabel(""));
        panelRegistro.add(btnGuardar);

        setContentPane(panelRegistro);

        setVisible(true);

    }


}
