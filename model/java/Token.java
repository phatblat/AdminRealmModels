package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import io.realm.RealmList;
import RealmFile;
import Account;

public class Token extends RealmObject {
    @PrimaryKey
    @Required
    private String token;
    @Required
    private Date expires;
    private Date revoked;
    private RealmList<RealmFile> files;
    private Account account;
    @Required
    private String app_id;

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; } 

    public Date getExpires() { return expires; }

    public void setExpires(Date expires) { this.expires = expires; } 

    public Date getRevoked() { return revoked; }

    public void setRevoked(Date revoked) { this.revoked = revoked; } 

    public RealmList<RealmFile> getFiles() { return files; }

    public void setFiles(RealmList<RealmFile> files) { this.files = files; } 

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; } 

    public String getApp_Id() { return app_id; }

    public void setApp_Id(String app_id) { this.app_id = app_id; } 

}
