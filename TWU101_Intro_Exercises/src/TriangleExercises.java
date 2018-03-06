public class TriangleExercises {

    void easy(){
        System.out.println("*");
    }

    void horizontal(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    void vertical(int n){
        for(int i=0; i<n; i++){
            System.out.println("*");
        }
    }

    void right(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        TriangleExercises test = new TriangleExercises();
        //test.easy();
        //test.horizontal(5);
        //test.vertical(8);
        test.right(3);
    }

}
