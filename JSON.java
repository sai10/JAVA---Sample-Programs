import org.json.JSONObject;

public class TestJsonMongo {
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
        
        System.out.println("Name:-"+name);
        System.out.println("Phone Number:-"+ph);
        System.out.println("Email:-"+email);
        System.out.println("Password:-"+password);
        System.out.println("City:-"+city);
        }  
  }      
