package br.com.alura.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by Alura on 22/09/2017.
 */
class Transacao (val valor: BigDecimal,
                 val categoria: String,
                 val data: Calendar)