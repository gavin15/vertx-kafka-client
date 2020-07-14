package io.vertx.kafka.admin;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.apache.kafka.common.acl.AclOperation;
import org.apache.kafka.common.acl.AclPermissionType;

@DataObject(generateConverter = true)
public class AccessControlEntry {
  private String principal;
  private String host;
  private AclOperation operation;
  private AclPermissionType permissionType;

  public AccessControlEntry() {
  }

  public AccessControlEntry(String principal, String host, AclOperation operation, AclPermissionType permissionType) {
    this.principal = principal;
    this.host = host;
    this.operation = operation;
    this.permissionType = permissionType;
  }

  public AccessControlEntry(JsonObject json) {

    AccessControlEntryConverter.fromJson(json, this);
  }

  public String getPrincipal() {
    return principal;
  }

  /**
   * Set the value for principal
   *
   * @param principal principal for the entry
   * @return current instance of the class to be fluent
   */
  public AccessControlEntry setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getHost() {
    return host;
  }

  /**
   * Set the value for host
   *
   * @param host host for the entry
   * @return current instance of the class to be fluent
   */
  public AccessControlEntry setHost(String host) {
    this.host = host;
    return this;
  }

  public AclOperation getOperation() {
    return operation;
  }

  /**
   * Set the value for operation
   *
   * @param operation AclOperation for the entry
   * @return current instance of the class to be fluent
   */
  public AccessControlEntry setOperation(AclOperation operation) {
    this.operation = operation;
    return this;
  }

  public AclPermissionType getPermissionType() {
    return permissionType;
  }

  /**
   * Set the value for permissionType
   *
   * @param permissionType permission type for the entry
   * @return current instance of the class to be fluent
   */
  public AccessControlEntry setPermissionType(AclPermissionType permissionType) {
    this.permissionType = permissionType;
    return this;
  }

  @Override
  public String toString() {
    return "AccessControlEntry{" +
      "principal=" + principal +
      ", host=" + host +
      ", operation=" + operation +
      ", permissionType=" + permissionType +
      '}';
  }

  /**
   * Convert object to JSON representation
   *
   * @return  JSON representation
   */
  public JsonObject toJson() {

    JsonObject json = new JsonObject();
    AccessControlEntryConverter.toJson(this, json);
    return json;
  }
}
