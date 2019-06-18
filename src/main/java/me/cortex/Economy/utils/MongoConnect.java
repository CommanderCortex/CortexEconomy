package me.cortex.Economy.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import me.cortex.Economy.CEconomy;

public class MongoConnect {
    private MongoDatabase database;
    private CEconomy plugin = CEconomy.getPlugin();


    public void connect(){
        MongoClient Client = new MongoClient(new MongoClientURI(plugin.getConfig().getString("uri")));
        setDatabase(Client.getDatabase("CEconomy"));
        MessageManager.ConsoleGood("DataBase Connected");
    }

    public MongoDatabase getDatabase(){
        return database;
    }

    public void setDatabase(MongoDatabase database){
        this.database = database;
    }


}
