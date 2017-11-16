package com.baldev.eventify.Domain

import com.baldev.eventify.Domain.User.CreateUser
import io.kotlintest.specs.BehaviorSpec

class UserTest : BehaviorSpec({
    Given("Some user name") {
        val userName = "UserName"
        val users = provideUsers()
        When("Create user") {
            val user = CreateUser(userName, users)()
            Then("User is created") {
                user.test().assertValue { it.userName == userName }
            }
        }
    }
})