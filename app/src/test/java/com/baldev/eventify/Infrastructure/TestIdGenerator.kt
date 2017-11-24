package com.baldev.eventify.Infrastructure

import com.baldev.eventify.Domain.User.IdGenerator

class TestIdGenerator(private val id: String) : IdGenerator {

    override fun getId(): String = id
}