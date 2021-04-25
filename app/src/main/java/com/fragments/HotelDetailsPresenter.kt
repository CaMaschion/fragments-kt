package com.fragments

class HotelDetailsPresenter(
    private val view: HotelDetailsFragment,
    private val repository: HotelRepository
) {
    fun loadHotelDetails(id: Long) {
        repository.hotelById(id) { hotel ->
            if(hotel != null){
                view.showHotelDetails(hotel)
            } else {
                view.errorHotelNotFound()
            }
        }
    }
}