package com.example.data.models.response


data class UserListResponse(
    val totalCount: Int,
    val page: Int,
    val entities: MutableList<UserItem>?
)


data class UserItem(
    val address: UserAddress,
    val company: UserCompany,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)

data class UserAddress(
    val city: String,
    val geo: UserGeo,
    val street: String,
    val suite: String,
    val zipcode: String
)

data class UserCompany(
    val bs: String,
    val catchPhrase: String,
    val name: String
)

data class UserGeo(
    val lat: String,
    val lng: String
)