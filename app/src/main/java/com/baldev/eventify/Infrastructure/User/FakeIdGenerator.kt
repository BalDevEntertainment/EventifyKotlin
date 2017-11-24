package com.baldev.eventify.Infrastructure.User

import com.baldev.eventify.Domain.User.IdGenerator
import java.util.*

class FakeIdGenerator : IdGenerator{
    override fun getId(): String = UUID.randomUUID().toString()
}