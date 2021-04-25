import org.junit.Test;

import conditions.ConditionCheckers;
import json.JsonTravers;

public class FindSpecificFieldOrValueTest {

	@Test()
	public void findSpecificFieldTestCase() {
		JsonTravers json = new JsonTravers("inputFile");
		ConditionCheckers checker = new ConditionCheckers("title",null,json.readFile());
		System.out.println(checker.countSpecificField());
	}

	@Test()
	public void findSpecificValueTestCase() {
		JsonTravers json = new JsonTravers("inputFile");
		ConditionCheckers checker = new ConditionCheckers("para","SSSSSSSSS",json.readFile());
		System.out.println(checker.countSpecificValue());
	}
}
