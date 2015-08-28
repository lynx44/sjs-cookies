package com.standardedge.cookies

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

trait Cookies {
  def set(key: String, value: String): Cookies
  def set(key: String, value: String, options: js.Dynamic): Cookies
  def get(key: String): String
}

@JSName("Cookies")
object Cookies extends js.Object {
  def set(key: String, value: String): Cookies = js.native
  def set(key: String, value: String, options: js.Dynamic): Cookies = js.native
  def get(key: String): UndefOr[String] = js.native
}

object Options {
  def apply(path: UndefOr[String] = js.undefined,
            domain: UndefOr[String] = js.undefined,
            expires: UndefOr[Double] = js.undefined,
            secure: UndefOr[Boolean] = js.undefined): js.Dynamic = {
    js.Dynamic.literal("path" -> path, "domain" -> domain, "expires" -> expires, "secure" -> secure)
  }
}