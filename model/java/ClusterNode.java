package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import io.realm.RealmList;
import RealmFile;

public class ClusterNode extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    private RealmList<RealmFile> files;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; } 

    public RealmList<RealmFile> getFiles() { return files; }

    public void setFiles(RealmList<RealmFile> files) { this.files = files; } 

}
