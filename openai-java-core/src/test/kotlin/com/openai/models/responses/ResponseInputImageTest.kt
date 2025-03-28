// File generated from our OpenAPI spec by Stainless.

package com.openai.models.responses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseInputImageTest {

    @Test
    fun create() {
        val responseInputImage =
            ResponseInputImage.builder()
                .detail(ResponseInputImage.Detail.HIGH)
                .fileId("file_id")
                .imageUrl("image_url")
                .build()

        assertThat(responseInputImage.detail()).isEqualTo(ResponseInputImage.Detail.HIGH)
        assertThat(responseInputImage.fileId()).contains("file_id")
        assertThat(responseInputImage.imageUrl()).contains("image_url")
    }
}
