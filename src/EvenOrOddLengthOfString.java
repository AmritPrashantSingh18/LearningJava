public class EvenOrOddLengthOfString {

    void evenOrOddLengthString(String n){
        int length=n.length();
        if(length%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args){
        EvenOrOddLengthOfString str = new EvenOrOddLengthOfString();
        str.evenOrOddLengthString("Amrit");
        str.evenOrOddLengthString("Prashant");
    }
}
