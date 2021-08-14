package com.example.data.mappers

import com.example.data.models.response.*
import com.example.domain.models.*

// User
internal fun UserItem.toDomain(): User {
    return User(
        address = address.toDomain(),
        company = company.toDomain(),
        email = email,
        id = id,
        name = name,
        phone = phone,
        username = username,
        website = website

    )
}

internal fun UserAddress.toDomain(): Address {
    return Address(
        city = city,
        geo = geo.toDomain(),
        street = street,
        suite = suite,
        zipcode = zipcode
    )
}

internal fun UserGeo.toDomain(): Geo {
    return Geo(
        lat = lat,
        lng = lng
    )
}

internal fun UserCompany.toDomain(): Company {
    return Company(
        bs = bs,
        catchPhrase = catchPhrase,
        name = name
    )
}


//Post
internal fun PostItem.toDomain(): Post {
    return Post(
        body = body,
        id = id,
        title = title,
        userId = userId
    )
}