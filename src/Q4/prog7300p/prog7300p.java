package Q4.prog7300p;
import java.util.Arrays;

public class prog7300p {
    public static void main(String[] args){
        double[][] X_train = {
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND Neuron: ");
        var model = new Perceptron();
        model.fit(X_train, y_train, 15, 0.1);

        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{
                0, 1
        };
    }
}
