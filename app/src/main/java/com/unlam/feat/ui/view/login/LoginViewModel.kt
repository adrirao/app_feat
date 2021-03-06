package com.unlam.feat.ui.view.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.unlam.feat.ui.util.TypeClick

class LoginViewModel : ViewModel() {
    private val _state = mutableStateOf(LoginState())
    val state: State<LoginState> = _state

    fun onEvent(event: LoginEvents) {
        when (event) {
            is LoginEvents.onValueChange -> {
                when (event.typeValueChange) {
                    TypeValueChange.onValueChangeEmail -> {
                        _state.value = _state.value.copy(
                            textEmail = event.value
                        )
                    }
                    TypeValueChange.onValueChangePassword -> {
                        _state.value = _state.value.copy(
                            textPassword = event.value
                        )
                    }
                }
            }
            LoginEvents.onClick(TypeClick.onClickToggledPassword) -> {
                _state.value = _state.value.copy(
                    isVisiblePassword = !_state.value.isVisiblePassword
                )
            }
        }
    }
}