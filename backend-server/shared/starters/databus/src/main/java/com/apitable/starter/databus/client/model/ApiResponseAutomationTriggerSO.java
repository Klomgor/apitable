/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.starter.databus.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.apitable.starter.databus.client.model.AutomationTriggerSO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiResponseAutomationTriggerSO
 */
@JsonPropertyOrder({
  ApiResponseAutomationTriggerSO.JSON_PROPERTY_CODE,
  ApiResponseAutomationTriggerSO.JSON_PROPERTY_DATA,
  ApiResponseAutomationTriggerSO.JSON_PROPERTY_MESSAGE,
  ApiResponseAutomationTriggerSO.JSON_PROPERTY_SUCCESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiResponseAutomationTriggerSO {
  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<AutomationTriggerSO> data;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public ApiResponseAutomationTriggerSO() {
  }

  public ApiResponseAutomationTriggerSO code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * minimum: 0
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(Integer code) {
    this.code = code;
  }


  public ApiResponseAutomationTriggerSO data(List<AutomationTriggerSO> data) {
    
    this.data = data;
    return this;
  }

  public ApiResponseAutomationTriggerSO addDataItem(AutomationTriggerSO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AutomationTriggerSO> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<AutomationTriggerSO> data) {
    this.data = data;
  }


  public ApiResponseAutomationTriggerSO message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ApiResponseAutomationTriggerSO success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseAutomationTriggerSO apiResponseAutomationTriggerSO = (ApiResponseAutomationTriggerSO) o;
    return Objects.equals(this.code, apiResponseAutomationTriggerSO.code) &&
        Objects.equals(this.data, apiResponseAutomationTriggerSO.data) &&
        Objects.equals(this.message, apiResponseAutomationTriggerSO.message) &&
        Objects.equals(this.success, apiResponseAutomationTriggerSO.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseAutomationTriggerSO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
