package br.com.andersonemanuel.app.demo.api

import br.com.andersonemanuel.app.demo.model.User
import org.springframework.stereotype.Service

@Service
class UserApiServiceImpl : UserApiService {

    override fun createUser(user: User?): User {
        TODO("Not yet implemented")
    }

    override fun createUsersWithListInput(user: List<User>?): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(username: String) {
        TODO("Not yet implemented")
    }

    override fun getUserByName(username: String): User {
        TODO("Not yet implemented")
    }

    override fun loginUser(username: String?, password: String?): String {
        TODO("Not yet implemented")
    }

    override fun logoutUser() {
        TODO("Not yet implemented")
    }

    override fun updateUser(username: String, user: User?) {
        TODO("Not yet implemented")
    }

}