import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class CheckerBoard extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CheckerBoard");
        Group root = new Group();
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc)
    {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 800, 600);
        for (int r = 0; r < 8; r++) {
            for (int c = 1; c <= 8; c++) {
                gc.setFill(Color.RED);
                if(r % 2 == 0) {
                    if (c % 2 == 0)
                        gc.fillRect(75 * c + 25, 75 * r, 75, 75);
                    else
                    {
                        if(r < 3)
                        {
                            gc.setStroke(Color.WHITE);
                            gc.strokeOval(75 * c + 25, 75 * r, 75, 75);
                        }
                        else if(r > 5)
                        {
                            gc.setFill(Color.RED);
                            gc.fillOval(75 * c + 25, 75 * r, 75, 75);
                        }
                    }
                }
                else {
                    if (c % 2 == 0)
                        gc.fillRect(75 * c - 50, 75 * r, 75, 75);
                    else
                    {
                        if(r < 3)
                        {
                            gc.setStroke(Color.WHITE);
                            gc.strokeOval(75 * c +100, 75 * r, 75, 75);
                        }
                        else if(r > 4)
                        {
                            gc.setFill(Color.RED);
                            gc.fillOval(75 * c + 100, 75 * r, 75, 75);
                        }
                    }
                }
            }
        }
    }
}
