public class MooreVoting {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,4,5,4,4};
        int count = 0;
        int majElem = 0;
        for(int a : arr){
            if(count == 0){
                majElem = a;
            }
            if(a == majElem){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(majElem + " " + count);
    }
}
