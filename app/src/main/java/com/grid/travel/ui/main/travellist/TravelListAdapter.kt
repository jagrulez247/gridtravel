package com.grid.travel.ui.main.travellist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grid.travel.R
import com.grid.travel.model.GridTravelData
import com.grid.travel.utils.Constants

class TravelListAdapter : RecyclerView.Adapter<TravelDataViewHolder>() {

    private val travelDataItems: List<GridTravelData> = GridTravelData.getMockTravelList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelDataViewHolder {
        return TravelDataViewHolder(parent)
    }

    override fun onBindViewHolder(holder: TravelDataViewHolder, position: Int) {
        val travelItem = travelDataItems[position]
        holder.loadIcon(travelItem.imageUrl)
        holder.setCountry(travelItem.country)
        holder.setLocation(travelItem.location)
        val rating = travelItem.rating
        val ratingText = String.format(
            holder.itemView.context.getString(R.string.travel_rating),
            "$rating",
            "${Constants.RATING_MAX_VALUE}"
        )
        holder.setRating(ratingText)
    }

    override fun getItemCount(): Int = travelDataItems.size
}