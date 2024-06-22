class Linux {

    //Makes the variable value constant, you can't further modify it.
    final String name = "Ubuntu";
}

class Demo{
    public static void main(String[] args){

        Linux obj = new Linux();

        //Error: cannot assign a value to final variable name
        obj.name = "Fedora";
        
    }
}