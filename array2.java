public class array2{


    public static void   maxsubarray(int number[]){
        int currsum= 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0;i<number.length; i++){
            // int start = number[i];
            for(int j =i;j<number.length;j++){
                // int end = j;
                currsum = 0;
                for(int k =i; k<=j;k++){
                    currsum += number[k];
                    // System.out.print(number[k]+ " ");
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                
            }
            
        }
        System.out.println("Maximun sum of the subarray  is :  " + maxsum);


       
    }


// prifix solution of the problem 


    public static void   prefixmaxsubarray(int number[]){
        int currsum= 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[number.length];

        prefix[0] =number[0];

        for(int i = 1; i<prefix.length;i++){
            prefix[i] = prefix [i-1] + number[i];

        }

        for(int i = 0;i<number.length; i++){
            int start = i;
            for(int j =i;j<number.length;j++){
                int end = j;
                currsum = start == 0 ? prefix[end] :prefix[end] -prefix[start - 1];
                
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                
            }
            
        }
        System.out.println("Maximun sum of the subarray  is :  " + maxsum);


       
    }


    //  KADANS ALDORITHM FOR MAXIMUN SUM ☺️

    public static void kadanes(int number[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<number.length;i++){
            cs = cs +number[i];
            if(cs<0){
                cs= 0 ;
            }
            ms = Math.max(cs,ms);

        }
        System.out.println("MAX SUBARRAY SUM IS : " + ms);
    }

    //. TRAPPING RAIN WATER 
    public static int trappedrainwater(int hieght[]){
        // calculate to left max boundary -array
        int n = hieght.length;  
        int leftmax[] = new int[n];
        leftmax[0] = hieght[0];
        for(int i = 1; i<n;i++){
            leftmax[i] = Math.max(hieght[i], leftmax[i-1]);

        }
        // calculate right max boundary - array

        int rightmax[ ] = new int[n];
        rightmax[n-1] = hieght[n-1];
        for(int i = n-2; i>=0;i--){
            rightmax[i] = Math.max(hieght[i], rightmax[i+1]);

        }

        int trappedwater = 0 ;
        for(int i = 0 ; i<n ; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - hieght[i];

        }
        return trappedwater;

        // loop
        //  watelevel = min(leftmax bound, rightmax bound )
        // trapped water = waterlevel -hieght[i]
    }




    // buy and sell stocks 

    public static int buyandsellstock(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i<prices.length; i++){
            if(buyprices < prices[i]){
                int profit = prices[i] - buyprices ;
                maxprofit = Math.max(maxprofit, profit);

            } else{
                buyprices = prices [i];
            }
        }

        return maxprofit;

    }

    public static void main(String[] args) {
        int prices [] = {9,2,5,1,6,4,8,3,6,9};
        System.out.println(buyandsellstock(prices));

    } 

}