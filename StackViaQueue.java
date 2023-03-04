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

        E toReturn = null;

        if (queue.size() != 0) {
            for (int i = 0; i < queue.size(); i++) {
                queue.offer(queue.poll());

                if (i == queue.size() - 2) {
                    toReturn = queue.peek();
                }
            }
        }

        return toReturn;
    }

    public void push(E item) {
        // TODO
        queue.offer(item);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new StackViaQueue<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

}