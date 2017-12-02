package com.baldev.eventify.Domain.Login

import com.baldev.eventify.Domain.User.User
import io.reactivex.Observable

class Login(private val loginService: LoginService) {
    operator fun invoke(): Observable<User> = Observable.create({ loginService() })
}