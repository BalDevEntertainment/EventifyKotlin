package com.baldev.eventify.Domain.Group

import com.baldev.eventify.Domain.User.IdGenerator
import com.baldev.eventify.Domain.User.User
import com.baldev.eventify.Infrastructure.User.InMemoryGroups
import io.reactivex.Observable
import io.reactivex.ObservableEmitter

data class CreateGroup(private val groupName: String, private val idGenerator: IdGenerator,
                       private val users: List<User>, private val groups: InMemoryGroups) {
    operator fun invoke(): Observable<Group> = Observable.create({ createGroup(it) })

    private fun createGroup(emitter: ObservableEmitter<Group>) {
        emitter.onNext(groups.put(Group(idGenerator.getId(), groupName, users)))
    }
}