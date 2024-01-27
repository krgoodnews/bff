package com.example.bff.model

data class UIResponse(
    val navigation: Navigation,
    val body: Body,
    val bottom: List<UIElement>
)

data class Navigation(
    val title: String
)

data class Body(
    val type: String,
    val children: List<UIElement>
)

data class UIElement(
    val type: String,
    val title: String? = null,
    val font: String? = null,
    val image_url: String? = null
)