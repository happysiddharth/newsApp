package com.example.basetemplate.di.component

import com.example.basetemplate.di.module.ViewHolderModule
import com.example.basetemplate.di.ViewHolderScope
import com.example.basetemplate.ui.user.users.UserViewHolder
import com.example.basetemplate.ui.user.users.UserViewModel
import dagger.Component

@ViewHolderScope
@Component(
    modules = [
        ViewHolderModule::class
    ],
    dependencies = [
        ApplicationComponent::class,
    ]
)
interface ViewHolderComponent {
    fun inject(userViewModel: UserViewHolder)
}