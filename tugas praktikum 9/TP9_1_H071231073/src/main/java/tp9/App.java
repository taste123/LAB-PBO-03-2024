package tp9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Group root1 = new Group();
        Scene scene1 = new Scene(root1, 400, 200);
        scene1.getStylesheets().add(App.class.getResource("/scene1style.css").toExternalForm());

        TextField name = new TextField();
        name.getStyleClass().add("field");
        name.setPromptText("name");
        name.setLayoutX(200);
        name.setLayoutY(70);
        name.setMaxWidth(200);

        TextField age = new TextField();
        age.getStyleClass().add("field");
        age.setPromptText("age");
        age.setLayoutX(200);
        age.setLayoutY(110);
        age.setMaxWidth(200);

        Image image1 = new Image("scene1.png");
        ImageView pict1 = new ImageView(image1);
        pict1.setFitHeight(120);
        pict1.setFitWidth(120);
        pict1.setX(30);
        pict1.setY(40);

        Image image2 = new Image("scene2.png");
        ImageView pict2 = new ImageView(image2);
        pict2.setFitHeight(120);
        pict2.setFitWidth(120);
        pict2.setX(30);
        pict2.setY(40);

        Button exit = new Button("exit");
        exit.setLayoutX(180);
        exit.setLayoutY(160);
        exit.setOnAction(e -> stage.close());

        Button back = new Button("back");
        back.setLayoutX(180);
        back.setLayoutY(160);

        Button exit2 = new Button("exit");
        exit2.setLayoutX(330);
        exit2.setLayoutY(160);
        exit2.setOnAction(e -> stage.close());

        Text failText = new Text("");
        failText.setX(230);
        failText.setY(155);
        failText.setOpacity(0.5);

        Button next = new Button("next");
        next.setLayoutX(330);
        next.setLayoutY(160);
        next.setOnAction(e -> {
            if (name.getText().isEmpty() || age.getText().isEmpty()) {
                failText.setText("fill the blank field!");
            } else {
                try {
                    int ages = Integer.parseInt(age.getText()) + 1;
                    Text helloText = new Text("Hello, " + name.getText());
                    helloText.setX(200);
                    helloText.setY(70);

                    Text infoText = new Text("Next year you will be " + ages);
                    infoText.setX(200);
                    infoText.setY(110);

                    Group root2 = new Group();
                    root2.getChildren().addAll(pict2, helloText, infoText, exit2, back);
                    Scene scene2 = new Scene(root2, 400, 200);
                    failText.setText("");
                    name.clear();
                    age.clear();
                    stage.setScene(scene2);
                } catch (NumberFormatException e1) {
                    failText.setText("");
                    age.setPromptText("must be a number!");
                    age.clear();
                }
            }
        });

        root1.getChildren().addAll(name, age, pict1, exit, next, failText);
        back.setOnAction(e -> stage.setScene(scene1));

        stage.setTitle("tp9_Ray😎");
        stage.setScene(scene1);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
