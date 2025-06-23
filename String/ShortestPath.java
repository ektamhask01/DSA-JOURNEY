import java.util.*;

public class ShortestPath {
    // This method calculates the shortest straight-line distance from origin
    public static float findShortPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            }
        }
        // Using Pythagoras theorem to find shortest distance
        return (float)(Math.sqrt(x * x + y * y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("N -> North");
        System.out.println("S -> South");
        System.out.println("W -> West");
        System.out.println("E -> East");
        System.out.print("Enter path using above notation in string format: ");

        String path = sc.next();
        
        // Call the method and print the result
        float result = findShortPath(path);
        System.out.println("Shortest path distance from origin: " + result);
        
        sc.close();  // Always good to close scanner
    }
}