package sub3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WeatherReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable>{

	public List<Double> tempList = new ArrayList<Double>();
		
	@Override
	protected void reduce(Text city, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
	
		double temp= 0;
				
		for(DoubleWritable val : values) {
			temp = val.get();
		}
		
		tempList.add(temp);
		
		DoubleWritable result = new DoubleWritable(temp);
		context.write(city, result);
	}
	
	@Override
	protected void cleanup(Context context) throws IOException, InterruptedException {
		// ������ reduce �۾� �� �� �� �����ϴ� �޼���
		double total = 0;
		int size = tempList.size();
		
		for(double temp : tempList) {
			total += temp;
		}
		
		context.write(new Text("�� : "+size+"��"), null);
		context.write(new Text("��� �µ� : "+total/size+"��"), null);
	}
	
}
