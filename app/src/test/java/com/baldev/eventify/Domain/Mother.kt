package com.baldev.eventify.Domain

import com.baldev.eventify.Domain.User.User
import com.baldev.eventify.Infrastructure.User.InMemoryGroups
import com.baldev.eventify.Infrastructure.User.InMemoryUsers

fun provideUsers(): InMemoryUsers = InMemoryUsers(mutableListOf())
fun provideGroups(): InMemoryGroups = InMemoryGroups(mutableListOf())
fun provideListOfUsers(): List<User> {
    val users: MutableList<User> = mutableListOf()
    users += User("1", "FirstUser")
    users += User("2", "SecondUser")
    users += User("3", "ThirdUser")
    return users
}
