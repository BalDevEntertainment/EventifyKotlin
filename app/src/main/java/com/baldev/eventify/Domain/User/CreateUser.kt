package com.baldev.eventify.Domain.User

import com.baldev.eventify.Infrastructure.User.InMemoryUsers
import io.reactivex.Observable
import io.reactivex.ObservableEmitter

data class CreateUser(private val username: String, private val idGenerator: IdGenerator, private val users: InMemoryUsers) {
    operator fun invoke(): Observable<User> = Observable.create({ createUser(it) })

    private fun createUser(emitter: ObservableEmitter<User>) {
        emitter.onNext(users.put(User(idGenerator.getId(), username)))
    }
}