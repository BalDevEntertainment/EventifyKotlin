package com.baldev.eventify.Infrastructure.User

import com.baldev.eventify.Domain.Group.Group
import com.baldev.eventify.Domain.Group.Groups

class InMemoryGroups(private val users: MutableList<Group>) : Groups {

    override fun put(group: Group): Group {
        users.add(group)
        return group
    }
}