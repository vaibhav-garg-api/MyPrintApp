import java.util.*;
class AllPermutations {
	public static void main(String[] args){
		
		String s = "Vaibhav";
		System.out.println(permutate(s));
	}
	public static ArrayList<String> permutate(String s){
		if(s.equals("")){
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		
		
		char c = s.charAt(0);
		String rs = s.substring(1);
		ArrayList<String> MyResult = new ArrayList<>();
		ArrayList<String> RemResult = permutate(rs);
		for(String ps:RemResult){
			for(int i=0;i<=ps.length();i++){
				String val= ps.substring(0,i)+c+ps.substring(i);
				MyResult.add(val);
			}	
		}
		return MyResult;
	}
			
}
