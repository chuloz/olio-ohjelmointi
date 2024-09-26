package Task2;

import java.util.ArrayList;
import java.util.Objects;
// Luokka, joka käsittelee Arraylist-kokoelma turvallisesti
public class ThreadSafeArrayList {
    private ArrayList<Objects> list = new ArrayList<>();

    //lisää elementin kokoelmaan
    public synchronized void addElement(Objects element) {
        list.add(element);
    }

    //palauttaa kokoelman koon
    public synchronized int getSize() {
        return list.size();
    }

    // poistaa elementin kokoelmasta
    public synchronized void removeElement(Objects element) {
        list.remove(element);
    }
}