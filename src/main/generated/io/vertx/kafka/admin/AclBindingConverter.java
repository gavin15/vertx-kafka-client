package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.AclBinding}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.AclBinding} original class using Vert.x codegen.
 */
public class AclBindingConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AclBinding obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "entry":
          if (member.getValue() instanceof JsonObject) {
            obj.setEntry(new io.vertx.kafka.admin.AccessControlEntry((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
        case "pattern":
          if (member.getValue() instanceof JsonObject) {
            obj.setPattern(new io.vertx.kafka.admin.ResourcePattern((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
      }
    }
  }

  public static void toJson(AclBinding obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(AclBinding obj, java.util.Map<String, Object> json) {
    if (obj.getEntry() != null) {
      json.put("entry", obj.getEntry().toJson());
    }
    if (obj.getPattern() != null) {
      json.put("pattern", obj.getPattern().toJson());
    }
  }
}
