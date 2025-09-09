// Question 1 :  Rat in a MazeYou are  given a starting position for a rat which is stuck in a maze at an initial point(0,0)(themazecanbethoughtofasa2-dimensionalplane).The maze would begiven in the form of a square matrix of order N*N where the cells with value 0 represent the maze’s blocked locations while value1 is the open/available path that the rat can take to reach its destination.The rat's destination is at (N - 1, N - 1).Yourtaskistofindallthepossiblepathsthattheratcantaketoreachfromsourcetodestination in the maze.Thepossibledirectionsthatitcantaketomoveinthemazeare'U'(up)i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y




public class RatInMaze {

    public static int ratMove (int Maze[][], int row , int col) {
        // base case 
   
        // recurssion step
        int right , left, up , down ;

        right  = ratMove(Maze, row, col+1);
        left = ratMove(Maze, row, col-1);
        up = ratMove(Maze, row-1, col);
        down = ratMove(Maze, row+1, col);

        int totalways = right + left + up + down;

        return totalways;
    }
    
    public static void main(String[] args) {
        int Maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1}, 
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        

        ratMove(Maze, 0, 0);




    }
}
