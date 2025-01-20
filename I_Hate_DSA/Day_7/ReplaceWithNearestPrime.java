

public class ReplaceWithNearestPrime {
    public static void main(String[] args) {

        int primeChance = 0;
        int maxPositiveLength = 0;
        int maxNegativeLength = 0;
        int initialValue;
        int currentValue;
        int[] arr = {6, 10, 12, 11, 13, 15, 17, 19, 20};
        
        //outer loop
        for(int i = 0; i<arr.length; i++){
            positiveLoop:
            for(int j = arr[i]; j>arr[i]-1; j++){
                for(int k = 2; k<j; k++){
                    
                        if(j%k==0){
                            primeChance = 1;
                            break;
                        }
                        if(primeChance == 0){
                            
                            break positiveLoop;
                        }
                    
                }
               maxPositiveLength+=1;
            }
            negativeLoop:
            for(int l = arr[i] ; l>0; i-- ){
                for(int m = 2; m<l; m++){
                    
                    if(l%m==0){
                        primeChance = 1;
                        break;
                    }
                    if(primeChance == 0){
                        
                        break negativeLoop;
                    }
                
            }
           maxNegativeLength+=1;
            }

            if(maxNegativeLength>maxPositiveLength){
                arr[i]-=maxNegativeLength;
            }else{
                arr[i] += maxNegativeLength;
            }


        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
