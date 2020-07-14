package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.AclBindingFilter}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.AclBindingFilter} original class using Vert.x codegen.
 */
public class AclBindingFilterConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, AclBindingFilter obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
  }

  public static void toJson(AclBindingFilter obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(AclBindingFilter obj, java.util.Map<String, Object> json) {
  }
}
