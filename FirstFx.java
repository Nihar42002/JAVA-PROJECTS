import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FirstFx extends Application {

    @Override
    public void start(Stage primaryStage) {

        // ✅ Create a line (x1, y1, x2, y2)
        Line line = new Line(20, 20, 100, 20);
        Rectangle rectangle = new Rectangle(20, 50, 80, 30);
        Circle circle = new Circle(200, 100, 30);


        // ✅ Use Group as root
        Group root = new Group();
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(circle);

        // ✅ Create scene
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Line Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}