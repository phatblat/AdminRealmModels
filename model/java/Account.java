package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.Required;
import io.realm.annotations.Index;
import io.realm.RealmList;
import Token;
import User;

public class Account extends RealmObject {
    @Required
    private String provider;
    @Index
    @Required
    private String provider_id;
    private String data;
    private RealmList<Token> tokens;
    private User user;

    public String getProvider() { return provider; }

    public void setProvider(String provider) { this.provider = provider; } 

    public String getProvider_Id() { return provider_id; }

    public void setProvider_Id(String provider_id) { this.provider_id = provider_id; } 

    public String getData() { return data; }

    public void setData(String data) { this.data = data; } 

    public RealmList<Token> getTokens() { return tokens; }

    public void setTokens(RealmList<Token> tokens) { this.tokens = tokens; } 

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; } 

}
