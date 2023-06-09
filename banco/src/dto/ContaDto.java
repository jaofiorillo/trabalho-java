package dto;

import models.Conta;

public class ContaDto {

    Integer id;
    Integer agencia;
    Integer numConta;
    Float credito;
    Float limite;
    Integer usuarioId;
    String usuarioNome;
    Float renda;
    Integer senha;

    public ContaDto(Integer id, Integer agencia, Integer numConta, Float credito,
                    Float limite, Integer usuarioId, String usuarioNome, Float renda, Integer senha) {
        this.id = id;
        this.agencia = agencia;
        this.numConta = numConta;
        this.credito = credito;
        this.limite = limite;
        this.usuarioId = usuarioId;
        this.usuarioNome = usuarioNome;
        this.renda = renda;
        this.senha = senha;
    }

    public ContaDto() {
    }

    public static ContaDto convertFrom(Conta conta) {
        var contaDto = new ContaDto();
        contaDto.setAgencia(conta.getAgencia());
        contaDto.setCredito(conta.getCredito());
        contaDto.setLimite(conta.getLimite());
        contaDto.setUsuarioNome(conta.getUsuario().getNome());
        return contaDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Float getCredito() {
        return credito;
    }

    public void setCredito(Float credito) {
        this.credito = credito;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public Float getRenda() {
        return renda;
    }

    public void setRenda(Float renda) {
        this.renda = renda;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}