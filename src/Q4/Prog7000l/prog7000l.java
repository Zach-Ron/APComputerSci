package Q4.Prog7000l;
import java.util.*;
import java.io.*;

public class prog7000l {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog7000l.csv"));
            var X = new ArrayList<Double[]>();
            var Y = new ArrayList<Double>();
            file.nextLine();

            while (file.hasNextLine()){
                String line = file.nextLine();
                String[] data = line.split(",");
                Double[] row = {
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[0])
                };
                Y.add(Double.parseDouble(data[1]));
                X.add(row);
            }
            var X_train = new double[X.size()][2];
            for (int i = 0; i < X.size(); i++)
            {
                X_train[i][0] = X.get(i)[0];
                X_train[i][1] = X.get(i)[1];
            }
            var Y_train = new double[Y.size()];
            for (int i = 0; i < Y.size(); i++)
                Y_train[i] = Y.get(i);

            var lr = new LinearRegression(60, 100, 0.000_0001, 0.00001);

            lr.fit(X_train, Y_train, 25);
            System.out.println(lr);


            double sqFoot = 1247;
            double closestPoint = X_train[0][0];
            int closestIndex = 0;
            for (int i = 1; i < X_train.length; i ++) {
                if (Math.abs(X_train[i][0] - sqFoot) < Math.abs(closestPoint - sqFoot)) {
                    closestPoint = X_train[i][0];
                    closestIndex = i;
                }
            }
                System.out.println("Predicted price for " + sqFoot + " sqft: " + lr.predict(sqFoot));
                System.out.println("Compared to " + closestPoint + "sqft: " + Y_train[closestIndex]);

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }

    }
}
