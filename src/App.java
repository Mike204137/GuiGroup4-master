import Controller.Controller;
import Model.MancalaModel;
import View.CenterPanel;
import View.View;


public class App {

    private CenterPanel cPanel;


    public static void main(String[] args)
    {
        MancalaModel model = new MancalaModel();
        View view = new View();
        Controller controller = new Controller(View, model);
    }


    cPanel = new CenterPanel();
    add(cPanel);


}
