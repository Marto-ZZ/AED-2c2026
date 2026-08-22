package aed;

class ArregloRedimensionableDeRecordatorios {

    private Recordatorio[] arrayrecordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        this.arrayrecordatorios = new Recordatorio[0];
    }

    public int longitud() {
        return arrayrecordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoarray = new Recordatorio[this.longitud()+1];
        for (int k = 0; k < this.longitud(); k++){
            nuevoarray[k] = arrayrecordatorios[k];
        }
        nuevoarray[longitud()] = i;
        this.arrayrecordatorios = nuevoarray;
    }

    public Recordatorio obtener(int i) {
        return this.arrayrecordatorios[i];
    }

    public void quitarAtras() {
        if (this.longitud() > 0 ){
        Recordatorio[] nuevoarray = new Recordatorio[longitud()-1];
        for (int i = 0; i < nuevoarray.length; i++){
            nuevoarray[i] = this.arrayrecordatorios[i];
        }
        this.arrayrecordatorios = nuevoarray;
        }
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        arrayrecordatorios[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        Recordatorio[] nuevoarray = new Recordatorio[vector.longitud()];
        int i = 0;
        for (Recordatorio elem : vector.arrayrecordatorios){
            nuevoarray[i] = new Recordatorio(elem.mensaje(), elem.fecha(), elem.horario());
            i++;
        }
        this.arrayrecordatorios = nuevoarray;
    }
 
    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios copy = new ArregloRedimensionableDeRecordatorios();
        for(Recordatorio elem : this.arrayrecordatorios){
            copy.agregarAtras(new Recordatorio(elem.mensaje(), elem.fecha(), elem.horario()));
        }
        return copy;
    }
}