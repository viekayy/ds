public class instar{
    public static void main(String args[]){
        int n=15;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
//n-i=4,    0,1,2,3,
            }
            for(int k=0;k<i;k++ ){
            System.out.print("* ");
            }
            System.out.println("");
        }
    }
}