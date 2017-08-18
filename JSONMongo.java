import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.json.JSONObject;

class TestJsonMongo {
    public static void main(String[] args) throws Exception{

        JSONObject jo = new JSONObject();
        String name ;
        int ph ;
        String email;
        String password ;
        String city ;


        jo.put("name","Deepa");
        jo.put("ph","12345");
        jo.put("password","qwerty");
        jo.put("email","deepa@ebullitent.com");
        jo.put("city","Chennai");

        name = jo.getString("name");
        ph = Integer.parseInt(jo.getString("ph"));
        email = jo.getString("email");
        password = jo.getString("password");
        city = jo.getString("city");


        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("test");

        MongoCollection<Document> collection = database.getCollection("user");
        collection.drop();
        Document doc = new Document("name", name)
                .append("ph", ph)
                .append("email", email)
                .append("password",password)
                .append("city", city);

        collection.insertOne(doc);

        MongoCursor<Document> cursor = collection.find().iterator();

        while (cursor.hasNext()) {

            System.out.println(cursor.next());
        }
    }
}
