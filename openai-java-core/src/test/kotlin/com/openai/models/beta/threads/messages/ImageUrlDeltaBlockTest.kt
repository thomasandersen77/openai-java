// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.threads.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageUrlDeltaBlockTest {

    @Test
    fun create() {
        val imageUrlDeltaBlock =
            ImageUrlDeltaBlock.builder()
                .index(0L)
                .imageUrl(
                    ImageUrlDelta.builder().detail(ImageUrlDelta.Detail.AUTO).url("url").build()
                )
                .build()

        assertThat(imageUrlDeltaBlock.index()).isEqualTo(0L)
        assertThat(imageUrlDeltaBlock.imageUrl())
            .contains(ImageUrlDelta.builder().detail(ImageUrlDelta.Detail.AUTO).url("url").build())
    }
}
