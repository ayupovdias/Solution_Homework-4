import java.util.Map;
import java.util.HashMap;
public class ConfigurationManager {
    public static ConfigurationManager instance=new ConfigurationManager();

    public static Map<String,String> config=new HashMap<>();
    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
        return instance;

    }

    public static String getConfig(String string){
        for(Map.Entry<String,String> item:config.entrySet()){
            if(item.getKey().toLowerCase().equals(string.toLowerCase())){
                 return item.getValue();

            }
        }
        return "There is no such the key in config";
    }
    public static void print(){
        for(Map.Entry<String,String> item:config.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
    }
}
class ConfigManagerDemo{
    public static void main(String[] args){
        ConfigurationManager manager=ConfigurationManager.getInstance();
        ConfigurationManager managerOne=ConfigurationManager.getInstance();
        System.out.println(manager+" "+managerOne);
        managerOne.config.put("maxPlayers","100");
        manager.config.put("defaultLanguage","en");
        ConfigurationManager.config.put("gameDifficulty","medium");
        managerOne.print();
        System.out.println(manager+"  "+managerOne);
        System.out.println(manager.getConfig("maxPlayers"));
        System.out.println(ConfigurationManager.getConfig("defaultLanguage"));
        System.out.println(managerOne.getConfig("gameDifficulty"));
        System.out.println(ConfigurationManager.getConfig("maxplayer"));
    }
}
