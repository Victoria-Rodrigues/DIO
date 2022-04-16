package br.com.dio.model;

public class Tutor {
    private String nome;
    private String endereço;
    private Integer idTutor;

    public Tutor(String nome, String endereço, Integer idTutor) {

        this.nome = nome;
        this.endereço = endereço;
        this.idTutor = idTutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Integer getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Integer idTutor) {
        this.idTutor = idTutor;
    }
}
