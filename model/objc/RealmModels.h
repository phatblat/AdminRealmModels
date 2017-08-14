#import <Foundation/Foundation.h>
#import <Realm/Realm.h>

@interface Account : RLMObject
@end

@interface ClusterNode : RLMObject
@end

@interface Metadata : RLMObject
@end

@interface Permission : RLMObject
@end

@interface RealmFile : RLMObject
@end

@interface Token : RLMObject
@end

@interface User : RLMObject
@end


RLM_ARRAY_TYPE(Account)
RLM_ARRAY_TYPE(ClusterNode)
RLM_ARRAY_TYPE(Metadata)
RLM_ARRAY_TYPE(Permission)
RLM_ARRAY_TYPE(RealmFile)
RLM_ARRAY_TYPE(Token)
RLM_ARRAY_TYPE(User)


NS_ASSUME_NONNULL_BEGIN

@interface Account()

@property NSString *provider;
@property NSString *provider_id;
@property (nullable) NSString *data;
@property RLMArray<Token *><Token> *tokens;
@property (nullable) User *user;

@end

@interface ClusterNode()

@property NSString *id;
@property RLMArray<RealmFile *><RealmFile> *files;

@end

@interface Metadata()

@property NSString *userId;
@property NSString *namespace;
@property NSString *key;
@property NSString *value;

@end

@interface Permission()

@property (nullable) User *user;
@property (nullable) RealmFile *file;
@property BOOL mayRead;
@property BOOL mayWrite;
@property BOOL mayManage;

@end

@interface RealmFile()

@property NSString *id;
@property NSString *path;
@property (nullable) User *owner;
@property (nullable) ClusterNode *cluster_node;

@end

@interface Token()

@property NSString *token;
@property NSDate *expires;
@property (nullable) NSDate *revoked;
@property RLMArray<RealmFile *><RealmFile> *files;
@property (nullable) Account *account;
@property NSString *app_id;

@end

@interface User()

@property NSString *id;
@property RLMArray<Account *><Account> *accounts;
@property BOOL isAdmin;

@end

NS_ASSUME_NONNULL_END
