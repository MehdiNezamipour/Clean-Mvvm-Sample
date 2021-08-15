package com.example.cleanmvvmsample.models

data class UserModel(
    val address: AddressModel,
    val company: CompanyModel,
    val email: String,
    val id: Int,
    val name: String,
    val phone: String,
    val username: String,
    val website: String
)

data class AddressModel(
    val city: String,
    val geo: GeoModel,
    val street: String,
    val suite: String,
    val zipcode: String
)

data class CompanyModel(
    val bs: String,
    val catchPhrase: String,
    val name: String
)

data class GeoModel(
    val lat: String,
    val lng: String
)