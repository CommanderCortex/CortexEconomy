package me.cortex.Economy.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import me.cortex.Economy.CEconomy;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.print.Doc;


public class MongoConnect {
    private MongoDatabase database;
    private MongoCollection playerData;
    private CEconomy plugin = CEconomy.getPlugin();


    public void connect(){
        MongoClient Client = new MongoClient(new MongoClientURI(plugin.getConfig().getString("uri")));
        setDatabase(Client.getDatabase("CEconomy"));
        MessageManager.ConsoleGood("DataBase Connected");
    }

    public void setPlayerDataDocument(Object value, String identifier, String uuid){
        Document document = new Document("uuid", uuid);
        Bson newValue = new Document(identifier, value);
        Bson updateOperation = new Document("$set", newValue);
        playerData.updateOne(document, updateOperation);
    }

    public Object getPlayerDataDocument(String identifier, String uuid){
        Document document = new Document("uuid", uuid);
        if(playerData.find(document).first() != null){
            Document found = (Document) playerData.find().first();
            return found.get(identifier);
        }

        MessageManager.ConsoleBad("Document in Null for UUID: " +  uuid);
        return null;
        
    }

    public MongoCollection getPlayerData() {
        return playerData;
    }

    public void setPlayerData(MongoCollection playerData) {
        playerData = playerData;
    }

    public MongoDatabase getDatabase(){
        return database;
    }

    public void setDatabase(MongoDatabase database){
        this.database = database;
    }


}
