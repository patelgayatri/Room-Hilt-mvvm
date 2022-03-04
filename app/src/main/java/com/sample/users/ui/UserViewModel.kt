package com.sample.users.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sample.users.db.User
import com.sample.users.db.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    private var _userData: MutableLiveData<List<User>> = MutableLiveData()
    val userData = _userData

    init {
        getUserList()
    }

    private fun getUserList() {
        _userData.postValue(userRepository.getUsers())
    }

    fun insertUser(user: User) {
        userRepository.insertUser(user)
        getUserList()
    }

}