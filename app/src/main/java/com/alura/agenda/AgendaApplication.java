package com.alura.agenda;

import android.app.Application;

import com.alura.agenda.dao.AlunoDAO;
import com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Victor", "2313213213", "victor@teste.com"));
        dao.salva(new Aluno("Maria", "2313213213", "maria@teste.com"));
    }
}
