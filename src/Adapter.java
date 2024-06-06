public class Adapter implements Target{
    private Adapte adapte;

    public Adapter(Adapte adapte) {
        this.adapte = adapte;
    }

    @Override
    public void request() {
        adapte.specificRequest();
    }
}
