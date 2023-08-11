package in.co.rays.project_3.exception;

public class DuplicateRecordException extends Exception{
	/**
	 * @author Shaswat Mandre
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateRecordException(String msg){
		super(msg);
	}
}
