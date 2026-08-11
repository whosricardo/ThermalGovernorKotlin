package com.android.thermalgovernor.data

import android.os.HardwarePropertiesManager

class ThermalRepository(
    private val hardwarePropertiesManager: HardwarePropertiesManager
) {
    fun getCpuTemperatures(): FloatArray {
        return hardwarePropertiesManager.getDeviceTemperatures(
            HardwarePropertiesManager.DEVICE_TEMPERATURE_CPU,
            HardwarePropertiesManager.TEMPERATURE_CURRENT
        )
    }

    fun getGpuTemperatures(): FloatArray {
        return hardwarePropertiesManager.getDeviceTemperatures(
            HardwarePropertiesManager.DEVICE_TEMPERATURE_GPU,
            HardwarePropertiesManager.TEMPERATURE_CURRENT
        )
    }

    fun getBatteryTemperatures(): FloatArray {
        return hardwarePropertiesManager.getDeviceTemperatures(
            HardwarePropertiesManager.DEVICE_TEMPERATURE_BATTERY,
            HardwarePropertiesManager.TEMPERATURE_CURRENT
        )
    }
}
