package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame {
    private JTextField num1 = new JTextField(10);
    private JTextField num2 = new JTextField(10);
    private JTextField resultado = new JTextField(10);
    private JComboBox<String> operacoes = new JComboBox<>(new String[]{"+", "-", "*", "/"});
    private JButton btnCalcular = new JButton("Calcular");

    public CalculadoraView() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Número 1:"));
        panel.add(num1);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2);
        panel.add(new JLabel("Operação:"));
        panel.add(operacoes);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultado);
        panel.add(btnCalcular);

        resultado.setEditable(false);

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public String getNum1() { return num1.getText(); }
    public String getNum2() { return num2.getText(); }
    public String getOperacao() { return (String) operacoes.getSelectedItem(); }
    public void setResultado(String result) { resultado.setText(result); }
    public void addCalcularListener(ActionListener listener) { btnCalcular.addActionListener(listener); }
}
