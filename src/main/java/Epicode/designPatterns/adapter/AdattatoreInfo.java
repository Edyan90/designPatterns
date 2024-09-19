package Epicode.designPatterns.adapter;

import java.time.LocalDate;
import java.time.Period;

public class AdattatoreInfo implements DataSource{
    private Info info;

    public AdattatoreInfo(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        String nomeCompleto=info.getNome()+" "+info.getCognome();
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        Period period = Period.between(info.getDataDiNascita(), LocalDate.now());
        return period.getYears();
    }
}
