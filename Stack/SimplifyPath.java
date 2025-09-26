import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String parts[]) {
        Stack<String> s = new Stack<>();

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("") || parts[i].equals(".")) {
                continue;
            } else if (parts[i].equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(parts[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : s) {
            if (sb.length() > 0) {
                sb.append("/");
            }
            sb.append(dir);
        }
        sb.insert(0, "/");
        return sb.toString();
    }

    public static void main(String[] args) {
        String path = "/a/..";
        String[] parts = path.split("/");

        System.out.println(simplifyPath(parts));
    }
}
