public class Main{

    static int pass = 0;
    static int fail = 0;
    public static void main(String[] args){

        prob1();
        System.out.println("Pass: " + pass + " Fail: " + fail);
    }

    public static void prob1(){
        Linearprobing pe = new Linearprobing(11);
        try {
            pe.insert(10);
            pe.insert(22);
            pe.insert(31);
            pe.insert(4);
            pe.insert(15);
            pe.insert(28);
            pe.insert(17);
            pe.insert(88);
            pe.insert(59);
            pe.tostring();
            pass++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            fail++;
        }
    }


}
