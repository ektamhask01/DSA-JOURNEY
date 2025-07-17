// Asked in goldmanSachs


public class FriendsPair {

    public static int pairFriend(int n ) {
        if (n == 1 || n == 2 ) {
            return n;
        }

        // int single = pairFriend(n-1);
        // int pair = ((n-1) *pairFriend(n-2));
        // int totalWays = single + pair ;
        // return totalWays;

        // Short form of logic
        
        return pairFriend(n-1) + (n-1) * pairFriend(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(pairFriend(n));
    }
}
