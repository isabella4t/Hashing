import java.util.Arrays;

public class Linearprobing {
    int[] HT;
    int HTsize;
    int tomb = 0;

    public Linearprobing(int size){
        HT = new int[size];
        HTsize = size;
        for(int i = tomb; i<HTsize;i++){
            HT[i] = tomb;
        }
    }

    public void insert(int val){
         if(HT[hash(val)] == tomb){
             HT[hash(val)] = val;
             return;
         }
        for(int i = hash(val); i<HTsize;i++){
            if(HT[i%HTsize] == tomb) {
                HT[i%HTsize] = val;
                return;
            }
        }
         throw new ArrayIndexOutOfBoundsException();

        //throw overflow error here
        //Decided not to do chaining overflow+underflow
    }

    public void delete(int key){
        if(key>=HTsize) throw new ArrayIndexOutOfBoundsException();
        HT[key] = tomb;

    }

    public int search(int val){
        int ret = hash(val);
        if(HT[hash(val)] == val){
            return ret;
        }
        for(int i = hash(val); i<HTsize;i++){
            if(HT[i%HTsize] == val) {
                return i%HTsize;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private int hash(int key){
        return key%HTsize;
    }

    public void tostring(){
        System.out.println(Arrays.toString(HT));
    }


}
