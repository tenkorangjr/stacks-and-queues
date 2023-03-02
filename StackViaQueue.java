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
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
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

    public static void main(String[] args) {
        Stack<Integer> stack = new StackViaQueue<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}