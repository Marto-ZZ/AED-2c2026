package aed;

public class Horario {
    private int hora;
    private int minutos;
    
    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        return this.hora+":"+this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro.getClass() == null){
            return false;
        }
        else if (otro.getClass() != this.getClass()){
            return false;
        }
        Horario otroHorario = (Horario) otro;
        return minutos == otroHorario.minutos && hora == otroHorario.hora;
    }

}
