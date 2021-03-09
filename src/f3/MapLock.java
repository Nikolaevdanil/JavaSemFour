package f3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class MapLock<E,T> implements Map<E,T> {
    private final HashMap<E,T> map = new HashMap<E,T>();
    private static final Semaphore sem = new Semaphore(1);
    public void print() {
        try {
            sem.acquire();
            System.out.println(map);
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object o) {
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        return false;
    }

    @Override
    public T get(Object o) {
        return null;
    }

    @Override
    public T put(E e, T t) {
        try {
            sem.acquire();
            map.put(e,t);
            sem.release();
        } catch (InterruptedException w) {
            w.printStackTrace();
        }
        return t;
    }

    @Override
    public T remove(Object o) {
        return null;
    }

    @Override
    public void putAll(Map<? extends E, ? extends T> map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<E> keySet() {
        return null;
    }

    @Override
    public Collection<T> values() {
        return null;
    }

    @Override
    public Set<Entry<E, T>> entrySet() {
        return null;
    }
}
