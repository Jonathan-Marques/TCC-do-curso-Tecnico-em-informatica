/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.Date;

/**
 *
 * @author dota-
 */
public class ModAgenda {
    
    private int id_agenda;
    private String nomeVeterinario;
    private String nomePaciente;
    private String turno;
    private Date data;
    private String status;
    private String motivo;

    /**
     * @return the id_agenda
     */
    public int getId_agenda() {
        return id_agenda;
    }

    /**
     * @param id_agenda the id_agenda to set
     */
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    /**
     * @return the nomeVeterinario
     */
    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    /**
     * @param nomeVeterinario the nomeVeterinario to set
     */
    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    /**
     * @return the nomePaciente
     */
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * @param nomePaciente the nomePaciente to set
     */
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
