package kr.ch.oe.model;

public class Edu {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.edu_seq
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	private Long eduSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.edu_name
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	private String eduName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.edu_seq
	 * @return  the value of edu.edu_seq
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	public Long getEduSeq() {
		return eduSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.edu_seq
	 * @param eduSeq  the value for edu.edu_seq
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	public void setEduSeq(Long eduSeq) {
		this.eduSeq = eduSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.edu_name
	 * @return  the value of edu.edu_name
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	public String getEduName() {
		return eduName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.edu_name
	 * @param eduName  the value for edu.edu_name
	 * @mbggenerated  Thu Jan 08 10:26:29 KST 2015
	 */
	public void setEduName(String eduName) {
		this.eduName = eduName;
	}
}