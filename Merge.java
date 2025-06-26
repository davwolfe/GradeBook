public class Merge {
public static void sort ( Comparable [] a ) {
        Comparable [] aux = new Comparable [a. length ];
        sort (a , aux , 0, a. length - 1);
        }

        public static void sort ( Object [] a , Comparator c) {
        Object [] aux = new Object [a. length ];
        sort (a , aux , 0, a. length - 1, c );
        }

        private static void sort ( Comparable [] a , Comparable [] aux , int lo , int hi ) {
        if ( hi <= lo ) {
            return ;
            }
        int mid = lo + ( hi - lo ) / 2;
        sort (a , aux , lo , mid );
        sort (a , aux , mid + 1, hi );
        merge(a , aux , lo , mid , hi );
            }

        private static void sort ( Object [] a , Object [] aux , int lo , int hi , Comparator c) {
        if ( hi <= lo ) {
            return ;
            }
        int mid = lo + ( hi - lo ) / 2;
        sort (a , aux , lo , mid , c );
        sort (a , aux , mid + 1, hi , c );
        merge (a , aux , lo , mid , hi , c );
        }
}