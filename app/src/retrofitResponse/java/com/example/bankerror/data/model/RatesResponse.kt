package com.example.bankerror.data.model

import com.google.gson.annotations.SerializedName

data class RatesResponse(@SerializedName("rates") val rate:List<RateResponse>)