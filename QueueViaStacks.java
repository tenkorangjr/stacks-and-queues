public class QueueViaStacks<E> implements Queue<E> {

    Stack<E> stack1, stack2;

    public QueueViaStacks() {
        stack1 = new ArrayList<E>();
        stack2 = new ArrayList<E>();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public void offer(E item) {
        // TODO
        stack1.push(item);
    }

    public E peek() {
        // TODO
        if (stack2.size() == 0) {
            if (stack1.size() != 0) {
                while (stack1.size() != 0) {
                    stack2.push(stack1.pop());
                }
            } else {
                return null;
            }
        }

        return stack2.peek();
    }

    public E poll() {
        // TODO
        if (stack2.size() == 0) {
            if (stack1.size() != 0) {
                while (stack1.size() != 0) {
                    stack2.push(stack1.pop());
                }
            } else {
                return null;
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueViaStacks<Integer> queue = new QueueViaStacks<>();

        queue.offer(6);
        queue.offer(8);
        queue.offer(10);
        queue.offer(12);
        System.out.println(queue.poll());
        queue.offer(3);
        System.out.println(queue.poll());
        queue.offer(4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}