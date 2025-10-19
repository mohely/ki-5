class Arrays{

    public static int average(int[] array){
        int sum = 0;
        for(int e : array){
            sum += e;
        }
        return (sum / array.length);
    }

    public static double average(double[] array){
        double sum = 0;
        for(double e : array){
            sum += e;
        }
        return (sum / array.length);
    }

    public static int smallestElement(int[] array){
        int maxSum = Integer.MAX_VALUE;
        
        if(array.length == 0 || array == null){return maxSum;}

        for(int e: array){
            if(maxSum > e){ maxSum = e;}
        }

        return maxSum;
    }

    public static int[] reverse(int[] array){
        int[] revList = new int[array.length];

        for(int i = (array.length - 1), j = 0; i>=0; i-- , j++){
            revList[i] = array[j];
        }

        return revList;
    }

    public static int[] evenNumbers(int[] array){
       
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenNumArray = new int[count];

        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumArray[index++] = num;
            }
        }
        
        return evenNumArray;
    }

    
    public static void main(String[] args) {

        //Average Element Method.
        //System.err.println(Arrays.average(new int[]{1,2,3,4}));//Output: 2 
        //System.err.println(Arrays.average(new double[]{1,2,3,4}));//Output: 2,5

        //Smallest Element Method.
        //System.err.println(Arrays.smallestElement(new int[]{1,2,3,4}));//Output: 1

        //Reverse Method.
        //for (int i : Arrays.reverse(new int[]{1,2,3,4})) {
        //    System.out.println(i);//Output: 4 3 2 1
        //}

        // Return even num Method.
        // for (int i : Arrays.evenNumbers(new int[]{1,2,3,4})) {
        //    System.out.println(i);//Output: 2 4
        // }
    }
}
