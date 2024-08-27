
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {

    static class XY {
        public int x;
        public int y;
        List<Integer> dList = new ArrayList<>();

        public int dist(XY xy) {
            return Math.abs(this.x - xy.x) + Math.abs(this.y - xy.y);
        }
        public XY (int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        int N;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        List<XY> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new XY(x, y));
            xSet.add(x);
            ySet.add(y);
        }
        int idx = 0;
        for(Integer x : xSet){
            for(Integer y : ySet){

                XY xy = new XY(x, y);
                // System.out.println(String.format("x = %d, y = %d", xy.x, xy.y));
                for (XY xy2 : list) {
                    int dist = xy2.dist(xy);
                    xy2.dList.add(dist);
                }
                idx++;
            }
        }

        for (int i = 0; i < N; i++) {
            
            int min = Integer.MAX_VALUE;
            // System.out.println("N = " + i);
            for(int j = 0; j < idx ; j++){
                // System.out.println("j = " + j);
                // System.out.println("idx = " + idx);
                PriorityQueue<Integer> queue = new PriorityQueue<>();
                //j == 좌표조합
                int cost = 0;
                for (XY xy : list) {
                    // 15 14 에서  모든 좌표와의 거리를 가져온다.
                    int dist = xy.dList.get(j);
                    // System.out.println("dist"+dist);
                    queue.add(dist);
                    // 거리를 가져와서 우선순위 큐에 삽입 가장 낮은 값을 리턴?
                }
                // System.out.println("i = ?" + i);
                for(int k = 0; k <= i; k++){
                    int q = queue.poll();
                    // System.out.println(q);
                    cost += q;
                }
                // 해당 좌표 조합의 
                min = Math.min(min, cost);

            }
             System.out.print(min + " ");
        }
    }
}
