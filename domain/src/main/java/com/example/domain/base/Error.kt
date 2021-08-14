package com.example.domain.base

sealed class Error {

    data class ServerError(val message: String) : Error()

    object Network : Error()

    object NotFound : Error()

    object TokenExpired : Error()

    object NotLoggedIn : Error()

    object AccessDenied : Error()

    object ServiceUnavailable : Error()

    object ChatDisconnected : Error()

    object NoCache : Error()

    object Unknown : Error()
}

