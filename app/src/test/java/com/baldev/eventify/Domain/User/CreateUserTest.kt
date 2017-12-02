package com.baldev.eventify.Domain.User

import com.baldev.eventify.Domain.provideUsers
import com.baldev.eventify.Infrastructure.TestIdGenerator
import io.kotlintest.specs.BehaviorSpec

class CreateUserTest : BehaviorSpec({
    Given("Some user name and id") {
        val userName = "UserName"
        val userId = "UserId"
        val idGenerator = TestIdGenerator(userId)
        When("Create user") {
            val users = provideUsers()
            val createdUser = CreateUser(userName, idGenerator, users)()
            Then("User is created") {
                val expectedUser = User(userId, userName)
                createdUser.test().assertValue({ it == expectedUser })
            }
        }
    }
})