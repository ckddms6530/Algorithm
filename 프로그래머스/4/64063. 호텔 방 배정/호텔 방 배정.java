import java.util.*;

class Solution {
    private Map<Long, Long> parent;

    public long[] solution(long k, long[] room_number) {
        parent = new HashMap<>();
        long[] result = new long[room_number.length];
        
        for (int i = 0; i < room_number.length; i++) {
            long room = room_number[i];
            long assignedRoom = find(room);
            result[i] = assignedRoom;
            union(assignedRoom, assignedRoom + 1);
        }
        
        return result;
    }

    private long find(long room) {
        if (!parent.containsKey(room)) {
            parent.put(room, room);
        }
        if (parent.get(room) != room) {
            parent.put(room, find(parent.get(room)));
        }
        return parent.get(room);
    }

    private void union(long room1, long room2) {
        long root1 = find(room1);
        long root2 = find(room2);
        if (root1 != root2) {
            parent.put(root1, root2);
        }
    }
}
