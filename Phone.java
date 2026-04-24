import java.util.*;
public class Phone{
    public static void main(String[] args) {
        String input="23";
        String[] Keyped = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder currans = new StringBuilder();
        List<String> result = new ArrayList<>();
        solve(input,Keyped,0,currans,result);

        for(String s:result){
            System.out.print(s+" ");
        }
    
    }
    public static void solve(String input,String[] Keyped,int index,StringBuilder currans,List<String> result){
        if(index==input.length()){
            result.add(currans.toString());
            return;
        }
        int digit = input.charAt(index)-'0';
        String mapping = Keyped[digit];
        for(int i=0;i<mapping.length();i++){
            currans.append(mapping.charAt(i));
            solve(input,Keyped,index+1,currans,result);
            currans.deleteCharAt(currans.length()-1);
        }
    }
}
