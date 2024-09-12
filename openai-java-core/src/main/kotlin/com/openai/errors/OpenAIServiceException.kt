package com.openai.errors

import com.google.common.collect.ListMultimap

abstract class OpenAIServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OpenAIError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OpenAIException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OpenAIError = error
}
