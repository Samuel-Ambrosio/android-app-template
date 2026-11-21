package com.samuelav.data.sourcesImpl.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class NetworkTodoPage(
    val todos: List<NetworkTodo>,
)
