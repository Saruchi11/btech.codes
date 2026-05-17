class sumoverloading {
    int sum (int a, int b) {
        return a + b ;}
        int  sum(int a, int b, int c){
            return a + b + c;
        }
        double sum(double a, double b ){
            return a + b;
        }
        double sum(int a, double b){
            return a + b;
        }
        public static void main(String[]args) {
            sumoverloading obj = new sumoverloading ();
            System.out.println("Sum of 2 integers: " + obj.sum(2,3));
            System.out.println("Sum of 3 integers: " + obj.sum(2,3,4));
            System.out.println("Sum of 2 doubles: " + obj.sum(2.5,3.5));
            System.out.println("Sum of int and double: " + obj.sum(2, 3.5));
        }
    }

