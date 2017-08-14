using System;
using System.Collections.Generic;
using Realms;

public class Account : RealmObject
{
    [Required]
    public string provider { get; set; }

    [Required]
    public string provider_id { get; set; }

    public string data { get; set; }

    public IList<Token> tokens { get; }

    public User user { get; set; }
}

public class ClusterNode : RealmObject
{
    [PrimaryKey]
    [Required]
    public string id { get; set; }

    public IList<RealmFile> files { get; }
}

public class Metadata : RealmObject
{
    [Required]
    public string userId { get; set; }

    [Required]
    public string namespace { get; set; }

    [Required]
    public string key { get; set; }

    [Required]
    public string value { get; set; }
}

public class Permission : RealmObject
{
    public User user { get; set; }

    public RealmFile file { get; set; }

    public bool mayRead { get; set; }

    public bool mayWrite { get; set; }

    public bool mayManage { get; set; }
}

public class RealmFile : RealmObject
{
    [PrimaryKey]
    [Required]
    public string id { get; set; }

    [Required]
    public string path { get; set; }

    public User owner { get; set; }

    public ClusterNode cluster_node { get; set; }
}

public class Token : RealmObject
{
    [PrimaryKey]
    [Required]
    public string token { get; set; }

    public DateTimeOffset expires { get; set; }

    public DateTimeOffset? revoked { get; set; }

    public IList<RealmFile> files { get; }

    public Account account { get; set; }

    [Required]
    public string app_id { get; set; }
}

public class User : RealmObject
{
    [PrimaryKey]
    [Required]
    public string id { get; set; }

    public IList<Account> accounts { get; }

    public bool isAdmin { get; set; }
}
