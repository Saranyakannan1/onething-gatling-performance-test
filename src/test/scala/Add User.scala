
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class democlass1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://34.227.84.65:3000")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36")
		.silentResources

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Origin" -> "http://34.227.84.65:8000")

	val headers_5 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "csrf-token",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "http://34.227.84.65:8000",
		"Sec-Fetch-Mode" -> "cors")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9")

	val headers_7 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://34.227.84.65:8000",
		"csrf-token" -> "ObeykpjH-OyJZ2A8G5fpr2UEXdjEnKYFVOwg")

	val headers_8 = Map("Accept" -> "application/json, text/plain, */*")

	val headers_9 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://34.227.84.65:8000")

	val headers_12 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "text/plain;charset=UTF-8",
		"Origin" -> "http://34.227.84.65:8000")

	val headers_31 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "content-type,csrf-token",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "http://34.227.84.65:8000",
		"Sec-Fetch-Mode" -> "cors")

	val headers_32 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://34.227.84.65:8000",
		"csrf-token" -> "ObeykpjH-OyJZ2A8G5fpr2UEXdjEnKYFVOwg")

    val uri1 = "https://fonts.gstatic.com/s"
    val uri2 = "34.227.84.65"
    val uri3 = "https://onething-dev-frontend-assets.s3.amazonaws.com/assets/languages/onething_english.json"

	val scn = scenario("Add User")
		.exec(http("Home page")
			.get("http://" + uri2 + ":8000/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "/montserrat/v14/JTURjIg1_i6t8kCHKm45_ZpC3gnD_g.woff2")
			.headers(headers_1),
            http("request_2")
			.get(uri1 + "/montserrat/v14/JTURjIg1_i6t8kCHKm45_bZF3gnD_g.woff2")
			.headers(headers_1),
            http("request_3")
			.get(uri1 + "/roboto/v20/KFOmCnqEu92Fr1Mu4mxK.woff2")
			.headers(headers_1),
            http("request_4")
			.get(uri1 + "/roboto/v20/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
			.headers(headers_1),
            http("request_5")
			.options("/api/get_authorization_details/")
			.headers(headers_5),
            http("request_6")
			.get("http://" + uri2 + ":8000/sockjs-node/info?t=1592289633590")
			.headers(headers_6),
            http("request_7")
			.get("/api/get_authorization_details/")
			.headers(headers_7),
            http("request_8")
			.get(uri3 + "?version=1")
			.headers(headers_8),
            http("request_9")
			.get("http://" + uri2 + ":8004/chat-engine/?EIO=3&transport=polling&t=NAxswaT")
			.headers(headers_9),
            http("request_10")
			.get("http://" + uri2 + ":8000/static/js/22.chunk.js")
			.headers(headers_6),
            http("request_11")
			.options("/api/get_all_procedures?size=0&page=1&sort_field=procedure_name")
			.headers(headers_5),
            http("request_12")
			.post("http://" + uri2 + ":8004/chat-engine/?EIO=3&transport=polling&t=NAxswmi&sid=gxMXslBztmGZBGQEAAC1")
			.headers(headers_12)
			.body(RawFileBody("/democlass1/0012_request.txt")),
            http("request_13")
			.options("/api/get_active_tasks?size=5&page=1&sort_field=deadline")
			.headers(headers_5),
            http("request_14")
			.get("http://" + uri2 + ":8004/chat-engine/?EIO=3&transport=polling&t=NAxswmq&sid=gxMXslBztmGZBGQEAAC1")
			.headers(headers_9),
            http("request_15")
			.get("/api/get_all_procedures?size=0&page=1&sort_field=procedure_name")
			.headers(headers_7)
			.check(status.is(422)),
            http("request_16")
			.get("/api/get_active_tasks?size=5&page=1&sort_field=deadline")
			.headers(headers_7),
            http("request_17")
			.get("http://" + uri2 + ":8004/chat-engine/?EIO=3&transport=polling&t=NAxsw-9&sid=gxMXslBztmGZBGQEAAC1")
			.headers(headers_9)))
		.pause(20)
		.exec(http("admin settings")
			.get("http://" + uri2 + ":8000/static/js/14.chunk.js")
			.headers(headers_6)
			.resources(http("request_19")
			.get("http://" + uri2 + ":8000/static/js/20.chunk.js")
			.headers(headers_6),
            http("request_20")
			.get("http://" + uri2 + ":8000/static/js/7.chunk.js")
			.headers(headers_6),
            http("request_21")
			.get("http://" + uri2 + ":8000/static/js/1.chunk.js")
			.headers(headers_6),
            http("request_22")
			.get("http://" + uri2 + ":8000/static/js/19.chunk.js")
			.headers(headers_6),
            http("request_23")
			.options("/api/account_main_details/")
			.headers(headers_5),
            http("request_24")
			.get("/api/account_main_details/")
			.headers(headers_7)))
		.pause(20)
		.exec(http("User Management")
			.options("/api/get_all_users?page=1&size=NaN")
			.headers(headers_5)
			.resources(http("request_26")
			.get("/api/get_all_users?page=1&size=NaN")
			.headers(headers_7)
			.check(status.is(422))))
		.pause(20)
		.exec(http("Add User")
			.options("/api/roles")
			.headers(headers_5)
			.resources(http("request_28")
			.options("/api/business_units")
			.headers(headers_5),
            http("request_29")
			.get("/api/roles")
			.headers(headers_7),
            http("request_30")
			.get("/api/business_units")
			.headers(headers_7)))
		.pause(20)
		.exec(http("Email id")
			.options("/api/validate_email/")
			.headers(headers_31)
			.resources(http("request_32")
			.post("/api/validate_email/")
			.headers(headers_32)
			.body(RawFileBody("/democlass1/0032_request.json"))))
		.pause(20)
		.exec(http("UserName")
			.options("/api/validate_username")
			.headers(headers_31)
			.resources(http("request_34")
			.post("/api/validate_username")
			.headers(headers_32)
			.body(RawFileBody("/democlass1/0034_request.json")),
            http("request_35")
			.options("http://" + uri2 + ":8005/auth/add_new_user")
			.headers(headers_31),
            http("request_36")
			.post("http://" + uri2 + ":8005/auth/add_new_user")
			.headers(headers_32)
			.body(RawFileBody("/democlass1/0036_request.json")),
            http("request_37")
			.options("/api/get_all_users?page=1&size=NaN")
			.headers(headers_5),
            http("request_38")
			.get("/api/get_all_users?page=1&size=NaN")
			.headers(headers_7)
			.check(status.is(422))))

	setUp(scn.inject(atOnceUsers(2))).protocols(httpProtocol)
}