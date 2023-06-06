import javax.naming.NameParser;

public class SpacePatterns {
    public static void main(String[] args) {
        // int n = 5;

        // for (int i = 1; i <= n; i++) { // rows

        // for (int j = 1; j <= (n - i); j++) { // spaces
        // System.out.print("\t");
        // }

        // for (int j = 1; j <= i; j++) { // stars
        // System.out.print("*\t");
        // }
        // System.out.println();

        // }

        // int n = 5;

        // for (int i = 1; i <= n; i++) { // rows

        // for (int j = 1; j <= (i-1); j++) { // spaces
        // System.out.print("\t");
        // }

        // for (int j = 1; j <= (n+1-i); j++) { // stars
        // System.out.print("*\t");
        // }
        // System.out.println();

        // }

        // int n=5 ;
        // int nst = 1;
        // int nsp =n-1;

        // for(int i =1;i<=n;i++){

        // for(int j =1 ;j<=nsp ;j++){
        // System.out.print("\t");
        // }
        // for(int j =1 ;j<=nst ;j++){
        // System.out.print("*\t");
        // }
        // nst+=2;
        // nsp--;
        // System.out.println();
        // }

        // int n = 5;
        // int nst = 1;
        // int nsp = n - 1;

        // for (int i = 1; i <= (2 * n - 1); i++) {

        //     for (int j = 1; j <= nsp; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 1; j <= nst; j++) {
        //         System.out.print("*\t");
        //     }
        //     if (i < n) {
        //         nst++;
        //         nsp--;
        //     } else {
        //         nsp++;
        //         nst--;
        //     }
        //     System.out.println();
        // }

        int n= 5 ;
        int nst = 1;
        int nsp = n/2;

        for(int i =1;i<=n;i++){   // rows

            for(int j=1;j<=nsp ;j++){   // spaces 
                System.out.print("\t");
            }

            for(int j=1;j<=nst ;j++){  // stars
                System.out.print("*\t");
            }

            System.out.println();

            if( i<=(n)/2){
               nst+=2;
               nsp--;
            }else{
                nsp++;
                nst-=2;
            }
        }

    }
}
