// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.threads.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageFileDeltaBlockTest {

    @Test
    fun create() {
        val imageFileDeltaBlock =
            ImageFileDeltaBlock.builder()
                .index(0L)
                .imageFile(
                    ImageFileDelta.builder()
                        .detail(ImageFileDelta.Detail.AUTO)
                        .fileId("file_id")
                        .build()
                )
                .build()

        assertThat(imageFileDeltaBlock.index()).isEqualTo(0L)
        assertThat(imageFileDeltaBlock.imageFile())
            .contains(
                ImageFileDelta.builder()
                    .detail(ImageFileDelta.Detail.AUTO)
                    .fileId("file_id")
                    .build()
            )
    }
}
