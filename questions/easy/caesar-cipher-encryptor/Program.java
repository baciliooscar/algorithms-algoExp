class Program {
  public static String caesarCypherEncryptor(String str, int key) {
		char a='a';
		char z='z';
		int diff=(int)z-(int)a+1;
		key=key%26;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if( (str.charAt(i)+key) < a){
				sb.append((char)(str.charAt(i)+key+diff));
			}else if( (str.charAt(i)+key) > z){
				sb.append((char)(str.charAt(i)+key-diff));
			}else{
				sb.append((char)(str.charAt(i)+key));
			}
		}
    return sb.toString();
  }
}
