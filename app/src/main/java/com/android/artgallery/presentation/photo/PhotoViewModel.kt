package com.android.artgallery.presentation.photo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.artgallery.domain.model.Photo

class PhotoViewModel(val photo: Photo) : ViewModel() {

    val photoData = MutableLiveData<Photo>()

    init {
        photoData.value = photo
    }
}
