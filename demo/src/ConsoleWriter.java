public class ConsoleWriter {
    private static String decorationPrefix = ">>> ";

    public void write(String message) {
        String info = "Printing message...";
        System.out.println(info);
        System.out.println(decorationPrefix + message);
    }
}
