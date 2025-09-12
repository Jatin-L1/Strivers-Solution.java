package Strings.Easy;

public class largestoddnumber {
    public String largestOddNumber(String num) {
        int n = num.length();
        int index = 0;
        if(num.charAt(n-1)%2!=0) return num;
        else{
            for(int j = n-1;j>=0;j--){
                if(num.charAt(j)%2!=0) {
                    // index = j;
                    return num.substring(0 ,j+1);
                }
            }
        }
        return "";
    }
    
}
