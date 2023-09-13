

fun getGameChoice(optionsParam: Array<String>): String =
    optionsParam[(Math.random() * optionsParam.size).toInt()]