package com.baldev.eventify.Domain.User

data class User(private val id : String, private val userName : String ) {
    fun hasUsername(userName: String): Boolean = this.userName == userName
}