# Solution_Homework-4

Part 1 Singleton
ConfigurationManager is a class that holds settings for the program. It makes sure only one of these exists

•   Singleton: Only one ConfigurationManager is allowed
•   Settings: Settings are stored in a key-value map
•   Case-Insensitive: You can look up settings using keys like "maxPlayers" or "MAXPLAYERS"
•   Print: print() outputs all settings to the console


1.  Get the manager: ConfigurationManager.getInstance()
2.  Add settings: manager.config.put("key", "value")
3.  Get a setting: manager.getConfig("key")
4.  Print settings: manager.print()

Part 2 Adapter
This code uses the Adapter pattern to make an old chat system (LegacyChatService) work with a new way of using chat services (ChatService).

•  ChatService: The new way to send messages.
•  LegacyChatService: The old chat system.
•  ChatServiceAdapter: The Adapter. It translates messages from the new way to the old way. It takes a LegacyChatService and lets you use it as a ChatService.

How it works:
The ChatServiceAdapter takes the LegacyChatService and provides a sendMessage method that just calls the LegacyChatService's sendMessage method. This lets you use the LegacyChatService without changing its code.