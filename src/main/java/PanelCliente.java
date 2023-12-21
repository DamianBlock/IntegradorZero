import org.example.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCliente {
    private JTextField idText;
    private JPanel panelCliente;
    private JTextField razonSocialText;
    private JTextField cuitText;
    private JTextField cuilText;
    private JTextField emailText;
    private JTextField telefonoText;
    private JButton consultarBt;
    private JButton ingresarDatosBt;
    private JTextField textField7;
    private JList lista;
    private JTextField fecNacText;

public PanelCliente() {
    ingresarDatosBt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Cliente cliente = new Cliente();
            cliente.setCuilCliente("20339735604");
            cliente.setRazonSocial("Damian Juarez");
            cliente.setEmailCliente("damianfrt25@gmail.com");
            cliente.setTelefonoCliente(1516171541);
        }
    });

}
}
