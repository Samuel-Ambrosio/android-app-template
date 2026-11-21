package com.samuelav.data.sourcesImpl.remote.services

import com.samuelav.data.sourcesImpl.remote.models.NetworkTodoPage
import com.samuelav.domain.model.utils.Error
import com.samuelav.domain.model.utils.Result
import retrofit2.http.GET

internal interface TodoService {
    @GET("todos?limit=0")
    suspend fun getTodos(): Result<Error, NetworkTodoPage>
}
