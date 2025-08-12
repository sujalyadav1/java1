import java.util.ArrayList;

public class PowerOfTwoMaxHeap {
    private final ArrayList<Integer> heap;
    private final int childrenPerNode;

    public PowerOfTwoMaxHeap(int childrenExponent) {
        if (childrenExponent < 0) {
            throw new IllegalArgumentException("childrenExponent must be >= 0");
        }
        this.childrenPerNode = 1 << childrenExponent; // 2^childrenExponent
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }

        return max;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / childrenPerNode;
            if (heap.get(index) > heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void siftDown(int i
