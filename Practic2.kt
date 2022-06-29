fun main() {
    val firstName: String = "Tatiana"
    val lastName: String = "Goddess"
    var height: Double = 166.7
    var weight: Float = 51.3f
    var isChild: Boolean? = null
    if (height < 150.0 && weight < 40f)
        isChild = true
    if (height > 150.0 && weight > 40f)
    isChild = false
    var info: String = "I'm $lastName && $firstName &&, is child? - $isChild , my height - $height, my weight - $weight "
    println(info)
    height = 149.9
    info = "I'm $lastName && $firstName &&, is child? - $isChild , my height - $height, my weight - $weight "
    println(info)
    weight = 39.7f
    if (height < 150.0 && weight < 40f)
    isChild = true
    if (height > 150.0 && weight > 40f)
    isChild = false
    info = "I'm $lastName && $firstName &&, is child? - $isChild , my height - $height, my weight - $weight "
    println(info)


}