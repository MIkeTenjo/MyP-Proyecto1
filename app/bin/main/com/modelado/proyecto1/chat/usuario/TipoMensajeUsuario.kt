package com.modelado.proyecto1.chat.usuario

enum class TipoMensajeUsuario{
    IDENTIFY,
    STATUS,
    USERS,
    TEXT,
    PUBLIC_TEXT,
    NEW_ROOM,
    INVITE,
    JOIN_ROOM,
    ROOM_USERS, 
    ROOM_TEXT,
    LEAVE_ROOM,
    DISCONNECT,
    INVALID
}