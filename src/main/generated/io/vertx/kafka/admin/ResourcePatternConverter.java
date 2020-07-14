package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.ResourcePattern}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.ResourcePattern} original class using Vert.x codegen.
 */
public class ResourcePatternConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ResourcePattern obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "name":
          if (member.getValue() instanceof String) {
            obj.setName((String)member.getValue());
          }
          break;
        case "patternType":
          if (member.getValue() instanceof String) {
            obj.setPatternType(org.apache.kafka.common.resource.PatternType.valueOf((String)member.getValue()));
          }
          break;
        case "resourceType":
          if (member.getValue() instanceof String) {
            obj.setResourceType(org.apache.kafka.common.resource.ResourceType.valueOf((String)member.getValue()));
          }
          break;
      }
    }
  }

  public static void toJson(ResourcePattern obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(ResourcePattern obj, java.util.Map<String, Object> json) {
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
    if (obj.getPatternType() != null) {
      json.put("patternType", obj.getPatternType().name());
    }
    if (obj.getResourceType() != null) {
      json.put("resourceType", obj.getResourceType().name());
    }
  }
}
