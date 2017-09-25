package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Alura on 25/09/2017.
 */
fun Calendar.formataParaBrasileiro() : String{
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro)
    return format.format(this.time)
}