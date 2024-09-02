package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {
    private CalculadoraModel model;
    private CalculadoraView view;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;
        this.view.addCalcularListener(new CalcularListener());
    }

    private class CalcularListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double a, b;
            try {
                a = Double.parseDouble(view.getNum1());
                b = Double.parseDouble(view.getNum2());
                String operacao = view.getOperacao();
                model.calcular(operacao, a, b);
                view.setResultado(String.valueOf(model.getResultado()));
            } catch (NumberFormatException ex) {
                view.setResultado("Entrada inválida");
            } catch (ArithmeticException ex) {
                view.setResultado("Erro: " + ex.getMessage());
            } catch (IllegalArgumentException ex) {
                view.setResultado("Erro: " + ex.getMessage());
            }
        }
    }
}
