package conditions;

import org.codehaus.jackson.JsonNode;

public class ConditionCheckers {

	private String fieldName;
	private String fieldValue;

	public JsonNode getNodes() {
		return nodes;
	}

	JsonNode nodes;

	public ConditionCheckers(String fieldName, String fieldValue,JsonNode nodes) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.nodes=nodes;
	}

	protected String getFieldName() {
		return fieldName;
	}

	protected String getFieldValue() {
		return fieldValue;
	}

	public void getResults(){
		System.out.println(String.format("Found %s object(s) with field %s",countSpecificField(),getFieldName()));
		System.out.println(String.format("Found %s object(s) where %s equals %s",countSpecificValue(),getFieldName(),getFieldValue()));
	}

	public int countSpecificField(){
		return getNodes().findValues(getFieldName()).size();

//		int count =0;
//		for (JsonNode jsonNode : getNodes().findValues(getFieldName())) {
//			count++;
//			System.out.println(jsonNode.asText());
//		}
//		return count;

	}
	public long countSpecificValue(){

		return getNodes().findValues(getFieldName()).stream().filter(value->value.asText().equals(getFieldValue())).count();
//		int count =0;
//		for (
//				JsonNode jsonNode : getNodes().findValues(getFieldName())) {
//			System.out.println(jsonNode.asText());
//			if(jsonNode.asText().equals(getFieldValue())){
//				count++;
//				System.out.println(count);
//
//			}
//		}
//		return count;

	}


}
