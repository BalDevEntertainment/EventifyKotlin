package com.baldev.eventify.Domain.User

interface Users {
    fun put(user: User): User
    fun find(id : String) : User?
}