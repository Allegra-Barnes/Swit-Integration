/**
 * SWIT Open API
 * This is a SWIT Open Api server.
 *
 * OpenAPI spec version: 1.0
 * Contact: support@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ModelSampleResponse (
  chId: Option[String] = None,
  content: Option[String] = None,
  created: Option[String] = None,
  firstFlag: Option[Boolean] = None,
  modified: Option[String] = None,
  msgId: Option[String] = None,
  number: Option[Int] = None,
  userId: Option[String] = None
) extends ApiModel

