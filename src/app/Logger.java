package app;

public class Logger {
    private StringBuilder stringBuilder;

    protected Logger() {
        this.stringBuilder = new StringBuilder("Log started.\n");
    }

    public void add(String s) {
        stringBuilder.append(s + "\n");
    }

    public String getLogs() {
        return stringBuilder.toString();
    }
}
