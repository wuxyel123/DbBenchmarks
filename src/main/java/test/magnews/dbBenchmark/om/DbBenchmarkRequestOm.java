package test.magnews.dbBenchmark.om;
/**
 * Represents the request for the dbBenchmark service
 * @author Alessandro Disclazi
 * */
public class DbBenchmarkRequestOm {
	
	/**Number of record on which the insert benchmark is executed*/
	Long insertNumberToBenchmark = 100L;
	
	/**Number of record on which the select benchmark is executed*/
	Long selectNumberToBenchmark = 100L;
	
	/**Number of DML statement after a commit must be performed*/
	Long commitAfterXStatement = 100L;

	/**
	 * @return the insertNumberToBenchmark
	 */
	public Long getInsertNumberToBenchmark() {
		return insertNumberToBenchmark;
	}

	/**
	 * @param insertNumberToBenchmark the insertNumberToBenchmark to set
	 */
	public void setInsertNumberToBenchmark(Long insertNumberToBenchmark) {
		this.insertNumberToBenchmark = insertNumberToBenchmark;
	}

	/**
	 * @return the selectNumberToBenchmark
	 */
	public Long getSelectNumberToBenchmark() {
		return selectNumberToBenchmark;
	}

	/**
	 * @param selectNumberToBenchmark the selectNumberToBenchmark to set
	 */
	public void setSelectNumberToBenchmark(Long selectNumberToBenchmark) {
		this.selectNumberToBenchmark = selectNumberToBenchmark;
	}

	/**
	 * @return the commitAfterXStatement
	 */
	public Long getCommitAfterXStatement() {
		return commitAfterXStatement;
	}

	/**
	 * @param commitAfterXStatement the commitAfterXStatement to set
	 */
	public void setCommitAfterXStatement(Long commitAfterXStatement) {
		this.commitAfterXStatement = commitAfterXStatement;
	}


	
	

}
