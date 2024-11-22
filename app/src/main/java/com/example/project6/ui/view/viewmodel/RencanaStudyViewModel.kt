package com.example.project6.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class RencanaStudyViewModel : ViewModel() {

    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK ->
            stateMK.copy(namaMK = mkPilihan)
        }
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update { stateKelas ->
            stateKelas.copy(kelas = kelasPilihan)
        }
    }

    fun saveDataKRS(data: MutableList<String>) {
        _krsState.update { status ->
            status.copy(
                namaMK = data[0],
                kelas = data[1]
            )
        }
    }
}
