public class AdapterTest {
    public static void main(String[] args) {
        Adapte adapte = new Adapte();
        Target target = new Adapter(adapte);

        target.request();
    }
}
