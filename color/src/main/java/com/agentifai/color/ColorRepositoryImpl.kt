package com.agentifai.color

class ColorRepositoryImpl : ColorRepository {

    override fun getRedColor(): String = this.redColor

    private var redColor: String = "#ff0000"

}