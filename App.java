import model.CalculadoraModel;
import view.CalculadoraView;
import controller.CalculadoraController;

public class App {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        new CalculadoraController(model, view);
    }
}
