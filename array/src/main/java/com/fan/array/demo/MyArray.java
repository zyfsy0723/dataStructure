package com.fan.array.demo;

public class MyArray {
    private int[] array;
    private int size;
    public  MyArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    /**
     * 数组插入元素
     *
     * @param element 要插入的元素
     * @param index   位置
     */
    public void insert(int element, int index) {
        // int[] arr = [0,1,2,3,4,5,N,N,N,N]
        // 如果实际元素达到数组上限，要扩容
        if(size >= array.length){
            resize();
        }
        // 从右往左腾出位置
        for (int i = size - 1; i >= index; i--) {
            array[i] = array[i-1 ];
        }
        // 塞进去
        array[index] = element;
        size++;
    }

    private void resize() {
        int[] arrayNew = new int[array.length * 2];
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
    }

    /**
     * 输出数组
     */
    public void output(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(9);
        myArray.insert(1,0);
        myArray.insert(2,1);
        myArray.insert(3,2);
        myArray.insert(4,3);
        myArray.insert(5,1);
        myArray.output();
    }
}
