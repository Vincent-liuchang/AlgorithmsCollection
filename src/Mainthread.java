public class Mainthread {

    public static void main(String args[]){
        int[] a =EuclidAlgorithm.ExtendedEuclid(-7,9);
        int[] b =EuclidAlgorithm.ExtendedEuclid(7,9);
        System.out.println(a[0]+" "+ a[1]+" "+a[2]);
//        System.out.println(EuclidAlgorithm.InverseOfa(-72146,31));
//
//        int m[][] = {{-271755,-269874,689931,-535392},{-371709,-365625,915894,-703233},{-178038,-156996,435159,-336168},{54918,56889,-118017,106947}};
//        for(int i =0;i<4;i++){
//            for(int j =0;j<4;j++){
//                m[i][j] = m[i][j]%31;
//                if(m[i][j]<0)
//                    m[i][j] +=31;
//                System.out.print(m[i][j]+"|");
//            }
//            System.out.println();
//        }
//        System.out.println(2673%31);

//        int n[][] = {{-6096,7424,-5352,6590},{4446,-1438,-6038,4496},{-730,-4129,5892,-5152},{3066,-4302,4112,-7220}};
//        for(int i =0;i<4;i++){
//            for(int j =0;j<4;j++){
//                n[i][j] = (24*n[i][j])%31;
//                if(n[i][j]<0)
//                    n[i][j] +=31;
//                System.out.print(n[i][j]+"|");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//
//        int[] m = EuclidAlgorithm.convert("!LPUMYAIJ?.MPA.DVRFUTNRUZYEFM?QVKJTOBTDRIAN!?SLQBKESZOSFRAAWYPI.VBOLLMWAWEMQ.JYBOITGNJRIFYGEGIBC?RB?UN?MORI,");
//        for(int x:m){
//            System.out.print(x+" ");
//        }
//        System.out.println("");
//        int[] o = new int[m.length];
//
//        for(int i = 0; i < m.length; i++) {
//            int sum = 0;
//            for(int j = 0;j<4;j++){
//                    sum += n[i%4][j] * m[(i/4)*4 + j];
//                    System.out.print(n[i % 4][j] * m[(i/4)*4 + j] + " + ");
//
//            }
//            System.out.println("");
//            o[i] = sum % 31;
//        }
//
//
//
//        System.out.println(EuclidAlgorithm.convertback(o));
    }
}
