public class IntsCalculator implements Ints{

    @Override
    public int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    @Override
    public int mult(int arg0, int arg1) {
        return arg0 * arg1;
    }

    @Override
    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
