package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.undercouch.bson4jackson.types.ObjectId;
import org.jongo.MongoCollection;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by Snazzy on 9/23/14.
 */


public class User {

    @JsonProperty("_id")
    private ObjectId id;

    private String name;

    public static MongoCollection users(){
        return PlayJongo.getCollection("users");
    }

    public User insert(){
        users().save(this);
        return this;
    }
}
