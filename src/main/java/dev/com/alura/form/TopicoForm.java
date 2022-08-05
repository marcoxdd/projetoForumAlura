package dev.com.alura.form;

import dev.com.alura.modelo.Topico;
import dev.com.alura.repository.CursoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TopicoForm {


    @NotNull
    @NotEmpty
    @Size(min = 5)
    private String titulo;
    @NotNull
    @NotEmpty
    @Size(min = 10)
    private String mensagem;
    @NotNull
    @NotEmpty
    private String nomeCurso;


    public Topico formToEntity(CursoRepository cursoRepository){
        Topico topico = new Topico();
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
        topico.setCurso(cursoRepository.findByNome(this.nomeCurso));
        return topico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
