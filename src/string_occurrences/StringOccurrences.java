package string_occurrences;

public class StringOccurrences {
	
	public static long repeatedString(String s, long n) {
		
		long temp = 0;
        long temp1 = 0;
        long remind = 0;
        long res = 0;
		char[] ch = s.toCharArray();
		
		char search = 'a';
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(ch[i] == search) {
				count++;
			}
		}
		
		temp = n/s.length();
        res = temp * count;
        remind = n % s.length();
        
        for(int i = 0; i < remind; i++){
           if(s.charAt(i) == 'a'){
               temp1++;
           }
        }
        return res + temp1;
		
	}

	public static void main(String[] args) {
		
		System.out.println(repeatedString("abcacabcac", 10));

	}

}
