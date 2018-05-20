public class SelectionSort extends Models {

    public void selectionSort(int[] arr){
        int length = arr.length;

        for (int i=0; i<length-1; i++){
            int index = 0;
            for (int j = i+1; j < length; j++){
                if (arr[j]< arr[index]){
                    index = j;      //searching for lowest index
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;

            }
        }
    }
}
