package com.modelado.proyecto1.chat.servidor

enum class OperacionAvisoServidor{
    SUCCESS,
    USER_ALREADY_EXISTS,
    NO_SUCH_USER,
    ROOM_ALREADY_EXISTS,
    NO_SUCH_ROOM,
    NOT_INVITED,
    NOT_JOINED,
    NOT_IDENTIFIED,
    INVALID
}