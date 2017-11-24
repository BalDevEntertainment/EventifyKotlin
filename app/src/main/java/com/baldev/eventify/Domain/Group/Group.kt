package com.baldev.eventify.Domain.Group

data class Group(private val id: String, private val groupName: String,
                 private val users: List<Any>)