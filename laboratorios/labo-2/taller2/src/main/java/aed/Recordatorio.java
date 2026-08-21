package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.horario = horario;
        this.fecha = new Fecha(fecha);
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje+" @ "+this.fecha+" "+this.horario;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro.getClass() == null){
            return false;
        }
        else if (otro.getClass() != this.getClass()){
            return false;
        }
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return otroRecordatorio.fecha == this.fecha
        && otroRecordatorio.horario == this.horario
        && otroRecordatorio.mensaje == this.mensaje;
    }

}
