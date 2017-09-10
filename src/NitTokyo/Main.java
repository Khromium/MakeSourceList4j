package NitTokyo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("ソースリスト作るよ");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons.png")));
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(700);
        Controller controller = fxmlLoader.getController();
        controller.init(primaryStage);
//        primaryStage.setMaxHeight(400);
//        primaryStage.setMaxWidth(600);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
