package com.baldev.eventify.Domain

import com.baldev.eventify.Infrastructure.User.InMemoryUsers

fun provideUsers() : InMemoryUsers = InMemoryUsers()
