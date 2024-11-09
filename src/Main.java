public class Main {
    public static void main(String[] args) {
        int num = 45; // מספר לבדיקה
        boolean isKaprekar = isKaprekar(num);

        // הצגת התוצאה
        System.out.println("Is " + num + " a Kaprekar number? " + isKaprekar);
    }

    // פעולה לבדיקת מספר קפרקר
    public static boolean isKaprekar(int num) {
        // TODO: השלם את הלוגיקה לבדיקת מספר קפרקר
        if (numLen(num)%2!=0)
            return false;
        int[]arr = numSeparate(num);
        if (arr[0]+arr[1]==num)
            return true;
        return false;
    }
    public static int numLen(int num){
        int len = 0;
        int sq = (int)Math.pow(num,2);
        while(sq!=0){
            len++;
            sq = (int)(sq/10);
        }
        return len;
    }
    public static int[] numSeparate(int num){
        int pwoer = numLen(num);
        int sq = (int)Math.pow(num,2), factor =(int) Math.pow(10.0,(double)pwoer/2);
        int[]arr = new int[2];
        arr[0] = sq/factor;
        arr[1] = sq%factor;
        return arr;
    }
}
