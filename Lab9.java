public class Lab9 {

    /**
     * 
     * @param num
     * @param num_place
     * @return int
     */
    public static int digitAt(int num, int num_place){
        //count to find index to pull char from subtracted from end of length
        int count = 0;

        //converting parameters to strings and getting length
        String numString = Integer.toString(num);
        String num_place_string = Integer.toString(num_place);
        int place_length = num_place_string.length();
        int num_length = numString.length();

        //Starting at back of numplace string, count every 0
        try{
            for(int i = place_length - 1; num_place_string.charAt(i) == '0'; i--){
                
                count++;
            }
            //grabbing char at the index where the zeros stop
            char number = numString.charAt(num_length - 1 - count);
            //if it finds the negative char, it went past the numbers and we can assume out of bounds which sets to 0
            if(number == '-'){
                throw new StringIndexOutOfBoundsException();
            }
            //converting char back to int
            int char_num = number - '0';
            return char_num;
        }
        //if out of bounds return 0
        catch(StringIndexOutOfBoundsException e){
            return 0;
        }
    }

    /**
     * @param <T>
     * @param array
     * @return
     */
    public static <T extends Comparable<T>> T maxElement(T[] array) {

        if (array == null || array.length == 0) {
            // Return null for empty or null arrays
            return null; 
        }
    
        T greatest = null;
    
        // Initialize greatest with the first non-null element
        for (T item : array) {
            if (item != null) {
                greatest = item;
                break;
            }
        }
    
        if (greatest == null) {
            // If all elements are null, return null
            return null; 
        }
    
        // Find the maximum element
        for (T item : array) {
            if (item != null && item.compareTo(greatest) > 0) {
                greatest = item;
            }
        }
        return greatest;
    }
    
    //main
    public static void main(String[] args) {
        
    }
}
