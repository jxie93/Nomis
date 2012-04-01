import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; 

public class HighMarkRanking {
	
	public static ArrayList<Record> read(){
		ArrayList<Record> r= new ArrayList<Record>(1);
		r.clear();
        
		try {
            File csv = new File("resources/highmarksranking.csv"); 

            BufferedReader br = new BufferedReader(new FileReader(csv));

         
            String line = "";
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");

                while (st.hasMoreTokens()) {
        
                    Record w = new Record(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
                    r.add(w);                    
                }
                
            }
            br.close();

        } catch (FileNotFoundException e) {
            // 捕获File对象生成时的异常
            e.printStackTrace();
        } catch (IOException e) {
         
            e.printStackTrace();
        } 
		for (int i=0;i<r.size();i++)
		System.out.println(r.get(i).getrank()+" "+r.get(i).getmarks()+" "+r.get(i).getlevels());
		return r;
	}
	
	public static void write(ArrayList<Record> r,int presentmark,int levels) {
        try {
            
            
            boolean canberecorded =false;
            for (int i=0;i<r.size();i++) 
            {
            	if (presentmark>r.get(i).getmarks()) 
            	{
            		canberecorded=true;
            		System.out.println("Your marks has benn recorded!");
            		Record rr= new Record(i+1,presentmark,levels);
            		r.set(i,rr);
            		break;
            	}
            }
            
            if (canberecorded)
            {
            File csv = new File("resources/highmarksranking.csv"); 
            csv.delete();
            csv.createNewFile();
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
            for (int i=0;i<r.size();i++) bw.write(((r.get(i).getrank())+","+r.get(i).getmarks()+","+r.get(i).getlevels()+"\r\n"));
            bw.close();
            }
        } catch (FileNotFoundException e) {
            // 捕获File对象生成时的异常
            e.printStackTrace();
        } catch (IOException e) {
            // 捕获BufferedWriter对象关闭时的异常
            e.printStackTrace();
        }
    } 
	

	public static void main(String[] args){
		read();
		write(read(),200,10);
		read();
	}
	
}
