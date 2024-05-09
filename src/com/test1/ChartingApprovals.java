package com.test1;

public class ChartingApprovals {
	private Integer setValueId;
	private Integer chartCode;
	private Integer sequenceId;
	private String chartSetRoleId;
	private String chartSetGroupName;
	private Integer chartSetApprovalTypeCode;
	private String chartSetApprovalType;
	private String chartSetApprovalTypeDesc;
	private String creationDate;
	private String modifeidDate;
	private String entityState;

	public ChartingApprovals() {

	}

	public ChartingApprovals(Integer setValueId, Integer chartCode, Integer sequenceId, String chartSetRoleId,
			String chartSetGroupName, Integer chartSetApprovalTypeCode, String chartSetApprovalType,
			String chartSetApprovalTypeDesc, String creationDate, String modifeidDate, String entityState) {
		super();
		this.setValueId = setValueId;
		this.chartCode = chartCode;
		this.sequenceId = sequenceId;
		this.chartSetRoleId = chartSetRoleId;
		this.chartSetGroupName = chartSetGroupName;
		this.chartSetApprovalTypeCode = chartSetApprovalTypeCode;
		this.chartSetApprovalType = chartSetApprovalType;
		this.chartSetApprovalTypeDesc = chartSetApprovalTypeDesc;
		this.creationDate = creationDate;
		this.modifeidDate = modifeidDate;
		this.entityState = entityState;
	}

	public Integer getSetValueId() {
		return setValueId;
	}

	public void setSetValueId(Integer setValueId) {
		this.setValueId = setValueId;
	}

	public Integer getChartCode() {
		return chartCode;
	}

	public void setChartCode(Integer chartCode) {
		this.chartCode = chartCode;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getChartSetRoleId() {
		return chartSetRoleId;
	}

	public void setChartSetRoleId(String chartSetRoleId) {
		this.chartSetRoleId = chartSetRoleId;
	}

	public String getChartSetGroupName() {
		return chartSetGroupName;
	}

	public void setChartSetGroupName(String chartSetGroupName) {
		this.chartSetGroupName = chartSetGroupName;
	}

	public Integer getChartSetApprovalTypeCode() {
		return chartSetApprovalTypeCode;
	}

	public void setChartSetApprovalTypeCode(Integer chartSetApprovalTypeCode) {
		this.chartSetApprovalTypeCode = chartSetApprovalTypeCode;
	}

	public String getChartSetApprovalType() {
		return chartSetApprovalType;
	}

	public void setChartSetApprovalType(String chartSetApprovalType) {
		this.chartSetApprovalType = chartSetApprovalType;
	}

	public String getChartSetApprovalTypeDesc() {
		return chartSetApprovalTypeDesc;
	}

	public void setChartSetApprovalTypeDesc(String chartSetApprovalTypeDesc) {
		this.chartSetApprovalTypeDesc = chartSetApprovalTypeDesc;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifeidDate() {
		return modifeidDate;
	}

	public void setModifeidDate(String modifeidDate) {
		this.modifeidDate = modifeidDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
