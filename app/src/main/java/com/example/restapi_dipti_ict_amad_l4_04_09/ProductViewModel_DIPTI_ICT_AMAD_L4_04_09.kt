package com.example.restapi_dipti_ict_amad_l4_04_09

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_dipti_ict_amad_l4_04_09.Apiclient.apiService
import kotlinx.coroutines.launch

class ProductViewModel_DIPTI_ICT_AMAD_L4_04_09: ViewModel() {
    private val _products = MutableLiveData<List<Product_DIPTI_ICT_AMAD_L4_04_09>>()
    val products: LiveData<List<Product_DIPTI_ICT_AMAD_L4_04_09>> get() = _products

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = apiService.getProducts()
            _products.postValue(response)
        } catch (e: Exception) {
            // Handle error
        }
    }
}