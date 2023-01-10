package negozio;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setCanale(5);
        tv.stampaCanale();

        tv.setCanale(7);
        tv.stampaCanale();
    }
}

