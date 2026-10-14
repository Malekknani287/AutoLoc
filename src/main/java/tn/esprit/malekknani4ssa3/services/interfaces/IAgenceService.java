package tn.esprit.malekknani4ssa3.services.interfaces;

import tn.esprit.malekknani4ssa3.entities.Agence;

import java.util.List;

public interface IAgenceService {
    public Agence  ajouterAgence(Agence a);
    public Agence updateAgence(Agence a);
    public Agence deleteAgence(int id);
    public Agence getAgence(int id);
    public List<Agence> getAgences();
}
