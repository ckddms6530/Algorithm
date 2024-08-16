import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] graph;
    static int N, M, R;
    static boolean[] visited;
    static int[] answer;
    static int order;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];

        for(int i = 1; i <= N; i++ ){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        answer = new int[N+1];
        order = 1;

        for(int i = 0; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
            graph[B].add(A);
        }

        for(int i = 1; i <= N; i++ ){
            Collections.sort(graph[i] , (o, o2) -> o2 - o );
        }

        //1 
        dfs(R);

        for(int i = 1; i <=N; i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();

    }

    private static void dfs(int 방문인덱스) {
        visited[방문인덱스] = true;
        answer[방문인덱스] = order++;
        ArrayList<Integer> list = graph[방문인덱스];
        for (Integer integer : list) {
            if(!visited[integer]){
                dfs(integer);
            }

        }

    }
}

