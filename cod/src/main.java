public class main {

    public static void main (String [] arg){
        String str = "12345567fgjf7889";
        //System.out.println(str.codePointAt(0));

        boolean flag = true;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < 48 || str.charAt(i) > 57)
                flag = false;
        }

        System.out.println(flag);

    }
}
