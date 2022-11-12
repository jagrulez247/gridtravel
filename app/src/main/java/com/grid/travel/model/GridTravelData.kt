package com.grid.travel.model

data class GridTravelData(
    val location: String,
    val rating: Int,
    val country: String,
    val imageUrl: String
) {
    companion object {
        fun getMockTravelList(): List<GridTravelData> {
            return mutableListOf<GridTravelData>().apply {
                add(
                    GridTravelData(
                        location = "San Fransisco",
                        rating = 3,
                        country = "USA",
                        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/San_Francisco_from_the_Marin_Headlands_in_August_2022.jpg/1920px-San_Francisco_from_the_Marin_Headlands_in_August_2022.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "London",
                        rating = 4,
                        country = "UK",
                        imageUrl = "https://www.business.london/-/media/images/london/visit/campaigns/international-recovery-campaign/lets-do-london-hero-international-1920.jpeg"
                    )
                )
                add(
                    GridTravelData(
                        location = "New York",
                        rating = 3,
                        country = "USA",
                        imageUrl = "https://assets.simpleviewinc.com/simpleview/image/upload/c_fill,h_797,q_75,w_2000/v1/clients/newyorkstate/5232359e_e163_475c_abe3_0f20af112a8c_ae020bfc-a771-4564-87b7-479fbe55735d.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Mumbai",
                        rating = 3,
                        country = "India",
                        imageUrl = "https://cdn.britannica.com/26/84526-050-45452C37/Gateway-monument-India-entrance-Mumbai-Harbour-coast.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Sydney",
                        rating = 5,
                        country = "Australia",
                        imageUrl = "https://cdn.britannica.com/96/100196-050-C92064E0/Sydney-Opera-House-Port-Jackson.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Dubai",
                        rating = 5,
                        country = "UAE",
                        imageUrl = "https://cdn.britannica.com/69/156369-050-75E7FD08/skyline-Dubai-United-Arab-Emirates.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "San Fransisco",
                        rating = 3,
                        country = "USA",
                        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/San_Francisco_from_the_Marin_Headlands_in_August_2022.jpg/1920px-San_Francisco_from_the_Marin_Headlands_in_August_2022.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "London",
                        rating = 4,
                        country = "UK",
                        imageUrl = "https://www.business.london/-/media/images/london/visit/campaigns/international-recovery-campaign/lets-do-london-hero-international-1920.jpeg"
                    )
                )
                add(
                    GridTravelData(
                        location = "New York",
                        rating = 3,
                        country = "USA",
                        imageUrl = "https://assets.simpleviewinc.com/simpleview/image/upload/c_fill,h_797,q_75,w_2000/v1/clients/newyorkstate/5232359e_e163_475c_abe3_0f20af112a8c_ae020bfc-a771-4564-87b7-479fbe55735d.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Mumbai",
                        rating = 3,
                        country = "India",
                        imageUrl = "https://cdn.britannica.com/26/84526-050-45452C37/Gateway-monument-India-entrance-Mumbai-Harbour-coast.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Sydney",
                        rating = 5,
                        country = "Australia",
                        imageUrl = "https://cdn.britannica.com/96/100196-050-C92064E0/Sydney-Opera-House-Port-Jackson.jpg"
                    )
                )
                add(
                    GridTravelData(
                        location = "Dubai",
                        rating = 5,
                        country = "UAE",
                        imageUrl = "https://cdn.britannica.com/69/156369-050-75E7FD08/skyline-Dubai-United-Arab-Emirates.jpg"
                    )
                )
            }
        }
    }
}