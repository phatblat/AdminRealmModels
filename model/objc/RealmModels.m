#import "RealmModels.h"

@implementation Account

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"provider",
        @"provider_id",
    ];
}

+ (NSArray<NSString *> *)indexedProperties {
    return @[
        @"provider_id",
    ];
}

@end


@implementation ClusterNode

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"id",
    ];
}

+ (NSString *)primaryKey {
    return @"id";
}

@end


@implementation Metadata

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"userId",
        @"namespace",
        @"key",
        @"value",
    ];
}

+ (NSArray<NSString *> *)indexedProperties {
    return @[
        @"userId",
    ];
}

@end


@implementation Permission

@end


@implementation RealmFile

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"id",
        @"path",
    ];
}

+ (NSString *)primaryKey {
    return @"id";
}

@end


@implementation Token

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"token",
        @"expires",
        @"app_id",
    ];
}

+ (NSString *)primaryKey {
    return @"token";
}

@end


@implementation User

+ (NSArray<NSString *> *)requiredProperties {
    return @[
        @"id",
    ];
}

+ (NSString *)primaryKey {
    return @"id";
}

@end


