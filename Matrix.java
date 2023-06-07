public class Matrix {
    public static void main(String[] args) {
        // int n=5;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){
        // System.out.print("*\t");
        // }
        // System.out.println();
        // }

        // int n=5;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){
        // if(i==j){
        // System.out.print("*\t");
        // }else{
        // System.out.print("\t");
        // }
        // }
        // System.out.println();
        // }

        // int n=5;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){
        // if(i==j || i+j ==n+1){
        // System.out.print("*\t");
        // }else{
        // System.out.print("\t");
        // }
        // }
        // System.out.println();
        // }

        //

        // 
        
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1 || j==(n+1)/2) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1 || j==(n+1)/2 || i==n) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1|| j==1 || i==(n+1)/2) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // int n = 9;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1|| j==1 || (i==(n+1)/2 && j<=(n+1)/2)) {
        //             System.out.print("F\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j==1|| j==n || i==j) {
        //             System.out.print("N\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 9;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1 || i==n || i==(n+1)/2 || (j==1 && i<=(n+1)/2)|| (j==n && i>=(n+1)/2)) {
        //             System.out.print("S\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 9;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j==1 || j==n || (i==j && i<=(n+1)/2) || (i+j==n+1 && i<=(n+1)/2)) {
        //             System.out.print("M\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1 || j==(n+1)/2 || (i==n && j<=(n+1)/2) || (j==1 && i>(n+1)/2)) {
        //             System.out.print("J\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 9;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ((i==j && i<=(n+1)/2) || (i+j==n+1 && i<=(n+1)/2) || (j==(n+1)/2 && i>=(n+1)/2)) {
        //             System.out.print("Y\t");
        //         } else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==(n+1)/2 || j==(n+1)/2 || (i==1 && j>=(n+1)/2) || (j==1 && i<=(n+1)/2) || (i==n && j<=(n+1)/2) || (j==n && i>=(n+1)/2)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        
    }
}
