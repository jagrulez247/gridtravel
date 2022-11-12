package com.grid.travel.ui.main.travellist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.grid.travel.databinding.ViewHolderTravelItemBinding

class TravelDataViewHolder(
    parent: ViewGroup,
    private val itemBinding: ViewHolderTravelItemBinding = getItemBinding(parent)
): RecyclerView.ViewHolder(itemBinding.root) {

    fun loadIcon(url: String) {
        itemBinding.travelIcon
            .load(url)
        itemBinding.travelIcon.panTo(96f, 96f, false)
        itemBinding.travelIcon.zoomTo(2f, false)
    }

    fun setLocation(location: String) {
        itemBinding.travelLocation.text = location
    }

    fun setCountry(country: String) {
        itemBinding.travelCountry.text = country
    }

    fun setRating(rating: String) {
        itemBinding.travelRating.text = rating
    }

    companion object {
        private fun getItemBinding(parent: ViewGroup) = ViewHolderTravelItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    }
}