package com.modelado.proyecto1.chat.servidor

import com.modelado.proyecto1.chat.usuario.TipoMensajeUsuario

data class MensajeServidor(
    val type: TipoMensajeServidor,
    val request: TipoMensajeUsuario,
    val result: OperacionAvisoServidor
    val extra: String? = null
)