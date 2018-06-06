
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

public class Example10_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File fread = new File("english.txt");
		File fwrite = new File("englishCount.txt");
		
		try {
			Writer out = new FileWriter(fwrite);
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			Reader in = new FileReader(fread);
			BufferedReader bufferedReader = new BufferedReader(in);
			String string = null;
			while ((string = bufferedReader.readLine())!= null) {
				StringTokenizer fenxi = new StringTokenizer(string);
				int count = fenxi.countTokens();
				string = string+"句中单词个数:"+count;
				bufferedWriter.write(string);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			out.close();
			in = new FileReader(fwrite);
			bufferedReader = new BufferedReader(in);
			String s = null;
			System.out.println(fwrite.getName());
			while((s = bufferedReader.readLine())!= null) {
				System.out.println(s);
			}
			bufferedReader.close();
			in.close();
		}
		catch (IOException e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
	}

}
