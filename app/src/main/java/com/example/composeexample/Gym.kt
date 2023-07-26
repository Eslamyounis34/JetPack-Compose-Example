package com.example.composeexample


val listOfGyms = listOf<Gym>(
    Gym("UpTown Gym", "20 El-Gehad, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("Gold's Gym", "61 El-saraya, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egyp"),
    Gym("Hammer Gym", "7 Sphenix Square ,Al Huwateyah ,Agouza , Giza Governorate , 3568925 ,Egyp"),
    Gym("I-Energy Gym", "22 Gool Gamal ,Al Huwateyah ,Agouza , Giza Governorate , 3568925 ,Egyp"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),
    Gym("H20 Spa& Gym", "18 Ans Ibn Malek, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt"),

    )

data class Gym(val name: String, val address: String)
