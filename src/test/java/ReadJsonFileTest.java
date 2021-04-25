import org.junit.Test;

import json.JsonTravers;

public class ReadJsonFileTest {


	@Test()
	public void testReadFileTestCase() {
		JsonTravers json = new JsonTravers("inputFile");
		System.out.println(json.readFile());

	}

}
