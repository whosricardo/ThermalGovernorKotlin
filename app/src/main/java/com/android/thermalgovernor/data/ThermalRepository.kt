package com.android.thermalgovernor.data

import android.os.HardwarePropertiesManager

class ThermalRepository(
    private val hardwarePropertiesManager: HardwarePropertiesManager
) {
    fun getCpuTemperatures(): FloatArray {
        return hardwarePropertiesManager.getDeviceTemperatures(
            hardwarePropertiesManager.DEVICE_TEMPERATURE_CPU,
            hardwarePropertiesManager.TEMPERATURE_CURRENT
        )
    }

    fun getGpuTemperatures(): FloatArray {
        return hardwarePropertiesManager.getDeviceTemperatures(
            hardwarePropertiesManager.DEVICE_TEMPERATURE_GPU,
            hardwarePropertiesManager.TEMPERATURE_CURRENT
    }
}
