class NumArray {
    int[] tree;
    int[] nums;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        
        if (n == 0) return;

        tree = new int[4 * n];
        build(0, 0, n - 1);
    }

    private void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
            return;
        }

        int mid = start + (end - start) / 2;
        int leftChild = 2 * node + 1;
        int rightChild = 2 * node + 2;

        build(leftChild, start, mid);
        build(rightChild, mid + 1, end);

        tree[node] = tree[leftChild] + tree[rightChild];
    }

    public void update(int index, int val) {
        updateUtil(0, 0, n - 1, index, val);
    }

    private void updateUtil(int node, int start, int end, int index, int val) {
        if (start == end) {
            nums[index] = val;
            tree[node] = val;
            return;
        }

        int mid = start + (end - start) / 2;

        if (index <= mid) {
            updateUtil(2 * node + 1, start, mid, index, val);
        } else {
            updateUtil(2 * node + 2, mid + 1, end, index, val);
        }

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    public int sumRange(int left, int right) {
        return query(0, 0, n - 1, left, right);
    }

    private int query(int node, int start, int end, int left, int right) {
        // no overlap
        if (end < left || start > right) {
            return 0;
        }

        // complete overlap
        if (start >= left && end <= right) {
            return tree[node];
        }

        // partial overlap
        int mid = start + (end - start) / 2;
        int leftSum = query(2 * node + 1, start, mid, left, right);
        int rightSum = query(2 * node + 2, mid + 1, end, left, right);

        return leftSum + rightSum;
    }
}