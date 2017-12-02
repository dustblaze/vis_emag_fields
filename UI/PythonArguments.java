/**
 * Created by dust on 2/12/17.
 */

public class PythonArguments {

    GraphType graphType;
    String file;
    double[] grid = {-10, 10, 1, -10, 10, 1, -10, 10, 1};
    Integer lines = 5;

    public PythonArguments(GraphType graphType) {
        this.graphType = graphType;

        // Set the default files for a given graph
        if (graphType == GraphType.E_VECTOR || graphType == GraphType.E_FIELD) {
            this.file = "pos_charge";
        }
        else if (graphType == GraphType.M_VECTOR || graphType == GraphType.M_FIELD) {
            this.file = "inf_wire";
        }
    }

    public PythonArguments(GraphType graphType, String file, double[] grid, Integer lines) {
        new PythonArguments(graphType);

        // Check grid option
        if (grid != null) {
            this.grid = grid;
        }
        // Check lines option
        if (lines != null) {
            this.lines = lines;
        }

        // Check file option
        if (file != null) {
            this.file = file;
        }
    }

    public String toArgs() {
        String gridString = "--grid ";
        for (double gn : grid) {
            gridString += gn + " ";
        }
        String lineString = "--lines " + lines + " ";
        String fileString = "--file " + file;
        return graphType.toArg() + lineString + fileString;
    }
}
