const AccountSchema = {
  name: 'Account',
  properties: {
    provider: 'string',
    provider_id: { type: 'string',  indexed: true },
    data: { type: 'string',  optional: true },
    tokens: { type: 'list',  objectType: 'Token' },
    user: { type: 'User',  optional: true }
  }
};

const ClusterNodeSchema = {
  name: 'ClusterNode',
  primaryKey: 'id',
  properties: {
    id: 'string',
    files: { type: 'list',  objectType: 'RealmFile' }
  }
};

const MetadataSchema = {
  name: 'Metadata',
  properties: {
    userId: { type: 'string',  indexed: true },
    namespace: 'string',
    key: 'string',
    value: 'string'
  }
};

const PermissionSchema = {
  name: 'Permission',
  properties: {
    user: { type: 'User',  optional: true },
    file: { type: 'RealmFile',  optional: true },
    mayRead: 'bool',
    mayWrite: 'bool',
    mayManage: 'bool'
  }
};

const RealmFileSchema = {
  name: 'RealmFile',
  primaryKey: 'id',
  properties: {
    id: 'string',
    path: 'string',
    owner: { type: 'User',  optional: true },
    cluster_node: { type: 'ClusterNode',  optional: true }
  }
};

const TokenSchema = {
  name: 'Token',
  primaryKey: 'token',
  properties: {
    token: 'string',
    expires: 'date',
    revoked: { type: 'date',  optional: true },
    files: { type: 'list',  objectType: 'RealmFile' },
    account: { type: 'Account',  optional: true },
    app_id: 'string'
  }
};

const UserSchema = {
  name: 'User',
  primaryKey: 'id',
  properties: {
    id: 'string',
    accounts: { type: 'list',  objectType: 'Account' },
    isAdmin: 'bool'
  }
};

module.exports = {
  AccountSchema,
  ClusterNodeSchema,
  MetadataSchema,
  PermissionSchema,
  RealmFileSchema,
  TokenSchema,
  UserSchema
};
