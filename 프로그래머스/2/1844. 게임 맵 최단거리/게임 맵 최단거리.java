import java.util.*;

class Solution {
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(new Node(0, 0, 1)); // 시작점에서의 거리는 1로 시작
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            // 도착점에 도달하면 그때의 거리를 반환
            if (node.x == m - 1 && node.y == n - 1) {
                return node.count;
            }
            
            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                // 지도 범위를 벗어나지 않고, 방문하지 않았으며, 길이 있을 때
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && maps[ny][nx] == 1 && !visited[ny][nx]) {
                    queue.add(new Node(nx, ny, node.count + 1));
                    visited[ny][nx] = true;
                }
            }
        }
        
        // 도착점에 도달할 수 없으면 -1 반환
        return -1;
    }
    
    class Node {
        int x, y, count;
        
        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
