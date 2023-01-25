public class Pisin {
    public static void main(String[] args) {
        if(args.length > 0){
            int big = 0;
            String s = "";
            for(String i : args){
                if(i.length()>big){
                    big = i.length();
                    s = i;
                }
            }
            System.out.println("Pisin parametri: "+s);
        } else {
            System.out.println("Ei parametreja");
        }
    }
        
}
