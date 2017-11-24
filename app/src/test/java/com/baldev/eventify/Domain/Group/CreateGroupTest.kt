package com.baldev.eventify.Domain.Group

import com.baldev.eventify.Domain.provideGroups
import com.baldev.eventify.Domain.provideListOfUsers
import com.baldev.eventify.Infrastructure.TestIdGenerator
import io.kotlintest.specs.BehaviorSpec


class CreateGroupTest : BehaviorSpec({
    Given("Some users") {
        val groupName = "GroupName"
        val groupId = "GroupId"
        val idGenerator = TestIdGenerator(groupId)
        val users = provideListOfUsers()
        When("Create Group") {
            val groups = provideGroups()
            val createdGroup = CreateGroup(groupName, idGenerator, users, groups)()
            Then("Group is created") {
                val expectedGroup = Group(groupId, groupName, users)
                createdGroup.test().assertValue({ it == expectedGroup })
            }
        }
    }
})