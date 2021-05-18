// Q1. I used hashset, this is a good solution as it only lookup on hashtable, and not loop for each element like brute force method.

public static boolean sumFound(int[] arr, int z) {

        if(arr==null || arr.length < 2) { return false; }

        HashSet values = new HashSet();

        for (int i = 0; i < arr.length; i++) {

            if (values.contains(z – A[i])) return true;

            values.add(A[i]);

        }

 }

//Q2. for this i use traverse to find first smallest , after that finidng second smallest. it is a linear way of finding and therefore efficient
public static int secondSmallest(int[] arr) {
    if(arr==null || arr.length < 2) {
    throw new IllegalArgumentException("Input array too small");
    } 

//implement
     int firstSmall = -100000000;
    int secondSmall = -100000000;

    //traverse to find 1st small integer on array
    for (int i = 0; i<arr.length;i++)
        if (firstSmall == -1 || arr[firstSmall]>arr[i])
            firstSmall = i;

     //traverse to array find 2 integer, and skip first small
    for (int i = 0;i<arr.length;i++) {
        if (i != firstSmall && (secondSmall == -1 || arr[secondSmall] > arr[i]))
            secondSmall = i;
    }

    return arr[secondSmall];
}

//Q3. for this i tried to use reccursion but that requires to add one more argument to our method, instead i used the following approach where i use double for loop, this is not efficient compared to using recursion.
public static boolean sumFound(List list, int k) {
//implement        
        int previous = 0;
         for (int i = 0; i < list.size(); i++) {
            //Loop to compare with the first item
            for (int j = i + 1; j < list.size(); j++) {
    //If first item plus second item equals needed value print the result
                if (i + j + previous == sum) {
                    return true;
                }  else {
                    previous += sum;

                }
            }
        }
        return false;
}

//Q4. converting the list to array and doing a sort on the array, and returning back the array to list
public static void sort(ArrayList<Integer> list){
//implement
    boolean sorted = false;
    int temp;
    Integer[] myArray = new Integer[list.size()];
    list.toArray(myArray);
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < list.size - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
    list = List.of(myArray); // back to in place;
}


//Q5. linearly searching. since arr is already expected to have been sorted, linearly searching does not take more memory space compared to binary search tree but is slower
public static boolean find(int[] arr, int z) {
    int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == z)
                return i;
        }
        return -1;
}
