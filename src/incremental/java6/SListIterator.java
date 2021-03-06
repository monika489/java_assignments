package incremental.java6;

interface SListIterator<T> {
    boolean hasNext();
    T next();
    void remove();
    void add(T element);
}