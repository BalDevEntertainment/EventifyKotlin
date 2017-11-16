package com.baldev.eventify.Domain

import com.baldev.eventify.Domain.User.CreateUser
import com.baldev.eventify.Domain.User.User
import io.kotlintest.specs.BehaviorSpec

class UserTest : BehaviorSpec({
    Given("Some user name") {
        val userName = "UserName"
        When("Create user") {
            val createUser = CreateUser(userName, provideUsers())()
            Then("User is created") {
                createUser.test().assertValue { hasUsername(it, userName) }
            }
        }
    }
})

private fun hasUsername(it: User, userName: String) = it.userName == userName