// File generated from our OpenAPI spec by Stainless.

package com.openai.models.chat.completions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.BaseDeserializer
import com.openai.core.BaseSerializer
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.checkRequired
import com.openai.core.getOrThrow
import com.openai.core.immutableEmptyMap
import com.openai.core.toImmutable
import com.openai.errors.OpenAIInvalidDataException
import java.util.Objects
import java.util.Optional

/** Messages sent by an end user, containing prompts or additional context information. */
@NoAutoDetect
class ChatCompletionUserMessageParam
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<Content> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The contents of the user message.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * The role of the messages author, in this case `user`.
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("user")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * An optional name for the participant. Provides the model information to differentiate between
     * participants of the same role.
     *
     * @throws OpenAIInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatCompletionUserMessageParam = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("user")) {
                throw OpenAIInvalidDataException("'role' is invalid, received $it")
            }
        }
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ChatCompletionUserMessageParam].
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatCompletionUserMessageParam]. */
    class Builder internal constructor() {

        private var content: JsonField<Content>? = null
        private var role: JsonValue = JsonValue.from("user")
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionUserMessageParam: ChatCompletionUserMessageParam) = apply {
            content = chatCompletionUserMessageParam.content
            role = chatCompletionUserMessageParam.role
            name = chatCompletionUserMessageParam.name
            additionalProperties =
                chatCompletionUserMessageParam.additionalProperties.toMutableMap()
        }

        /** The contents of the user message. */
        fun content(content: Content) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [Content] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /** Alias for calling [content] with `Content.ofText(text)`. */
        fun content(text: String) = content(Content.ofText(text))

        /**
         * Alias for calling [content] with `Content.ofArrayOfContentParts(arrayOfContentParts)`.
         */
        fun contentOfArrayOfContentParts(arrayOfContentParts: List<ChatCompletionContentPart>) =
            content(Content.ofArrayOfContentParts(arrayOfContentParts))

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("user")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonValue) = apply { this.role = role }

        /**
         * An optional name for the participant. Provides the model information to differentiate
         * between participants of the same role.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ChatCompletionUserMessageParam].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatCompletionUserMessageParam =
            ChatCompletionUserMessageParam(
                checkRequired("content", content),
                role,
                name,
                additionalProperties.toImmutable(),
            )
    }

    /** The contents of the user message. */
    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val text: String? = null,
        private val arrayOfContentParts: List<ChatCompletionContentPart>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** The text contents of the message. */
        fun text(): Optional<String> = Optional.ofNullable(text)

        /**
         * An array of content parts with a defined type. Supported options differ based on the
         * [model](https://platform.openai.com/docs/models) being used to generate the response. Can
         * contain text, image, or audio inputs.
         */
        fun arrayOfContentParts(): Optional<List<ChatCompletionContentPart>> =
            Optional.ofNullable(arrayOfContentParts)

        fun isText(): Boolean = text != null

        fun isArrayOfContentParts(): Boolean = arrayOfContentParts != null

        /** The text contents of the message. */
        fun asText(): String = text.getOrThrow("text")

        /**
         * An array of content parts with a defined type. Supported options differ based on the
         * [model](https://platform.openai.com/docs/models) being used to generate the response. Can
         * contain text, image, or audio inputs.
         */
        fun asArrayOfContentParts(): List<ChatCompletionContentPart> =
            arrayOfContentParts.getOrThrow("arrayOfContentParts")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                text != null -> visitor.visitText(text)
                arrayOfContentParts != null -> visitor.visitArrayOfContentParts(arrayOfContentParts)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Content = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitText(text: String) {}

                    override fun visitArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionContentPart>
                    ) {
                        arrayOfContentParts.forEach { it.validate() }
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Content && text == other.text && arrayOfContentParts == other.arrayOfContentParts /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, arrayOfContentParts) /* spotless:on */

        override fun toString(): String =
            when {
                text != null -> "Content{text=$text}"
                arrayOfContentParts != null -> "Content{arrayOfContentParts=$arrayOfContentParts}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }

        companion object {

            /** The text contents of the message. */
            @JvmStatic fun ofText(text: String) = Content(text = text)

            /**
             * An array of content parts with a defined type. Supported options differ based on the
             * [model](https://platform.openai.com/docs/models) being used to generate the response.
             * Can contain text, image, or audio inputs.
             */
            @JvmStatic
            fun ofArrayOfContentParts(arrayOfContentParts: List<ChatCompletionContentPart>) =
                Content(arrayOfContentParts = arrayOfContentParts)
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            /** The text contents of the message. */
            fun visitText(text: String): T

            /**
             * An array of content parts with a defined type. Supported options differ based on the
             * [model](https://platform.openai.com/docs/models) being used to generate the response.
             * Can contain text, image, or audio inputs.
             */
            fun visitArrayOfContentParts(arrayOfContentParts: List<ChatCompletionContentPart>): T

            /**
             * Maps an unknown variant of [Content] to a value of type [T].
             *
             * An instance of [Content] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws OpenAIInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OpenAIInvalidDataException("Unknown Content: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Content>(Content::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Content(text = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>()) {
                        it.forEach { it.validate() }
                    }
                    ?.let {
                        return Content(arrayOfContentParts = it, _json = json)
                    }

                return Content(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Content>(Content::class) {

            override fun serialize(
                value: Content,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.text != null -> generator.writeObject(value.text)
                    value.arrayOfContentParts != null ->
                        generator.writeObject(value.arrayOfContentParts)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionUserMessageParam && content == other.content && role == other.role && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, role, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionUserMessageParam{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
}
