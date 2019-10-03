public class DoNDrills {
    public static void main(String[] args) {
        for (int i= 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println("");

        for (int j =10; j >= 0; j--) {
        System.out.print(j);
    }

        System.out.println("");
        int prev = 1;
        for (int i= 1; i < 10; i++) {
            int next = 2 * prev;
            System.out.print(next + " ");
            prev = next;
        }
        System.out.println("");
    }

}
