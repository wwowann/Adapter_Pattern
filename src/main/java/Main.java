public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("сумма = " + intsCalc.sum(2, 2));
        System.out.println("произведение = " + intsCalc.mult(2, 2));
        System.out.println("степень числа = " + intsCalc.pow(2, 2));
        System.out.println("сумма = " + intsCalc.sum(10, 22));
        System.out.println("произведение = " + intsCalc.mult(10, 22));
        System.out.println("степень числа = " + intsCalc.pow(2, 10));

    }
}
