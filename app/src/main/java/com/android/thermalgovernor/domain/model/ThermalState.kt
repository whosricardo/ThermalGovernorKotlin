package com.android.thermalgovernor.domain.model

sealed class ThermalState {
    
    // data class (needs unique value)
    data class Cool(val tempCelsius: Float) : ThermalState() {
        val message = "not developed"
    }
    
    data class Warm(val tempCelsius: Float) : ThermalState() {
        val warningMessage = "SoC is warming up ($tempCelsius°C). Deferring non-essential tasks."
    }

    data class Hot(val tempCelsius: Float) : ThermalState() {
        val warningMessage = "SoC is HOT ($tempCelsius°C)! Restricting background CPU threads."
    }
    
    data class Critical(val tempCelsius: Float) : ThermalState() {
        val warningMessage = "CRITICAL THERMAL LEVEL ($tempCelsius°C)! Initiating system mitigation."
    }
}
