package packagetest;

public class ArraySumtest {
  public static void main(String[] args) {
    double[] numbers = { 1.1, 2.2, 3.3,-1.2,4.4,-10.5 };
    System.out.println("[v1] Sum of {1.1,2.2,3.3}=" + arraySum1(numbers));
    System.out.println("[v2] Sum of {1.1,2.2,3.3}=" + arraySum2(numbers));
    System.out.println("[v3] Sum of {1.1,2.2,3.3}=" + arraySum3(numbers));
    System.out.println("[v4] Sum of {1.1,2.2,3.3}=" + arraySum4(numbers));
    //System.out.println("" + countPositive(numbers));
    System.out.println("" + numInRange(numbers,-10,5));
  }
  
  public static double arraySum1(double[] nums) {
    double sum = 0;
    for(double num: nums) {
      sum = sum + num; // Or sum += num
    }
    return(sum);
  }
  
  public static double arraySum2(double[] nums) {
    double sum = 0;
    for(int i=0; i<nums.length; i++) {
      sum = sum + nums[i]; 
    }
    return(sum);
  }
  
  public static double arraySum3(double[] nums) {
    double sum = 0;
    int i=0;
    while(i<nums.length) {
      sum = sum + nums[i]; 
      i++; // Or i = i + 1, or i += 1
    }
    return(sum);
  }
  
  // Unlike the other three versions, this one fails for a 0-length array
  
  public static double arraySum4(double[] nums) {
    double sum = 0;
    int i=0;
    do {
      sum = sum + nums[i]; 
      i++; 
    } while(i<nums.length);
    return(sum);
  }

  public static double arraysAverage (double[] nums){
    double average = arraySum1(nums)/nums.length;
    return average;
  }

  public static int countPositive (double [] nums){
    int conta = 0;
    for(int i=0;i<nums.length;i++) {
      if(nums[i]>=0){
        conta ++;
      }
    }
    return conta;
  }

  public static int numInRange (double [] numeros, int lowerbound, int upperbound){
    int conta=0;
    for(int i=0;i<numeros.length;i++){
      if(numeros[i]>lowerbound){
        if(numeros[i]<upperbound){
          conta++;
        }
      }
    }
    return conta;
  }

}
