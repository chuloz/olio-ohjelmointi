package Task2;

import java.util.Objects;

public class ThreadSafetyTest {
    public static void main(String[] args) {
        ThreadSafeArrayList threadSafeList = new ThreadSafeArrayList();

        // Luo useita säikeitä lisäämään ja poistamaan elementtejä
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    Object element = "Element " + j; // Muuta String Object-tyypiksi
                    threadSafeList.addElement((Objects) element);
                    System.out.println("Added element: " + element);
                    threadSafeList.removeElement((Objects) element);
                    System.out.println("Removed element: " + element);
                }
            });
            t.start();
        }
    }
}