package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import io.realm.RealmList;
import Account;

public class User extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    private RealmList<Account> accounts;
    private boolean isAdmin;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; } 

    public RealmList<Account> getAccounts() { return accounts; }

    public void setAccounts(RealmList<Account> accounts) { this.accounts = accounts; } 

    public boolean isIsadmin() { return isAdmin; }

    public void setIsadmin(boolean isAdmin) { this.isAdmin = isAdmin; } 

}
