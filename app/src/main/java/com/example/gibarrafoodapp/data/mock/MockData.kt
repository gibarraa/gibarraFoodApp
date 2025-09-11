package com.example.gibarrafoodapp.data.mock

import com.example.gibarrafoodapp.data.model.Category
import com.example.gibarrafoodapp.data.model.Food
import com.example.gibarrafoodapp.data.model.Restaurant

object MockData {
    val categories = listOf(
        Category("Fast Food", ""),
        Category("Chinese",   ""),
        Category("Italian",   ""),
        Category("Mexican",   ""),
        Category("Desserts",  "")
    )

    val restaurants = listOf(
        Restaurant("Burger King", ""),
        Restaurant("McDonald's",  ""),
        Restaurant("KFC",         ""),
        Restaurant("Pizza Hut",   ""),
        Restaurant("Taco Bell",   "")
    )

    val foods = listOf(
        Food("Whopper",       "", 4.5, 99.8),
        Food("Chicken Fries", "", 4.3, 59.8),
        Food("Margherita",    "", 4.7, 85.0),
        Food("Fried Chicken", "", 4.4, 79.9),
        Food("Beef Noodles",  "", 4.6, 69.9)
    )
}
