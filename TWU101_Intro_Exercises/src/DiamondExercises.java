public class DiamondExercises {

    void isosceles(int n){
        this.topHalf(n);
        this.middle(n);
    }

    void diamond(int n){
        this.isosceles(n);
        this.bottomHalf(n);
    }

    void diamondName(int n){
        this.topHalf(n);
        this.middleName();
        this.bottomHalf(n);
    }

    String giveLine(int s, int a){
        if (s == 0){
            return String.format("%0" + a + "d", 0).replace("0","*");
        }
        return String.format("%0" + s + "d", 0).replace("0"," ") + String.format("%0" + a + "d", 0).replace("0","*");
    }

    void topHalf(int n){
        for(int i=0; i<n-1; i++){
            System.out.println(giveLine((n-1)-i,i*2+1));
        }
    }

    void middle(int n){
        System.out.println(giveLine(0,n*2-1));
    }

    void middleName(){
        System.out.println("Phoebe");
    }

    void bottomHalf(int n){
        for(int i=n-1; i>0; i--){
            System.out.println(giveLine(n-i, i*2-1));
        }
    }

    public static void main(String[] args){
        DiamondExercises test = new DiamondExercises();
        //test.isosceles(4);
        //test.diamond(5);
        test.diamondName(6);
    }
}
