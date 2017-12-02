import java.io.IOException;

/**
 * Created by dust on 2/12/17.
 */
public class PythonRun {

    private static final String PYTHON_PATH = "../";
    private static final String CODE_PATH = PYTHON_PATH + "main.py";
    private static final String DFOLDER_PATH = "--dfolder " + PYTHON_PATH + "data";

    public static void runVisualiser(PythonArguments args) throws IOException{ // Will add datatype of some sort
        String command = "python2 " + CODE_PATH + " " + DFOLDER_PATH + " " + args.toArgs();
        System.out.println(command);
        Process p = Runtime.getRuntime().exec(command);
    }

    public static void main(String[] args) throws IOException {
        runVisualiser(new PythonArguments(GraphType.E_VECTOR));
    }
}
