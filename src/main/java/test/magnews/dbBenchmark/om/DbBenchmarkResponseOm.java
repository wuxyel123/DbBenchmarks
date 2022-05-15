package test.magnews.dbBenchmark.om;
/**
 * Represents the response of the DB benchmark service
 * @author Alessandro Disclazi
 * */
public class DbBenchmarkResponseOm {

	/**Number of records inserted in the database*/
	Long insertedRecord;
	
	/**Minimum time elapsed for an insert statement in nanoseconds*/
	Long minInsertTimeNanoSeconds;
	
	/**Maximum time elapsed for an insert statement in nanoseconds*/
	Long maxInsertTimeNanoSeconds;
	
	/**Average time elapsed for inserts statements in nanoseconds*/
	Long avgInsertTimeNanoSeconds;
	
	/**Number of records queryed in the database*/
	Long queryedRecords;
	
	/**Minimum time elapsed for a select statement in nanoseconds*/
	Long minSelectTimeNanoSeconds;
	
	/**Maximum time elapsed for a select statement in nanoseconds*/
	Long maxSelectTimeNanoSeconds;
	
	/**Average time elapsed for selects statements in nanoseconds*/
	Long avgSelectTimeNanoSeconds;

	/**
	 * @return the insertedRecord
	 */
	public Long getInsertedRecord() {
		return insertedRecord;
	}

	/**
	 * @param insertedRecord the insertedRecord to set
	 */
	public void setInsertedRecord(Long insertedRecord) {
		this.insertedRecord = insertedRecord;
	}

	/**
	 * @return the minInsertTimeNanoSeconds
	 */
	public Long getMinInsertTimeNanoSeconds() {
		return minInsertTimeNanoSeconds;
	}

	/**
	 * @param minInsertTimeNanoSeconds the minInsertTimeNanoSeconds to set
	 */
	public void setMinInsertTimeNanoSeconds(Long minInsertTimeNanoSeconds) {
		this.minInsertTimeNanoSeconds = minInsertTimeNanoSeconds;
	}

	/**
	 * @return the maxInsertTimeNanoSeconds
	 */
	public Long getMaxInsertTimeNanoSeconds() {
		return maxInsertTimeNanoSeconds;
	}

	/**
	 * @param maxInsertTimeNanoSeconds the maxInsertTimeNanoSeconds to set
	 */
	public void setMaxInsertTimeNanoSeconds(Long maxInsertTimeNanoSeconds) {
		this.maxInsertTimeNanoSeconds = maxInsertTimeNanoSeconds;
	}

	/**
	 * @return the avgInsertTimeNanoSeconds
	 */
	public Long getAvgInsertTimeNanoSeconds() {
		return avgInsertTimeNanoSeconds;
	}

	/**
	 * @param avgInsertTimeNanoSeconds the avgInsertTimeNanoSeconds to set
	 */
	public void setAvgInsertTimeNanoSeconds(Long avgInsertTimeNanoSeconds) {
		this.avgInsertTimeNanoSeconds = avgInsertTimeNanoSeconds;
	}

	/**
	 * @return the queryedRecords
	 */
	public Long getQueryedRecords() {
		return queryedRecords;
	}

	/**
	 * @param queryedRecords the queryedRecords to set
	 */
	public void setQueryedRecords(Long queryedRecords) {
		this.queryedRecords = queryedRecords;
	}

	/**
	 * @return the minSelectTimeNanoSeconds
	 */
	public Long getMinSelectTimeNanoSeconds() {
		return minSelectTimeNanoSeconds;
	}

	/**
	 * @param minSelectTimeNanoSeconds the minSelectTimeNanoSeconds to set
	 */
	public void setMinSelectTimeNanoSeconds(Long minSelectTimeNanoSeconds) {
		this.minSelectTimeNanoSeconds = minSelectTimeNanoSeconds;
	}

	/**
	 * @return the maxSelectTimeNanoSeconds
	 */
	public Long getMaxSelectTimeNanoSeconds() {
		return maxSelectTimeNanoSeconds;
	}

	/**
	 * @param maxSelectTimeNanoSeconds the maxSelectTimeNanoSeconds to set
	 */
	public void setMaxSelectTimeNanoSeconds(Long maxSelectTimeNanoSeconds) {
		this.maxSelectTimeNanoSeconds = maxSelectTimeNanoSeconds;
	}

	/**
	 * @return the avgSelectTimeNanoSeconds
	 */
	public Long getAvgSelectTimeNanoSeconds() {
		return avgSelectTimeNanoSeconds;
	}

	/**
	 * @param avgSelectTimeNanoSeconds the avgSelectTimeNanoSeconds to set
	 */
	public void setAvgSelectTimeNanoSeconds(Long avgSelectTimeNanoSeconds) {
		this.avgSelectTimeNanoSeconds = avgSelectTimeNanoSeconds;
	}

}
