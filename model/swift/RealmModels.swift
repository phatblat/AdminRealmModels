import Foundation
import RealmSwift

class Account: Object {
  dynamic var provider = ""
  dynamic var provider_id = ""
  dynamic var data: String?
  let tokens = List<Token>()
  dynamic var user: User?

  override static func indexedProperties() -> [String] {
    return [
      "provider_id",
    ]
  }
}

class ClusterNode: Object {
  dynamic var id = ""
  let files = List<RealmFile>()

  override static func primaryKey() -> String? {
    return "id"
  }
}

class Metadata: Object {
  dynamic var userId = ""
  dynamic var namespace = ""
  dynamic var key = ""
  dynamic var value = ""

  override static func indexedProperties() -> [String] {
    return [
      "userId",
    ]
  }
}

class Permission: Object {
  dynamic var user: User?
  dynamic var file: RealmFile?
  dynamic var mayRead = false
  dynamic var mayWrite = false
  dynamic var mayManage = false
}

class RealmFile: Object {
  dynamic var id = ""
  dynamic var path = ""
  dynamic var owner: User?
  dynamic var cluster_node: ClusterNode?

  override static func primaryKey() -> String? {
    return "id"
  }
}

class Token: Object {
  dynamic var token = ""
  dynamic var expires = NSDate()
  dynamic var revoked: NSDate?
  let files = List<RealmFile>()
  dynamic var account: Account?
  dynamic var app_id = ""

  override static func primaryKey() -> String? {
    return "token"
  }
}

class User: Object {
  dynamic var id = ""
  let accounts = List<Account>()
  dynamic var isAdmin = false

  override static func primaryKey() -> String? {
    return "id"
  }
}

