package com.baldev.eventify.Domain.User

data class User(private val id : String, private val userName : String ) {
    fun hasId(id: String): Boolean = this.id == id
}