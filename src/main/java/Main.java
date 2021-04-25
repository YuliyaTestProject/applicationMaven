import conditions.ConditionCheckers;
import json.JsonTravers;

public class Main {

	// Dev language: Java
	// Test framework: JUnit (/TestNG/Spock optional)
	// Build framework: Gradle
	//
	// Target:
	// Implement and cover with unit tests console application which find recursively and output count of objects in a
	// "given" json document:
	// - which contains "specific field" only
	// - which contains "specific field" and "specific value"
	//
	// Separate "json tree" travers and condition checkers in separate classes.
	//
	// Application should consume following arguments (no validation required):
	// - "given" json document file path
	// - "specific field"
	// - "specific value"
	//
	// For instance, in a following format `java -jar application.jar /home/user/testDocument.json childCount 5` with
	// ouptut similar to:
	// - found 5 objects with field "childCount"
	// - found 3 objects where "childCount" equals "5"

	public static void main(String[] args) {
		// For instance, in a following format `java -jar application.jar /home/user/testDocument.json childCount 5`
		runApplication(args);

	}
	private static void runApplication(String[] args){
		JsonTravers json = new JsonTravers(args[0]);
		ConditionCheckers checker = new ConditionCheckers(args[1],args[2],json.readFile());
		checker.getResults();
	}
}
