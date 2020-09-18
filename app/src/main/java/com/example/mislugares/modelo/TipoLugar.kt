package com.example.mislugares.modelo

enum class TipoLugar private constructor(val texto:String, val recurso:Int){
    OTROS("Otros", 5),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar", 6),
    COPAS("Copas", 0),
    ESPECTACULO("Espectáculo", 0),
    HOTEL("Hotel", 0),
    COMPRAS("Compras", 0),
    EDUCACION("Educación", 0),
    DEPORTE("Deporte", 0),
    NATURALEZA("Naturaleza", 0),
    GASOLINERA("Gasolinera", 0);

    fun getNombres(): Array<String?> {
        val resultado = arrayOfNulls<String>(TipoLugar.values().size)
        for (tipo in TipoLugar.values()) {
            resultado[tipo.ordinal] = tipo.texto
        }
        return resultado
    }
}