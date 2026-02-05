
import java.util.*;


public class AdajacencyList {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge (int s, int d) {
            this.src = s;
            this.dest = d;
            // this.weight = w;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i< graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 3));
            graph[1].add(new Edge(1, 0));

            graph[0].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
            graph[5].add(new Edge(5, 6));

            graph[6].add(new Edge(6, 5));
   
        
    }

    public static void bfs(ArrayList<Edge> graph[], int V, visited[boolean]) {
        // create queue to store current value and neighbours of current value
        Queue<Integer> q = new LinkedList<>();

        // create boolean array to keep track of visited array
        // boolean visited[]= new boolean[V];

        // Add starting point in queue
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();

            if (visited[curr] == false) {
                // 1 . Print current
                System.out.print( " " + curr);
                // 2 . mark visited[curr] == true
                visited[curr] = true;

                // 3.  Add neighbours of current into queue

                for (int i = 0 ; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }



    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        /*
                1 ----- 3
              /             |  \
           0               |     5 ---- 6 
              \             |  /
                2 ------ 4
        */


 
            
        // Print 2's neighbours


        // for (int i = 0; i< graph[1].size() ; i++) {
        //     Edge e = graph[1].get(i);
        //     System.out.println(e.dest + " " + e.weight );
        // }


        //   ---------    If graph is in the form of 2 ore more componets --------- >>>>>>

        boolean visited[] = new boolean[V];
        for(int i =0 ; i<V; i++) {
            if (visited[i] == false) {
                bfs(graph, V, visited , i);
            }
        }
        System.out.println();




    }
}