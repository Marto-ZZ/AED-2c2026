package aed;

class ArregloRedimensionableDeRecordatorios {
    public Recordatorio[] arrayrecordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        arrayrecordatorios = new Recordatorio[0];
    }

    public int longitud() {
        return arrayrecordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] arrayRecordatorios = new Recordatorio[longitud()+1];
        arrayRecordatorios[longitud()] = i;
    }

    public Recordatorio obtener(int i) {
        return arrayrecordatorios[i];
    }

    public void quitarAtras() {
        Recordatorio[] arrayrecordatorios = new Recordatorio[longitud()-1];
        for (int i < longitud(),);
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
