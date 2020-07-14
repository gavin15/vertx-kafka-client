package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.AccessControlEntry}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.AccessControlEntry} original class using Vert.x codegen.
 */
public class AccessControlEntryConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AccessControlEntry obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "host":
          if (member.getValue() instanceof String) {
            obj.setHost((String)member.getValue());
          }
          break;
        case "operation":
          if (member.getValue() instanceof String) {
            obj.setOperation(org.apache.kafka.common.acl.AclOperation.valueOf((String)member.getValue()));
          }
          break;
        case "permissionType":
          if (member.getValue() instanceof String) {
            obj.setPermissionType(org.apache.kafka.common.acl.AclPermissionType.valueOf((String)member.getValue()));
          }
          break;
        case "principal":
          if (member.getValue() instanceof String) {
            obj.setPrincipal((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(AccessControlEntry obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(AccessControlEntry obj, java.util.Map<String, Object> json) {
    if (obj.getHost() != null) {
      json.put("host", obj.getHost());
    }
    if (obj.getOperation() != null) {
      json.put("operation", obj.getOperation().name());
    }
    if (obj.getPermissionType() != null) {
      json.put("permissionType", obj.getPermissionType().name());
    }
    if (obj.getPrincipal() != null) {
      json.put("principal", obj.getPrincipal());
    }
  }
}
