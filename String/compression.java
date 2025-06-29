public class compression {
    public static String CompressString(String str) {
        StringBuilder  sb = new StringBuilder("");
        for (int i = 0 ; i< str.length(); i++) {
            char ch = str.charAt(i);
            Integer count = 1;
            while( i< str.length()-1 && ch == str.charAt(i+1) ){
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if (count> 1 ) {
                sb.append(count.toString());
            }
        }


        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abbccccdd";
        System.out.println(CompressString(str));;
    }
}
