package com.fragments

interface HotelRepository {

    fun save(hotel: Hotel)
    fun remove(vararg hotels: Hotel) // como o parametro esta marcado com varargs, entao remove pode receber um ou vários objetos do tipo Hotel
    fun hotelById(id: Long, callback: (Hotel?) -> Unit)
    fun search(term: String, callback:(List<Hotel>) -> Unit)
}