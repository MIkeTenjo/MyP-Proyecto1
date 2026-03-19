package com.modelado.proyecto1.chat.usuario

data class MensajeUsuario(
    val type: TipoMensajeUsuario,
    val username: String? = null,
    val status: EstadoUsuario? = null,
    val text: String? = null,
)