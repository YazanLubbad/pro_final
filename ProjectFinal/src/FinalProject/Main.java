
package FinalProject;

import View.ViewManger;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Ahmed
 */
public class Main extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManger.openLoginPage();
    }
    
}
