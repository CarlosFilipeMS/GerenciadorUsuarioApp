package br.com.carlosfilipe.GerenciadorUsuarioApp.repository

import br.com.carlosfilipe.GerenciadorUsuarioApp.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long> {
}