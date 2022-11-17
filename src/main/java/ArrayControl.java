public class ArrayControl {

    public static int GetMinElementIndex(int array[]){
        int mnIndex = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < mnIndex){
                mnIndex = i;
                min = array[i];
            }
        }
        return mnIndex;
    }
    public static int GetProductBetweenMinElements(int secondArray[]){
        int product = 1;
        boolean shouldMultiplie = false;
        for (int i = 0; i < secondArray.length; i++){
            if(secondArray[i] < 0){
                if(shouldMultiplie){
                    return product;
                }
                else {
                    shouldMultiplie=true;
                    continue;
                }
            }
            if(shouldMultiplie){
                product*= secondArray[i];
            }
        }
        return product;
    }
    public static int GetNegativeColumns(int thirdArrey[][]){
        int counter[]=new int[thirdArrey.length];
        int sum=0;
        for(int i=0;i<thirdArrey.length;i++) {
            for (int j = 0; j < thirdArrey[i].length; j++) {
                if (thirdArrey[i][j] < 0) {
                    counter[i]++;
                }
            }
        }

        for(int i=0; i < thirdArrey.length; i++){
            if(counter[i]>0){
                for(int j=0; j < thirdArrey[i].length; j++){
                    sum += thirdArrey[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[] = {1,2,0,1,-1,-1,0,3,4,5};
        int thirdArray[][] = {
                {1,2,0,1,1},
                {1,2,0,1,1},
                {1,1,0,2,-1},
                {2,4,8,12,-4},
                {1,2,2,4,4}
        };
        
        System.out.println(GetMinElementIndex(array));
        System.out.println(GetProductBetweenMinElements(array));
        System.out.println(GetNegativeColumns(thirdArray));
    }
}

