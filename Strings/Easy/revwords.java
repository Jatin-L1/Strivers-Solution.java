package Strings.Easy;

public class revwords {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        String ans = "";

        for(int i = arr.length-1 ; i >=0;i--){
            if(arr[i]!=" "){
                ans+=arr[i];
                ans+=" ";
            }
        }
        return ans.trim();
        
    }
    
}
