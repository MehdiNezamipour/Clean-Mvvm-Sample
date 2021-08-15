package com.example.cleanmvvmsample.mappers

import com.example.cleanmvvmsample.models.*
import com.example.domain.models.*


fun Post.toPresenter(): PostModel {
    return PostModel(
        body = body,
        id = id,
        title = title,
        userId = userId
    )
}

fun User.toPresenter(): UserModel {
    return UserModel(
        address = address.toPresenter(),
        company = company.toPresenter(),
        email = email,
        id = id,
        name = name,
        phone = phone,
        username = username,
        website = website
    )
}

fun Address.toPresenter(): AddressModel {
    return AddressModel(
        city = city,
        geo = geo.toPresenter(),
        street = street,
        suite = suite,
        zipcode = zipcode
    )
}

fun Geo.toPresenter(): GeoModel {
    return GeoModel(lat = lat, lng = lng)
}

fun Company.toPresenter(): CompanyModel {
    return CompanyModel(
        bs = bs,
        catchPhrase = catchPhrase,
        name = name
    )
}