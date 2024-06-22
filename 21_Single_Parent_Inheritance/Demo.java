class Calc{
    
    int add( int n1, int n2){
        return n1+n2;
    }
    
    int sub( int n1, int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    
    int mul( int n1, int n2){
        return n1*n2;
    }
    
    int div( int n1, int n2){
        return n1/n2;
    }
}

class SciCalc extends AdvCalc{
        double pow( int n1, int n2){
        return Math.pow(n1,n2);
    }
}


class Demo {
    public static void main(String[] args){
        SciCalc obj = new SciCalc();
        int a1 = obj.add(2,3);
        int s1 = obj.sub(5,2);
        int m1 = obj.mul(2,3);
        int d1 = obj.div(5,2);
        double p1 = obj.pow(5,2);
        System.out.println("Add: " + a1 + " || Sub: " + s1 + " || Mul: " + m1 + " || Sub: " + d1 + " || Pow: " + (int)p1);
    }
    

}