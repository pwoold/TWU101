public class FizzBuzz {

    void fizzBuzz(){
        for(int i=0; i<100; i++){
            System.out.println(checkValue(i+1));
        }
    }

    Boolean check3(int i){
        return i%3==0;
    }

    Boolean check5(int i){
        return i%5==0;
    }

    String checkValue(int i){
        if(this.check3(i) && this.check5(i)){
            return "FizzBuzz";
        }
        if(this.check3(i)){
            return "Fizz";
        }
        if(this.check5(i)) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

    public static  void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz();
    }
}
