package oram;

import java.util.concurrent.TimeUnit;
import oram.TestCircuitOramRec.EvaRunnable;
import flexsc.Flag;

public class TestCircuitOramRecClient {

	public  static void main(String args[]) throws Exception {
		for(int i = 12; i <=20 ; i+=2) {
			Flag.sw.flush();
			EvaRunnable eva = new EvaRunnable("52.9.51.202", 6550);
			eva.run();
			Flag.sw.print();
			System.out.print("\n");
			
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
