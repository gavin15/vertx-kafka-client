package io.vertx.kafka.admin;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.apache.kafka.common.resource.PatternType;
import org.apache.kafka.common.resource.ResourceType;

@DataObject(generateConverter = true)
public class ResourcePattern {
  private ResourceType resourceType;
  private String name;
  private PatternType patternType;

  public ResourcePattern() {
  }

  public ResourcePattern(ResourceType resourceType, String name, PatternType patternType) {
    this.resourceType = resourceType;
    this.name = name;
    this.patternType = patternType;
  }

  public ResourcePattern(JsonObject json) {

    ResourcePatternConverter.fromJson(json, this);
  }

  public ResourceType getResourceType() {
    return resourceType;
  }

  /**
   * Set the specific resource type
   *
   * @param resourceType the specific resource type
   * @return current instance of the class to be fluent
   */
  public ResourcePattern setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  public String getName() {
    return name;
  }

  /**
   * Set the resource name
   *
   * @param name the resource name
   * @return current instance of the class to be fluent
   */
  public ResourcePattern setName(String name) {
    this.name = name;
    return this;
  }

  public PatternType getPatternType() {
    return patternType;
  }

  /**
   * Set the resource pattern type
   *
   * @param patternType the pattern type
   * @return current instance of the class to be fluent
   */
  public ResourcePattern setPatternType(PatternType patternType) {
    this.patternType = patternType;
    return this;
  }

  @Override
  public String toString() {
    return "ResourcePattern{" +
      "resourceType=" + resourceType +
      ", name=" + name +
      ", patternType=" + patternType +
      '}';
  }

  /**
   * Convert object to JSON representation
   *
   * @return  JSON representation
   */
  public JsonObject toJson() {

    JsonObject json = new JsonObject();
    ResourcePatternConverter.toJson(this, json);
    return json;
  }
}
