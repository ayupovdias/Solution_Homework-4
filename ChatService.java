public interface ChatService {
    void sendMessage(String message);
}
interface ILegacyChatService{
    void sendMessage(String message);
}
class LegacyChatService implements ILegacyChatService{
     public void sendMessage(String message){
         System.out.println("Legacy Chat: "+message);
     }
}
class ChatServiceAdapter implements ChatService{
    LegacyChatService legacyChatService;
    public ChatServiceAdapter(LegacyChatService legacyChatService){
               this.legacyChatService=legacyChatService;
    }
    public void sendMessage(String message){
        legacyChatService.sendMessage(message);
    }
}
class ChatAdaptDemo{
    public static void main(String[] args){
        ChatServiceAdapter chat=new ChatServiceAdapter(new LegacyChatService());
        chat.sendMessage("Hello world!");
        chat.sendMessage("How are you?");
    }
}
