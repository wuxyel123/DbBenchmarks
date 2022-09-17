package test.magnews.dbBenchmark.om;
/**
 * Represents the response of the DB benchmark service
 * @author Alessandro Disclazi
 * */
public class DbBenchmarkResponseOm {

	/**Stats of the insert benchmark*/
	BenchmarkStatsOm insertBenchmark;

	/**Stats of the select benchmark*/
	BenchmarkStatsOm selectBenchmark;

	/**Getter method for insertBenchmark*/
	public BenchmarkStatsOm getInsertBenchmark() {
		return insertBenchmark;
	}

	/**Setter method for insertBenchmark*/
	public void setInsertBenchmark(BenchmarkStatsOm insertBenchmark) {
		this.insertBenchmark = insertBenchmark;
	}

	/**Getter method for selectBenchmark*/
	public BenchmarkStatsOm getSelectBenchmark() {
		return selectBenchmark;
	}

	/**Setter method for selectBenchmark*/
	public void setSelectBenchmark(BenchmarkStatsOm selectBenchmark) {
		this.selectBenchmark = selectBenchmark;
	}

}
