package io.vertx.kafka.admin;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class AclBinding {
  private ResourcePattern pattern;
  private AccessControlEntry entry;

  public AclBinding() {
  }

  public AclBinding(ResourcePattern pattern, AccessControlEntry entry) {
    this.pattern = pattern;
    this.entry = entry;
  }

  public AclBinding(JsonObject json) {

    AclBindingConverter.fromJson(json, this);
  }

  public ResourcePattern getPattern() {
    return pattern;
  }

  public AclBinding setPattern(ResourcePattern pattern) {
    this.pattern = pattern;
    return this;
  }

  public AccessControlEntry getEntry() {
    return entry;
  }

  public AclBinding setEntry(AccessControlEntry entry) {
    this.entry = entry;
    return this;
  }

  @Override
  public String toString() {
    return "AclBinding{" +
      "pattern=" + pattern +
      ", entry=" + entry +
      '}';
  }

  /**
   * Convert object to JSON representation
   *
   * @return  JSON representation
   */
  public JsonObject toJson() {

    JsonObject json = new JsonObject();
    AclBindingConverter.toJson(this, json);
    return json;
  }
}
