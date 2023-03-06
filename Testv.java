import java.util.*;

class Testv {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int[] edge = new int[N];
            for (int i = 0; i < N; i++) {
                edge[i] = in.nextInt();
            }
            int start1 = in.nextInt();
            int start2 = in.nextInt();
            int[] dist1 = bfs(N, edge, start1, start2);
            int[] dist2 = bfs(N, edge, start2, start1);
            int minDist = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (dist1[i] != -1 && dist2[i] != -1) {
                    minDist = Math.min(minDist, dist1[i] + dist2[i]);
                }
            }
            System.out.println(minDist == Integer.MAX_VALUE ? -1 : minDist);
            in.close();
        }
    }

    private static int[] bfs(int N, int[] edge, int start, int otherStart) {
        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        dist[start] = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (dist[curr] > dist[otherStart] && dist[otherStart] != -1) {
                // Stop BFS if we have gone farther than the other start cell
                break;
            }
            for (int next : getNeighbors(edge, curr)) {
                if (dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    queue.offer(next);
                }
            }
        }
        return dist;
    }

    private static List<Integer> getNeighbors(int[] edge, int curr) {
        List<Integer> neighbors = new ArrayList<>();
        int next = edge[curr];
        while (next != -1) {
            neighbors.add(next);
            next = edge[next];
        }
        return neighbors;
    }
}
