package oram;

import java.util.concurrent.TimeUnit;
import oram.TestCircuitOramRec.EvaRunnable;
import flexsc.Flag;

public class TestCircuitOramRecClient {

	public  static void main(String args[]) throws Exception {
		for(int i = 12; i <=16 ; i+=4) {
			Flag.sw.flush();
			EvaRunnable eva = new EvaRunnable("172.27.234.1", 6550);
			eva.run();
			Flag.sw.print();
			System.out.print("\n");
			
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
