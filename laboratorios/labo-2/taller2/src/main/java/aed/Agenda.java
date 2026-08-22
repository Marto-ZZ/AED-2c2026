package aed;

public class Agenda {

    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual; 
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String recordatoriosFechaActual = this.fechaActual+"\n"+"====="+"\n";
        for (int i = 0; i < recordatorios.longitud(); i++){
            if (this.recordatorios.obtener(i).fecha().equals(fechaActual())){
                recordatoriosFechaActual += recordatorios.obtener(i).toString();
                recordatoriosFechaActual += "\n";
            }
        }
        return recordatoriosFechaActual;
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        Fecha fechaActualAliasing = new Fecha(this.fechaActual);
        return fechaActualAliasing;
    }

}
