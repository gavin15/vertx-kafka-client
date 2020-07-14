package io.vertx.kafka.admin;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import org.apache.kafka.common.acl.AccessControlEntryFilter;
import org.apache.kafka.common.resource.ResourcePatternFilter;

@DataObject(generateConverter = true)
public class AclBindingFilter {
  ResourcePatternFilter patternFilter;
  AccessControlEntryFilter entryFilter;

  public AclBindingFilter() {
  }

  public AclBindingFilter(ResourcePatternFilter patternFilter, AccessControlEntryFilter entryFilter) {
    this.patternFilter = patternFilter;
    this.entryFilter = entryFilter;
  }

  public AclBindingFilter(JsonObject json) {

    AclBindingFilterConverter.fromJson(json, this);
  }

  public ResourcePatternFilter getPatternFilter() {
    return patternFilter;
  }

  public AclBindingFilter setPatternFilter(ResourcePatternFilter patternFilter) {
    this.patternFilter = patternFilter;
    return this;
  }

  public AccessControlEntryFilter getEntryFilter() {
    return entryFilter;
  }

  public AclBindingFilter setEntryFilter(AccessControlEntryFilter entryFilter) {
    this.entryFilter = entryFilter;
    return this;
  }

  @Override
  public String toString() {
    return "AclBindingFilter{" +
      "patternFilter=" + patternFilter +
      ", entryFilter=" + entryFilter +
      '}';
  }


  /**
   * Convert object to JSON representation
   *
   * @return  JSON representation
   */
  public JsonObject toJson() {

    JsonObject json = new JsonObject();
    AclBindingFilterConverter.toJson(this, json);
    return json;
  }

}
