package com.example.gibarrafoodapp.data.mock

import com.example.gibarrafoodapp.data.model.Category
import com.example.gibarrafoodapp.data.model.Food
import com.example.gibarrafoodapp.data.model.Restaurant

object MockData {
    val categories = listOf(
        Category("Fast Food", "https://playersoflife.com/wp-content/uploads/2024/07/MEDIDA-ORIGINAL-46.png"),
        Category("Chinese",   "https://assets.epicurious.com/photos/624d9590857fa7e509238b59/16:9/w_2560%2Cc_limit/RegionalChinese_HERO_033122_31320.jpg"),
        Category("Italian",   "https://rp-cms.imgix.net/wp-content/uploads/AdobeStock_513646998-scaled.jpeg"),
        Category("Mexican",   "https://domesticfits.com/wp-content/uploads/2024/05/mexican-cuisine-more-than-640x427.jpeg"),
        Category("Desserts",  "https://upload.wikimedia.org/wikipedia/commons/a/ab/Desserts.jpg")
    )

    val restaurants = listOf(
        Restaurant("Burger King", "https://logos-marcas.com/wp-content/uploads/2020/08/Burger-King-Logo.png"),
        Restaurant("McDonald's",  "https://download.logo.wine/logo/McDonald's/McDonald's-Logo.wine.png"),
        Restaurant("KFC",         "https://m.media-amazon.com/images/I/61sDhtXeCgL._AC_SL1000_.jpg"),
        Restaurant("Pizza Hut",   "https://cdn.freebiesupply.com/images/thumbs/2x/pizza-hut-logo.png"),
        Restaurant("Taco Bell",   "https://cdn.freebiesupply.com/images/large/2x/taco-bell-logo-png-transparent.png")
    )

    val foods = listOf(
        Food("Whopper",       "https://burgerking.com.cy/sites/default/files/Whopper-01_1.png", 4.5, 99.8),
        Food("Chicken Fries", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/product_detail_chickenfries_2.png", 4.3, 59.8),
        Food("Margherita",    "https://positano.lv/wp-content/uploads/2021/12/Margherita-1.png", 4.7, 85.0),
        Food("Fried Chicken", "https://burgerking.com.my/upload/image/Product/49/Crispy%20Fried%20Chicken.png", 4.4, 79.9),
        Food("Beef Noodles",  "https://www.onestop.co.uk/wp-content/uploads/6cdc3302-8d47-4bc3-900c-f9cf2e8466e9.png", 4.6, 69.9)
    )
}
