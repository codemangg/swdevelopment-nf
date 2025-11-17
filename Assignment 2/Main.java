    import java.util.Arrays;

    public class Main {

        static double[][] idw(double[][] data) {
            int rows = data.length;
            int columns = data[0].length;
            double p = 2.0;
            double[][] result = new double[rows][columns];
            // check each cell by iterating over them
            for (int i = 0; i < rows; i++) {
                for (int x = 0; x < columns; x++) {
                    // if value is known, copy it
                    if (!Double.isNaN(data[i][x])) {
                        result[i][x] = data[i][x];
                        continue;
                    }
                    // calculating idw value for current position
                    double weighedSum = 0.0;
                    double weightSum = 0.0;
                    // check all known points and calculate weight
                    for (int y = 0; y < rows; y++) {
                        for (int z = 0; z < columns; z++) {
                            if (!Double.isNaN(data[y][z])) {
                                // calculate distance between (i <-> x) and (y <-> z)
                                double dx = i - y;
                                double dy = x - z;
                                double distance = Math.sqrt(dx * dx + dy * dy);
                                // calculate the weight
                                double weight = 1.0 / Math.pow(distance, p);
                                // add to totals
                                weighedSum += weight * data[y][z];
                                weightSum += weight;
                            }
                        }
                    }
                    // final interpolated value
                    result[i][x] = weighedSum / weightSum;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            double[][] example = {
                    { 1.0, Double.NaN, 3.0 },
                    { Double.NaN, Double.NaN, 2.0 },
                    { 4.0, 5.0, Double.NaN }
            };
            System.out.println(Arrays.deepToString(idw(example)));
        }
    }
