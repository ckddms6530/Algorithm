import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static List<List<Integer>> graph;
    static int N, M, R;
    static boolean[] visited;
    static int[] answer;
    static int order;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        graph.add(null);
        queue = new LinkedList<>();

        for(int i = 1; i <= N; i++ ){
            graph.add(i, new ArrayList<>());
        }
        visited = new boolean[N+1];
        answer = new int[N+1];
        order = 1;

        for(int i = 0; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
            graph.get(B).add(A);
        }

        for(int i = 1; i <= N; i++ ){
            Collections.sort(graph.get(i));
        }

        //1 
        dfs(R);
        System.out.println();
        bfs();


        bw.close();
        br.close();

    }

    public static void dfs(int idx){
        visited[idx] = true;
        System.out.print(idx + " ");

        for(Integer newIdx : graph.get(idx)){
            if(!visited[newIdx]){
                dfs(newIdx);
            }
        }

    }
    public static void bfs(){
        queue.add(R);
        visited = new boolean[N+1];
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            visited[idx] = true;
            System.out.print(idx + " ");
            List<Integer> 너비 = graph.get(idx);

            for (Integer integer : 너비) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                }
            }
        }
    };


}

