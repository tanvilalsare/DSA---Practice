class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstIdx = -1, prevCriticalIdx = -1;
        int minDist = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 1; // curr starts at index 1

        while (curr.next != null) {
            boolean isMax = curr.val > prev.val && curr.val > curr.next.val;
            boolean isMin = curr.val < prev.val && curr.val < curr.next.val;

            if (isMax || isMin) {
                if (firstIdx == -1) {
                    firstIdx = idx; // record the very first critical point
                } else {
                    minDist = Math.min(minDist, idx - prevCriticalIdx);
                }
                prevCriticalIdx = idx; // update "last seen" critical point
            }

            prev = curr;
            curr = curr.next;
            idx++;
        }

        if (firstIdx == -1 || firstIdx == prevCriticalIdx) {
            return new int[]{-1, -1}; // fewer than 2 critical points
        }

        int maxDist = prevCriticalIdx - firstIdx;
        return new int[]{minDist, maxDist};
    }
}