package your.package.name.here;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import User;
import ClusterNode;

public class RealmFile extends RealmObject {
    @PrimaryKey
    @Required
    private String id;
    @Required
    private String path;
    private User owner;
    private ClusterNode cluster_node;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; } 

    public String getPath() { return path; }

    public void setPath(String path) { this.path = path; } 

    public User getOwner() { return owner; }

    public void setOwner(User owner) { this.owner = owner; } 

    public ClusterNode getCluster_Node() { return cluster_node; }

    public void setCluster_Node(ClusterNode cluster_node) { this.cluster_node = cluster_node; } 

}
