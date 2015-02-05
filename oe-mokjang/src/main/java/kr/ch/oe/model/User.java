package kr.ch.oe.model;

import java.util.Date;
import java.util.List;

/**
 * 사용자(담임목사, 대교구장, 교구장, 목자, 목장원, 새신자 등)
 * @author gusfot
 *
 */
public class User {

	/**
	 * 소속 정보
	 */
	private Department department;
	
	/**
	 * 전도현황 목록
	 */
	private List<MissionWorkStatus> missionWorkStatusList;

	/**
	 * 양육현황 목록
	 */
	private List<EduStatus> eduStatusListList;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private Long userSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.reg_dt
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String regDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.addr
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String addr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.cell_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String cellPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.home_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String homePhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.job
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String job;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.gender
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String gender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.birth
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String birth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.dept_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private Long deptSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.reg_time
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	private Date regTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.role_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	/**
	 *  직분 번호
	 */
	private Long roleSeq;
	

	/**
	 * 해당직분
	 */
	private String roleName;
	/**
	 * 재적상태
	 */
	private long flag;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_seq
	 * @return  the value of user.user_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public Long getUserSeq() {
		return userSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_seq
	 * @param userSeq  the value for user.user_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.reg_dt
	 * @return  the value of user.reg_dt
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getRegDt() {
		return regDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.reg_dt
	 * @param regDt  the value for user.reg_dt
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.addr
	 * @return  the value of user.addr
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.addr
	 * @param addr  the value for user.addr
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.cell_phone
	 * @return  the value of user.cell_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.cell_phone
	 * @param cellPhone  the value for user.cell_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.home_phone
	 * @return  the value of user.home_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.home_phone
	 * @param homePhone  the value for user.home_phone
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.job
	 * @return  the value of user.job
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getJob() {
		return job;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.job
	 * @param job  the value for user.job
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.gender
	 * @return  the value of user.gender
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.gender
	 * @param gender  the value for user.gender
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.birth
	 * @return  the value of user.birth
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.birth
	 * @param birth  the value for user.birth
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.dept_seq
	 * @return  the value of user.dept_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public Long getDeptSeq() {
		return deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.dept_seq
	 * @param deptSeq  the value for user.dept_seq
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setDeptSeq(Long deptSeq) {
		this.deptSeq = deptSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.reg_time
	 * @return  the value of user.reg_time
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.reg_time
	 * @param regTime  the value for user.reg_time
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.role_id
	 * @return  the value of user.role_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public Long getRoleSeq() {
		return roleSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.role_id
	 * @param roleId  the value for user.role_id
	 * @mbggenerated  Thu Jan 08 11:00:07 KST 2015
	 */
	public void setRoleSeq(Long roleSeq) {
		this.roleSeq = roleSeq;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public long getFlag() {
		return flag;
	}

	public void setFlag(long flag) {
		this.flag = flag;
	}

	public List<MissionWorkStatus> getMissionWorkStatusList() {
		return missionWorkStatusList;
	}

	public void setMissionWorkList(List<MissionWorkStatus> missionWorkStatusList) {
		this.missionWorkStatusList = missionWorkStatusList;
	}

	public List<EduStatus> getEduStatusListList() {
		return eduStatusListList;
	}

	public void setEduStatusListList(List<EduStatus> eduStatusListList) {
		this.eduStatusListList = eduStatusListList;
	}
}