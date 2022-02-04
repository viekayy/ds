public class q3{
    public static void main(String argsofkfmkmfkfk[]){
        int n=5;

        int str=1;
        int spc=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
         System.out.println("");
        if(i<(n+1)/2){
            spc--;
            str++;
        }else{
            spc++;
            str--;
        }
     }
    }
}