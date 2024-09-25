package com.example.myapplication

class ExpertCerveja {

    fun getMarcas(color: String): List<String> {
        return when (color) {
            "Lager" -> listOf("Heineken", "Budweiser")
            "Pilsen" -> listOf("Guinness", "Schwarzbier")
            "IPA" -> listOf("Red IPA", "IPA Lager")
            "Bock" -> listOf("Dark Ale", "Amber Lager")
            "Amber" -> listOf("Red Ale", "Amber Lager")
            "Weiss" -> listOf("Lager Trigo", "Yellow Lager")
            else -> listOf("Sem opções")
        }
    }
}