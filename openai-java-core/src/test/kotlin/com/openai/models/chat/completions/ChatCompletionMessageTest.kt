// File generated from our OpenAPI spec by Stainless.

package com.openai.models.chat.completions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionMessageTest {

    @Test
    fun create() {
        val chatCompletionMessage =
            ChatCompletionMessage.builder()
                .content("content")
                .refusal("refusal")
                .addAnnotation(
                    ChatCompletionMessage.Annotation.builder()
                        .urlCitation(
                            ChatCompletionMessage.Annotation.UrlCitation.builder()
                                .endIndex(0L)
                                .startIndex(0L)
                                .title("title")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .audio(
                    ChatCompletionAudio.builder()
                        .id("id")
                        .data("data")
                        .expiresAt(0L)
                        .transcript("transcript")
                        .build()
                )
                .functionCall(
                    ChatCompletionMessage.FunctionCall.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .addToolCall(
                    ChatCompletionMessageToolCall.builder()
                        .id("id")
                        .function(
                            ChatCompletionMessageToolCall.Function.builder()
                                .arguments("arguments")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(chatCompletionMessage.content()).contains("content")
        assertThat(chatCompletionMessage.refusal()).contains("refusal")
        assertThat(chatCompletionMessage.annotations().getOrNull())
            .containsExactly(
                ChatCompletionMessage.Annotation.builder()
                    .urlCitation(
                        ChatCompletionMessage.Annotation.UrlCitation.builder()
                            .endIndex(0L)
                            .startIndex(0L)
                            .title("title")
                            .url("url")
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionMessage.audio())
            .contains(
                ChatCompletionAudio.builder()
                    .id("id")
                    .data("data")
                    .expiresAt(0L)
                    .transcript("transcript")
                    .build()
            )
        assertThat(chatCompletionMessage.functionCall())
            .contains(
                ChatCompletionMessage.FunctionCall.builder()
                    .arguments("arguments")
                    .name("name")
                    .build()
            )
        assertThat(chatCompletionMessage.toolCalls().getOrNull())
            .containsExactly(
                ChatCompletionMessageToolCall.builder()
                    .id("id")
                    .function(
                        ChatCompletionMessageToolCall.Function.builder()
                            .arguments("arguments")
                            .name("name")
                            .build()
                    )
                    .build()
            )
    }
}
