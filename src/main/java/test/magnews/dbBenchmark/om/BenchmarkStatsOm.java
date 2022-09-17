package test.magnews.dbBenchmark.om;
/**
 * Represents data of a benchmark
 * @author Alessandro Disclazi
 * */
public class BenchmarkStatsOm {

	/**Number of records*/
	Long records;
	
	/**Minimum time elapsed for an insert statement in nanoseconds*/
	Long minTimeNanoSec;
	
	/**Maximum time elapsed for an insert statement in nanoseconds*/
	Long maxTimeNanoSec;

	/**Average time elapsed for inserts statements in nanoseconds*/
	Long avgTimeNanoSec;

	//Default constructor
	public BenchmarkStatsOm(){}


	public BenchmarkStatsOm(Long records, Long minTimeNanoSec, Long maxTimeNanoSec, Long avgTimeNanoSec) {
		this.records = records;
		this.minTimeNanoSec = minTimeNanoSec;
		this.maxTimeNanoSec = maxTimeNanoSec;
		this.avgTimeNanoSec = avgTimeNanoSec;
	}

	/**Getter method for records field*/
	public Long getRecords() {
		return records;
	}

	/**Setter method for records field*/
	public void setRecords(Long records) {
		this.records = records;
	}

	/**Getter method for minTimeNanoSec field*/
	public Long getMinTimeNanoSec() {
		return minTimeNanoSec;
	}

	/**Setter method for minTimeNanoSec field*/
	public void setMinTimeNanoSec(Long minTimeNanoSec) {
		this.minTimeNanoSec = minTimeNanoSec;
	}

	/**Getter method for maxTimeNanoSec field*/
	public Long getMaxTimeNanoSec() {
		return maxTimeNanoSec;
	}

	/**Setter method for maxTimeNanoSec field*/
	public void setMaxTimeNanoSec(Long maxTimeNanoSec) {
		this.maxTimeNanoSec = maxTimeNanoSec;
	}

	/**Getter method for avgTimeNanoSec field*/
	public Long getAvgTimeNanoSec() {
		return avgTimeNanoSec;
	}

	/**Setter method for avgTimeNanoSec field*/
	public void setAvgTimeNanoSec(Long avgTimeNanoSec) {
		this.avgTimeNanoSec = avgTimeNanoSec;
	}
}
