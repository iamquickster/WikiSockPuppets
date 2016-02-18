package wikisockpuppets;


import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

/*
 * Histogram of the amount of new investigations opened per month
 * 
 * 
 */
public class WikiSockPuppetHisto {

	public class DistinctTokenCountReducer extends MapReduceBase implements Reducer<Text, Text, Text, IntWritable >{

		@Override
		public void reduce(Text key, Iterator<Text> value, OutputCollector<Text, IntWritable> output, Reporter reporter)
				throws IOException {
			// TODO Auto-generated method stub
			
		}

	}

	/*
	 * Implementation of Mapper for Histogram
	 * Key: Month of investigation
	 * Value: Name of investigated account
	 */
	public static class SockPuppetNameMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, Text>{

		@Override
		public void map(LongWritable key, Text value, OutputCollector<Text, Text> output, Reporter reporter)
				throws IOException {
			
			//TODO Implement Mapper
			/*
			 * for each line
			 * 		if "Sockpuppet" is in title
			 * 			key = date of file
			 * 			value = parse name of investigated
			 * 		else 
			 * 			return
			 */
			String line = value.toString();
			
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JobConf conf = new JobConf(WikiSockPuppetHisto.class);
		conf.setJobName("Wikipedia Sock Puppets Histogram");
		
		//Output params
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(IntWritable.class);
		
		//MapReduce components
		conf.setMapperClass(WikiSockPuppetHisto.SockPuppetNameMapper.class);
		conf.setReducerClass(WikiSockPuppetHisto.DistinctTokenCountReducer.class);
		
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		JobClient.runJob(conf);
		
	}

}
