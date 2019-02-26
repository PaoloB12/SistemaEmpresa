package views;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends JFrame {

    private JButton PRODUCCIONButton;
    private JButton VENDEDORButton;
    private JButton ADMINISTRADORButton;
    private JPanel panel;

    public MenuPrincipal (){
        add(panel);
       setTitle("BIENVENIDO AL SISTEMA DE EMPRESAS");
       setSize(500,500);
        ADMINISTRADORButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AdministradorPrincipal administradorPrincipal = new AdministradorPrincipal();
                administradorPrincipal.setModal(true);
               administradorPrincipal.setVisible(true);
            }
        });
        VENDEDORButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                VendedorPrincipal vendedorPrincipal = new VendedorPrincipal();
                vendedorPrincipal.setModal(true);
                vendedorPrincipal.setVisible(true);
            }
        });
        PRODUCCIONButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ProduccionPrincipal produccionPrincipal = new ProduccionPrincipal();
                produccionPrincipal.setModal(true);
                produccionPrincipal.setVisible(true);
            }
        });
    }
}
