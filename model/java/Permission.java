package your.package.name.here;

import io.realm.RealmObject;
import User;
import RealmFile;

public class Permission extends RealmObject {
    private User user;
    private RealmFile file;
    private boolean mayRead;
    private boolean mayWrite;
    private boolean mayManage;

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; } 

    public RealmFile getFile() { return file; }

    public void setFile(RealmFile file) { this.file = file; } 

    public boolean isMayread() { return mayRead; }

    public void setMayread(boolean mayRead) { this.mayRead = mayRead; } 

    public boolean isMaywrite() { return mayWrite; }

    public void setMaywrite(boolean mayWrite) { this.mayWrite = mayWrite; } 

    public boolean isMaymanage() { return mayManage; }

    public void setMaymanage(boolean mayManage) { this.mayManage = mayManage; } 

}
