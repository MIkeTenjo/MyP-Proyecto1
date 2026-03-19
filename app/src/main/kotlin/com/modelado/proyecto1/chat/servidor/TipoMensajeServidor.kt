package com.modelado.proyecto1.chat.servidor

enum class TipoMensajeServidor{
    RESPONSE,
    NEW_USER,
    NEW_STATUS,
    USER_LIST, 
    TEXT_FROM,
    PUBLIC_TEXT_FROM,
    INVITATION, 
    JOINED_ROOM,
    ROOM_USER_LIST,
    ROOM_TEXT_FROM, 
    LEFT_ROOM,
    DISCONNECTED,
    INVALID
}