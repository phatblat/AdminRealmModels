package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.Required;

public class Metadata extends RealmObject {
    @Index
    @Required
    private String userId;
    @Required
    private String namespace;
    @Required
    private String key;
    @Required
    private String value;

    public String getUserid() { return userId; }

    public void setUserid(String userId) { this.userId = userId; } 

    public String getNamespace() { return namespace; }

    public void setNamespace(String namespace) { this.namespace = namespace; } 

    public String getKey() { return key; }

    public void setKey(String key) { this.key = key; } 

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; } 

}
