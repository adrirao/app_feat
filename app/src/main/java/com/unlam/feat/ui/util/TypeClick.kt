package com.unlam.feat.ui.util

sealed class TypeClick{
    object onClickGoToRegister: TypeClick()
    object onClickGoToLogin: TypeClick()
    object onClickLogin : TypeClick()
    object onClickRegister : TypeClick()
    object onClickToggledPassword : TypeClick()
    object onClickToggledRePassword : TypeClick()
}
