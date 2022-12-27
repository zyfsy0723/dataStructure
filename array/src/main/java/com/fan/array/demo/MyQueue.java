package com.fan.array.demo;

public class MyQueue {

    private final int[] array;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * 入队
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /**
     * 出队
     */
    public int deQueue() {
        if (front == rear) {
            throw new RuntimeException("队列为空");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    /**
     * 输出队列
     */
    public void output() {
        for (int i = front; i % array.length != rear; i++) {
            System.out.println(array[i % array.length]);
        }
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        try {
            myQueue.enQueue(1);
            myQueue.enQueue(2);
            myQueue.enQueue(3);
            myQueue.enQueue(4);
            myQueue.enQueue(5);
            myQueue.enQueue(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        myQueue.output();
        System.out.println("出队元素：" + myQueue.deQueue());
        System.out.println("出队元素：" + myQueue.deQueue());
        System.out.println("出队元素：" + myQueue.deQueue());
        System.out.println("出队元素：" + myQueue.deQueue());
        System.out.println("出队元素：" + myQueue.deQueue());
        System.out.println("出队元素：" + myQueue.deQueue());
        myQueue.output();

    }
}
