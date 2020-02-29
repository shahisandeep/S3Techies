package s3.testing.junit;

public class operatorCalculation {
    //this methods adds two variables
    public int add(int a, int b){
        return a+b;
    }

    //this methods subtracts two variables
    public int sub(int a, int b){
        if (a-b >=0) {
            return a - b;
        }
        else{
            return 0;
        }
    }

    //this method divides two variables
    public int divide(int a, int b){
        if(a/b >0){
            return a/b;
        }
        else {
            return 0;
        }
    }
}
