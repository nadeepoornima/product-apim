/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIThreatProtectionPoliciesList;

/**
 * APIThreatProtectionPolicies
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T19:34:51.739+05:30")
public class APIThreatProtectionPolicies {
  @JsonProperty("list")
  private List<APIThreatProtectionPoliciesList> list = null;

  public APIThreatProtectionPolicies list(List<APIThreatProtectionPoliciesList> list) {
    this.list = list;
    return this;
  }

  public APIThreatProtectionPolicies addListItem(APIThreatProtectionPoliciesList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<APIThreatProtectionPoliciesList>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<APIThreatProtectionPoliciesList> getList() {
    return list;
  }

  public void setList(List<APIThreatProtectionPoliciesList> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIThreatProtectionPolicies apIThreatProtectionPolicies = (APIThreatProtectionPolicies) o;
    return Objects.equals(this.list, apIThreatProtectionPolicies.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIThreatProtectionPolicies {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

