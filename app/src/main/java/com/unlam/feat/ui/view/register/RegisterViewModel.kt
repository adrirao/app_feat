package com.unlam.feat.ui.view.register

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.unlam.feat.ui.util.TypeClick

class RegisterViewModel : ViewModel() {
    private val _state = mutableStateOf(RegisterState())
    val state: State<RegisterState> = _state

    fun onEvent(event: RegisterEvents) {
        when (event) {
            is RegisterEvents.onValueChange -> {
                when (event.typeValueChange) {
                    TypeValueChange.onValueChangeEmail -> {
                        _state.value = _state.value.copy(
                            textEmail = event.value
                        )
                    }
                    TypeValueChange.onValueChangeReEmail -> {
                        _state.value = _state.value.copy(
                            textVerifyEmail = event.value
                        )
                    }
                    TypeValueChange.onValueChangePassword -> {
                        _state.value = _state.value.copy(
                            textPassword = event.value
                        )
                    }
                    TypeValueChange.onValueChangeRePassword -> {
                        _state.value = _state.value.copy(
                            textVerifyPassword = event.value
                        )
                    }
                }
            }
             RegisterEvents.onClick(TypeClick.onClickToggledPassword) -> {
                _state.value = _state.value.copy(
                    isVisiblePassword = !_state.value.isVisiblePassword
                )
            }
            RegisterEvents.onClick(TypeClick.onClickToggledRePassword) -> {
                _state.value = _state.value.copy(
                    isVisibleRePassword = !_state.value.isVisibleRePassword
                )
            }
        }
    }
}