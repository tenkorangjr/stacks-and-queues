public class StackViaQueue<E> implements Stack<E> {

    private Queue<E> queue;

    public StackViaQueue() {
        queue = new ArrayList<E>();
    }

    public int size() {
        return queue.size();
    }

    public E pop() {
        // TODO
        if (queue.size() != 0) {
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.offer(queue.poll());
            }
        } else {
            return null;
        }

        return queue.poll();
    }

    public E peek() {
        // TODO
        return queue.peek();
    }

    public void push(E item) {
        // TODO
        queue.offer(item);
    }

}