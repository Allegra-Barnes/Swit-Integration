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

case class ModelPutChannelParam (
  chId: String,
  description: Option[String] = None,
  hidePrevChat: Option[Int] = None,
  name: String,
  wsId: String
) extends ApiModel


