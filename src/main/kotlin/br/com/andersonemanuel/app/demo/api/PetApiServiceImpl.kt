package br.com.andersonemanuel.app.demo.api

import br.com.andersonemanuel.app.demo.model.ModelApiResponse
import br.com.andersonemanuel.app.demo.model.Pet
import org.springframework.core.io.Resource
import org.springframework.stereotype.Service

@Service
class PetApiServiceImpl : PetApiService {

    override fun addPet(pet: Pet): Pet {
        TODO("Not yet implemented")
    }

    override fun deletePet(petId: Long, apiKey: String?) {
        TODO("Not yet implemented")
    }

    override fun findPetsByStatus(status: String): List<Pet> {
        TODO("Not yet implemented")
    }

    override fun findPetsByTags(tags: List<String>?): List<Pet> {
        TODO("Not yet implemented")
    }

    override fun getPetById(petId: Long): Pet {
        TODO("Not yet implemented")
    }

    override fun updatePet(pet: Pet): Pet {
        TODO("Not yet implemented")
    }

    override fun updatePetWithForm(petId: Long, name: String?, status: String?) {
        TODO("Not yet implemented")
    }

    override fun uploadFile(petId: Long, additionalMetadata: String?, body: Resource?): ModelApiResponse {
        TODO("Not yet implemented")
    }

}