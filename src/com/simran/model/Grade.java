package com.simran.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Grade {
	@Id
	private Integer gradeId;
	private String  gradeName;
	private String  gradeShortName;
	private Integer gradeBasic;
	private Integer gradeTa;
	private Integer gradeDa;
	private Integer gradeHra;
	private Integer gradeMa;
	private Integer gradeBonus;
	private Integer gradePf;
	private Integer gradePt;

	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getGradeShortName() {
		return gradeShortName;
	}
	public void setGradeShortName(String gradeShortName) {
		this.gradeShortName = gradeShortName;
	}
	public Integer getGradeBasic() {
		return gradeBasic;
	}
	public void setGradeBasic(Integer gradeBasic) {
		this.gradeBasic = gradeBasic;
	}
	public Integer getGradeTa() {
		return gradeTa;
	}
	public void setGradeTa(Integer gradeTa) {
		this.gradeTa = gradeTa;
	}
	public Integer getGradeDa() {
		return gradeDa;
	}
	public void setGradeDa(Integer gradeDa) {
		this.gradeDa = gradeDa;
	}
	public Integer getGradeHra() {
		return gradeHra;
	}
	public void setGradeHra(Integer gradeHra) {
		this.gradeHra = gradeHra;
	}
	public Integer getGradeMa() {
		return gradeMa;
	}
	public void setGradeMa(Integer gradeMa) {
		this.gradeMa = gradeMa;
	}
	public Integer getGradeBonus() {
		return gradeBonus;
	}
	public void setGradeBonus(Integer gradeBonus) {
		this.gradeBonus = gradeBonus;
	}
	public Integer getGradePf() {
		return gradePf;
	}
	public void setGradePf(Integer gradePf) {
		this.gradePf = gradePf;
	}
	public Integer getGradePt() {
		return gradePt;
	}
	public void setGradePt(Integer gradePt) {
		this.gradePt = gradePt;
	}
}
