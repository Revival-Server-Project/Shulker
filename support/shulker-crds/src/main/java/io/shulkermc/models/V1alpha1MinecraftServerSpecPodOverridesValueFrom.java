/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.shulkermc.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.shulkermc.models.V1alpha1MinecraftServerSpecPodOverridesValueFromConfigMapKeyRef;
import io.shulkermc.models.V1alpha1MinecraftServerSpecPodOverridesValueFromFieldRef;
import io.shulkermc.models.V1alpha1MinecraftServerSpecPodOverridesValueFromResourceFieldRef;
import io.shulkermc.models.V1alpha1MinecraftServerSpecPodOverridesValueFromSecretKeyRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
 */
@ApiModel(description = "Source for the environment variable's value. Cannot be used if value is not empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T15:48:00.143Z[Etc/UTC]")
public class V1alpha1MinecraftServerSpecPodOverridesValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1alpha1MinecraftServerSpecPodOverridesValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1alpha1MinecraftServerSpecPodOverridesValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1alpha1MinecraftServerSpecPodOverridesValueFromResourceFieldRef resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1alpha1MinecraftServerSpecPodOverridesValueFromSecretKeyRef secretKeyRef;


  public V1alpha1MinecraftServerSpecPodOverridesValueFrom configMapKeyRef(V1alpha1MinecraftServerSpecPodOverridesValueFromConfigMapKeyRef configMapKeyRef) {
    
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1MinecraftServerSpecPodOverridesValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1alpha1MinecraftServerSpecPodOverridesValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1alpha1MinecraftServerSpecPodOverridesValueFrom fieldRef(V1alpha1MinecraftServerSpecPodOverridesValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1MinecraftServerSpecPodOverridesValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1alpha1MinecraftServerSpecPodOverridesValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1alpha1MinecraftServerSpecPodOverridesValueFrom resourceFieldRef(V1alpha1MinecraftServerSpecPodOverridesValueFromResourceFieldRef resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1MinecraftServerSpecPodOverridesValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1alpha1MinecraftServerSpecPodOverridesValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  public V1alpha1MinecraftServerSpecPodOverridesValueFrom secretKeyRef(V1alpha1MinecraftServerSpecPodOverridesValueFromSecretKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1MinecraftServerSpecPodOverridesValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1alpha1MinecraftServerSpecPodOverridesValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MinecraftServerSpecPodOverridesValueFrom v1alpha1MinecraftServerSpecPodOverridesValueFrom = (V1alpha1MinecraftServerSpecPodOverridesValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1alpha1MinecraftServerSpecPodOverridesValueFrom.configMapKeyRef) &&
        Objects.equals(this.fieldRef, v1alpha1MinecraftServerSpecPodOverridesValueFrom.fieldRef) &&
        Objects.equals(this.resourceFieldRef, v1alpha1MinecraftServerSpecPodOverridesValueFrom.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, v1alpha1MinecraftServerSpecPodOverridesValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MinecraftServerSpecPodOverridesValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
