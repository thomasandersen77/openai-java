// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.assistants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileSearchToolTest {

    @Test
    fun create() {
        val fileSearchTool =
            FileSearchTool.builder()
                .fileSearch(
                    FileSearchTool.FileSearch.builder()
                        .maxNumResults(1L)
                        .rankingOptions(
                            FileSearchTool.FileSearch.RankingOptions.builder()
                                .scoreThreshold(0.0)
                                .ranker(FileSearchTool.FileSearch.RankingOptions.Ranker.AUTO)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(fileSearchTool.fileSearch())
            .contains(
                FileSearchTool.FileSearch.builder()
                    .maxNumResults(1L)
                    .rankingOptions(
                        FileSearchTool.FileSearch.RankingOptions.builder()
                            .scoreThreshold(0.0)
                            .ranker(FileSearchTool.FileSearch.RankingOptions.Ranker.AUTO)
                            .build()
                    )
                    .build()
            )
    }
}
