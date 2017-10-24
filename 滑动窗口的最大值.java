public class Solution {

    /**
     *
     * 思路：
     * [2,3,4,2,6,2,5,1]
     * 利用双端队列结构，　队列头保存当前窗口最大值元素的下标，遍历num：
     * １．当队列为空时，直接在队尾加入当前下标
     * ２．当队列不为空并且当前元素 >= 队尾元素，则从队尾一直向前删除，直到队列为空或者当前元素小于队尾元素，然后再将当前下标加入队尾
     *　3.如果当前下标 - 队首下标 >= size，说明窗口向右滑动了，则删除队首元素
     * 4.将最新的队首元素加入ArrayList中
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        int N = num.length;
        if (size > N || N <= 0) {
           return list;
        }
        Deque<Integer> deque = new ArrayDeque<>();
        int i;
        for(i = 0; i < size - 1; i++) {
            while (!deque.isEmpty() && num[i] > num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        for(; i < N; i++) {
            while (!deque.isEmpty() && num[i] > num[deque.getLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if(i - deque.getFirst() >= size) {
                deque.pollFirst();
            }
            list.add(num[deque.getFirst()]);
        }
        return list;
    }


    @Test
    public void test() {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] num = new int[]{2,3,4,2,6,2,5,1};
        System.out.print(maxInWindows(num, 3));
    }
}
