abstract class Figure (var height: Int, var base: Int) {
    abstract fun GetVolume(): Double
    abstract fun GetLateralProjArea(): Double
    abstract fun GetTopProjArea(): Double
}

class Cone(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return Math.PI * base * base * height / 3
    }

    override fun GetLateralProjArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjArea(): Double {
        return Math.PI * base * base / 4
    }
}

class Cube(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * height * height).toDouble()
    }

    override fun GetLateralProjArea(): Double {
        return (height * height).toDouble()
    }

    override fun GetTopProjArea(): Double {
        return (height * height).toDouble()
    }
}

class Pyramid(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * base * base / 3).toDouble()
    }

    override fun GetLateralProjArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjArea(): Double {
        return (base * base) .toDouble()
    }
}

fun main() {
    println("Введите тип фигуры: ")
    var figure: Figure? = null
    var type = readln()
    println("Введите высоту фигуры: ")
    val height = readln().toInt()
    println("Введите основание/диаметр фигуры: ")
    val base = readln().toInt()

    when (type) {
        "куб" -> figure = Cube(height,base)
        "Куб" -> figure = Cube(height,base)
        "пирамида" -> figure = Pyramid(height,base)
        "Пирамида" -> figure = Pyramid(height,base)
        "конус" -> figure = Cone(height, base)
        "Конус" -> figure = Cone(height, base)
    }

    if (figure != null) {
        println("Объем фигуры ($type): ${figure.GetVolume()}")
        println("Площадь боковой проекции: ${figure.GetLateralProjArea()}")
        println("Площадь проекции сверху: ${figure.GetTopProjArea()}")
    }
}
