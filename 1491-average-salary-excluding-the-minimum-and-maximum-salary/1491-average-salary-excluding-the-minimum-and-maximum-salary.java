class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;//consider min being the greatest val so as the next val will come it has to be min so update and keep on updating untill u reach the smallest;
        int max = Integer.MIN_VALUE;// lly in max ; we we will assigne it min so every no. is greater than the existing n keep on updating 
        int sum =0;
        for(int i=0;i<salary.length;i++){
            sum += salary[i];
            if(salary[i]<min){
                min = salary[i];
            }if(salary[i]>max){
                max = salary[i];
            }
        }
        return (double) (sum - min - max)/(salary.length-2);   
    }
}
