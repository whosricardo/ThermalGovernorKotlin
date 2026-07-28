package com.android.thermalgovernor.domain.model

sealed class ThermalState {

    abstract val tempCelsius: Float    
    abstract val warningMessage: String

    // data class (needs unique value)
    data class Cool(
        override val tempCelsius: Float
    ) : ThermalState() {
        override val warningMessage = "SoC is cool ($tempCelsius°C). Nothing to be done."
    }
    
    data class Warm(
        override val tempCelsius: Float
    ) : ThermalState() {
        override val warningMessage = "SoC is warming up ($tempCelsius°C). Deferring non-essential tasks."
    }

    data class Hot(
        override val tempCelsius: Float
    ) : ThermalState() {
        override val warningMessage = "SoC is HOT ($tempCelsius°C)! Restricting background CPU threads."
    }
    
    data class Critical(
        override val tempCelsius: Float
    ) : ThermalState() {
        override val warningMessage = "CRITICAL THERMAL LEVEL ($tempCelsius°C)! Initiating system mitigation."
    }
}
