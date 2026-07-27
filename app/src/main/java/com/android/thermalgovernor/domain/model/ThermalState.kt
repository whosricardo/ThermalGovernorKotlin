package com.android.thermalgovernor.domain.model

sealed class ThermalState {
    
    // data class (needs unique value)
    data class Cool(val temp: Float) : ThermalState {
        val message = "not developed"
    }
    
    data class Warm(val temp: Float) : ThermalState {
        val message = "not developed"
    }

    data class Hot(val temp: Float) : ThermalState {
        val message = "not developed"
    }
    
    data class Critical(val temp: Float) : ThermalState {
        val message = "not developed"
    }
}
