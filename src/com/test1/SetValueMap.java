package com.test1;

public class SetValueMap {
	private Integer setValueId;
	private String chartingsetvalue1;
	private String CreationDate;
	private String chartingsetValue2;
	private String chartingValue2;
	private String chartingsetValue3;
	private String chartingValue3;
	private String chartingSystem;
	private String modifiedDate;
	private String entityState;

	public SetValueMap() {

	}

	public SetValueMap(Integer setValueId, String chartingsetvalue1, String creationDate, String chartingsetValue2,
			String chartingValue2, String chartingsetValue3, String chartingValue3, String chartingSystem,
			String modifiedDate, String entityState) {
		super();
		this.setValueId = setValueId;
		this.chartingsetvalue1 = chartingsetvalue1;
		CreationDate = creationDate;
		this.chartingsetValue2 = chartingsetValue2;
		this.chartingValue2 = chartingValue2;
		this.chartingsetValue3 = chartingsetValue3;
		this.chartingValue3 = chartingValue3;
		this.chartingSystem = chartingSystem;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSetValueId() {
		return setValueId;
	}

	public void setSetValueId(Integer setValueId) {
		this.setValueId = setValueId;
	}

	public String getChartingsetvalue1() {
		return chartingsetvalue1;
	}

	public void setChartingsetvalue1(String chartingsetvalue1) {
		this.chartingsetvalue1 = chartingsetvalue1;
	}

	public String getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}

	public String getChartingsetValue2() {
		return chartingsetValue2;
	}

	public void setChartingsetValue2(String chartingsetValue2) {
		this.chartingsetValue2 = chartingsetValue2;
	}

	public String getChartingValue2() {
		return chartingValue2;
	}

	public void setChartingValue2(String chartingValue2) {
		this.chartingValue2 = chartingValue2;
	}

	public String getChartingsetValue3() {
		return chartingsetValue3;
	}

	public void setChartingsetValue3(String chartingsetValue3) {
		this.chartingsetValue3 = chartingsetValue3;
	}

	public String getChartingValue3() {
		return chartingValue3;
	}

	public void setChartingValue3(String chartingValue3) {
		this.chartingValue3 = chartingValue3;
	}

	public String getChartingSystem() {
		return chartingSystem;
	}

	public void setChartingSystem(String chartingSystem) {
		this.chartingSystem = chartingSystem;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}