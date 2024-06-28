class Stack {
    static final int MAX = 5;
    int stackArr[] = new int[MAX];
    int top;

    Stack() {
        top = -1;
    }

    int size() {
        return stackArr.length;
    }

    boolean isEmpty() {
        return top < 0;
    }

    void push(int x) {
        if(top >= MAX - 1) {
            System.out.println("Stack overflow");
        } else {
            stackArr[++top] = x;
            System.out.println("Pushed to stack " + x);
        }
    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stackArr[top--];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Stack size " + stack.size());
        System.out.println("Stack IsEmpty " + stack.isEmpty());
        for (int i = 0; i < 6; i++) {
            stack.push(i+1);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("stack pop" + stack.pop());;
        }
        System.out.println("Stack size " + stack.size());
        System.out.println("Stack IsEmpty " + stack.isEmpty());
    }
}