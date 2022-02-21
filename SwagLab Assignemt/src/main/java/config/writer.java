package config;

import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class writer {
    protected String JSON_FILE_PATH = "config.json";

    @SuppressWarnings("unchecked")
	public void write_to_json(String key, String value){
        // WRITE TO JSON FILE
        try {
            JSONObject jo = new JSONObject();
            jo.put(key, value);
            PrintWriter pw = new PrintWriter(JSON_FILE_PATH);
            pw.write(jo.toJSONString());
            pw.flush();
            pw.close();
        }catch (FileNotFoundException ex){
        }
    }
//READ FROM JSON

    public String read_value_from_json(String key){
        try {
            Object obj = new JSONParser().parse(new FileReader(JSON_FILE_PATH));
            JSONObject jo = (JSONObject) obj;
            String value = (String) jo.get(key);    // System.out.println(value);
            return value;
        }catch(Exception ex){
            return "";
        }
    }
    
    public static final String firstName = "Prakhar";
    public static final String lastName = "Srivastava";
    public static final String postalCode = "201310";
}