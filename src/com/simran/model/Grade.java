package com.simran.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gradeId;
	private String  gradeName;
	private Double gradeBasic;
	private Double gradeDa;
	private Double gradeHra;
	private Double gradeMa;
	private Double gradeBonus;
	private Double gradePf;
	public Integer getGradeId() {
		return gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Double getGradeBasic() {
		return gradeBasic;
	}
	public void setGradeBasic(Double gradeBasic) {
		this.gradeBasic = gradeBasic;
	}
	public Double getGradeDa() {
		return gradeDa;
	}
	public void setGradeDa(Double gradeDa) {
		this.gradeDa = gradeDa;
	}
	public Double getGradeHra() {
		return gradeHra;
	}
	public void setGradeHra(Double gradeHra) {
		this.gradeHra = gradeHra;
	}
	public Double getGradeMa() {
		return gradeMa;
	}
	public void setGradeMa(Double gradeMa) {
		this.gradeMa = gradeMa;
	}
	public Double getGradeBonus() {
		return gradeBonus;
	}
	public void setGradeBonus(Double gradeBonus) {
		this.gradeBonus = gradeBonus;
	}
	public Double getGradePf() {
		return gradePf;
	}
	public void setGradePf(Double gradePf) {
		this.gradePf = gradePf;
	}

}
