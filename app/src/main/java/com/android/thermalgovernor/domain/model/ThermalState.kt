package com.android.thermalgovernor.domain.model

sealed class ThermalState {

    val tempCelsius: Float    
    val message: String

    // data class (needs unique value)
    data class Cool() : ThermalState() {
        val warningMessage = "SoC is cool ($tempCelsius°C). Nothing to be done."
    }
    
    data class Warm() : ThermalState() {
        val warningMessage = "SoC is warming up ($tempCelsius°C). Deferring non-essential tasks."
    }

    data class Hot() : ThermalState() {
        val warningMessage = "SoC is HOT ($tempCelsius°C)! Restricting background CPU threads."
    }
    
    data class Critical() : ThermalState() {
        val warningMessage = "CRITICAL THERMAL LEVEL ($tempCelsius°C)! Initiating system mitigation."
    }
}
