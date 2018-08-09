package incremental.java6;


import java.util.NoSuchElementException;

class SList<T>
{
    final Link<T> head= new Link<T>(null,null);
    public SList() {
        head.next=head;

    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        for(SListIterator<T> it = iterator(); it.hasNext();) {
            T element = it.next();
            buf.append(element == this ? "(this SList)" :
                    String.valueOf(element));
            if(it.hasNext())
                buf.append(", ");
        }
        buf.append("]");
        return buf.toString();
    }
    public SListIterator<T> iterator()
    {
        return new SListIterator2();
    }

    class Link<T>
    {
        T data;
        Link<T> next;

        public Link(T data, Link<T> next) {
            this.data = data;
            this.next = next;
        }
    }
    class SListIterator2 implements SListIterator<T>{
        private Link<T> lastReturned = head;
        private Link<T> next;
        SListIterator2() { next = head.next; }
        public boolean hasNext() { return next != head; }
        public T next() {
            if(next == head)
                throw new NoSuchElementException();
            lastReturned = next;
            next = next.next;
            return lastReturned.data;
        }
        public void remove() {
            if(lastReturned == head)
                throw new IllegalStateException();
            // Find an element before the last returned one
            for(Link<T> curr = head; ; curr = curr.next)
                if(curr.next == lastReturned) {
                    curr.next = lastReturned.next;
                    break;
                }
            lastReturned = head;
        }
        public void add(T element) {
            lastReturned = head;
            Link<T> newLink = new Link<T>(element, next);
            if(head.next == head)   // Empty list
                head.next = newLink;
            else {
                // Find an element before the one pointed by 'next'
                for(Link<T> curr = head; ; curr = curr.next)
                    if(curr.next == next) {
                        curr.next = newLink;
                        break;
                    }
            }
        }
    }


}
