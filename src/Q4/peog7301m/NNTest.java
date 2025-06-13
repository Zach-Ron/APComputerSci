package Q4.peog7301m;

import java.util.Arrays;

public class NNTest {
    public static void main(String[] args) {
        double[][] X_train = {{0,0}, {0,1}, {1,0}, {1,1}};
        double[][] y_train = {{0}, {1}, {1}, {0}};
        var model = new MultilayerPerceptron(new int[] {2, 3, 1}, new Activations.Tanh());

        model.train(X_train, y_train, 1000, 0.1);

        for (double[] x : X_train) {
            double[] result = model.predict(x);
            System.out.printf("Input: %s\tOutput: %.6f\n",
                    Arrays.toString(x), result[0]);
        }
        System.out.println("Final accuracy: " + model.accuracy(X_train, y_train));
    }
}
