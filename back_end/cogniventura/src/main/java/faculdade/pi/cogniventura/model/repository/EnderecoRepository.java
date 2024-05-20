package faculdade.pi.cogniventura.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import faculdade.pi.cogniventura.model.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}