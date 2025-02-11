package br.com.carlosfilipe.GerenciadorUsuarioApp.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

@Entity
data class Usuario (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:NotBlank(message = "Nome é obrigatório")
    val nome: String = "",

    @field:NotBlank(message = "Email é obrigatório")
    @field:Email(message = "Email inválido")
    val email: String = "",

    @field:NotBlank(message = "CPF é obrigatório")
    @field:CPF(message = "CPF inválido")
    val cpf: String = "",

    @field:NotBlank(message = "Senha é obrigatória")
    @field:Size(min=6, max=12, message = "A senha deve ter entre 6 e 12 caracteres")
    val senha: String = "",

    @field:NotBlank(message = "Selecione uma opção")
    val papel: String = ""
){

}