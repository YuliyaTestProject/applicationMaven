package json;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonTravers {

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public JsonTravers(String fileName) {
		this.fileName=fileName;
	}

	public JsonNode readFile(){
		JsonNode node = null;
		try {
			node = new ObjectMapper().readTree(new File(getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return node;
	}

	@Override public String toString() {
		return "JsonTravers{" + "fileName='" + fileName + '\'' + '}';
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		JsonTravers that = (JsonTravers) o;
		return Objects.equals(fileName, that.fileName);
	}

	@Override public int hashCode() {
		return Objects.hash(fileName);
	}
}
