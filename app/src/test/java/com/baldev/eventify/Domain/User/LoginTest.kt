package com.baldev.eventify.Domain.User

import com.baldev.eventify.Domain.Login.Login
import com.baldev.eventify.Domain.Login.LoginService
import com.baldev.eventify.Infrastructure.FakeLoginIdProvider
import com.baldev.eventify.Infrastructure.User.InMemoryUsers
import io.kotlintest.specs.BehaviorSpec

class LoginTest : BehaviorSpec({
    Given("Empty LoginIdProvider") {
        val users = InMemoryUsers(mutableListOf())
        val loginIdProvider = FakeLoginIdProvider()
        val loginService = LoginService(users, loginIdProvider)
        val login = Login(loginService)
        When("Tries to log in") {
            val loginObservable = login()
            Then("Throw error") {
                loginObservable.test().assertError(RuntimeException::class.java)
            }
        }
    }
})