// File generated from our OpenAPI spec by Stainless.

package com.openai.models.batches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRequestCountsTest {

    @Test
    fun create() {
        val batchRequestCounts =
            BatchRequestCounts.builder().completed(0L).failed(0L).total(0L).build()

        assertThat(batchRequestCounts.completed()).isEqualTo(0L)
        assertThat(batchRequestCounts.failed()).isEqualTo(0L)
        assertThat(batchRequestCounts.total()).isEqualTo(0L)
    }
}
