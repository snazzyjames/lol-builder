package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.undercouch.bson4jackson.types.ObjectId;
import org.jongo.MongoCollection;
import org.mindrot.jbcrypt.BCrypt;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by Snazzy on 9/23/14.
 */


public class User {

    @JsonProperty("_id")
    private ObjectId id;
    private String email;
    private String summonerName;
    private String passwordHash;

    public static MongoCollection users(){
        return PlayJongo.getCollection("users");
    }

    public User insert(String email, String summonerName, String passwordHash){
        this.email = email;
        this.summonerName = summonerName;
        this.passwordHash = passwordHash;
        users().save(this);
        return this;
    }

    public static boolean checkPassword(String candidate, String encryptedPassword) {
        if (candidate == null) {
            return false;
        }
        else if (encryptedPassword == null) {
            return false;
        }
        return BCrypt.checkpw(candidate, encryptedPassword);
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public static String generatePasswordHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public ObjectId getId() {
        return id;
    }

}
