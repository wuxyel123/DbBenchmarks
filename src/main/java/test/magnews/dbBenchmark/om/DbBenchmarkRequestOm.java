package test.magnews.dbBenchmark.om;
/**
 * Represents the request for the dbBenchmark service
 * @author Alessandro Disclazi
 * */
public class DbBenchmarkRequestOm {
	
	/**Number of DML statement after a commit must be performed*/
	Long commitAfterXStatement = 100L;

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
