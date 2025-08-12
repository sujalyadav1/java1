public class Range {
    /**
     * This program prints the range of different data types in Java.
     */
    public static void main(String[] args) {
        System.out.println("the maximum values are :");
        System.out.println("  Max: " + Short.MAX_VALUE + "\n");

        System.out.println("Byte:");
        System.out.println("Min:" + Byte.MIN_VALUE);
        System.out.println("Max:" + Byte.MAX_VALUE);

        System.out.println("int:");
        System.out.println("  Min: " + Integer.MIN_VALUE);
        System.out.println("  Max: " + Integer.MAX_VALUE + "\n");

        System.out.println("long:");
        System.out.println("  Min: " + Long.MIN_VALUE);
        System.out.println("  Max: " + Long.MAX_VALUE + "\n");

        System.out.println("float:");
        System.out.println("  Min: " + Float.MIN_VALUE);
        System.out.println("  Max: " + Float.MAX_VALUE + "\n");

        System.out.println("double:");
        System.out.println("  Min: " + Double.MIN_VALUE);
        System.out.println("  Max: " + Double.MAX_VALUE + "\n");

        System.out.println("char:");
        System.out.println("  Min: " + (int) Character.MIN_VALUE);
        System.out.println("  Max: " + (int) Character.MAX_VALUE + "\n");

        System.out.println("boolean:");
        System.out.println("  Values: " + Boolean.FALSE + " and " + Boolean.TRUE);
    }
}

