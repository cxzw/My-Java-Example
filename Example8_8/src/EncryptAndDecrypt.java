public class EncryptAndDecrypt{
	String encrypt (String sourceString,String password) {		//加密算法
		char [] p = password.toCharArray();
		int n = p.length;
		char [] c = sourceString.toCharArray();
		int m = c.length;
		for(int k=0; k<m; k++) {
			int mima = c[k]+p[k%n];		//加密
			c[k] = (char)mima;
		}
		return new String(c);
	}
	String decrypt (String soureString,String password) {		//解密算法
		char [] p = password.toCharArray();
		int n = p.length;
		char [] c = soureString.toCharArray();
		int m = c.length;
		for(int k=0; k<m; k++) {
			int mima = c[k]-p[k%n];		//解密
			c[k] = (char)mima;
		}
		return new String(c);
	}
}