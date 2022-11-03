import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(System.getProperty("user.dir") + "/data.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();


        JsonArray jsonArrayOfNamendEmail = fileObject.get("info").getAsJsonArray();
        List<PojoClass> StoreValue= new ArrayList();

        for (JsonElement NameElement : jsonArrayOfNamendEmail.getAsJsonArray()) {
            JsonObject EmailJsonObject = NameElement.getAsJsonObject();

            String Name =  EmailJsonObject.get("name").getAsString();
            String Email =  EmailJsonObject.get("email").getAsString();

            PojoClass obj = new PojoClass(Name,Email);
            StoreValue.add(obj);
        }
        System.out.println("Names are"+ StoreValue);
    }
}
