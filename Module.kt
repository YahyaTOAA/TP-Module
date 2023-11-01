package Module

class Module(
    val intitule: String,
    val siRegional: Boolean,
    val termine: Boolean,
    val nbHeures: Int
)

fun main() {
    val modules = mutableListOf<Module>()

    val module1 = Module("Module 1", true, false, 20)
    val module2 = Module("Module 2", false, true, 30)
    val module3 = Module("Module 3", true, true, 25)

    modules.add(module1)
    modules.add(module2)
    modules.add(module3)

    // Fonction forEach()
    modules.forEach {
        println("Module : $it")
        println("Module : ${it.intitule}")
    }

    // Fonction map()
    val menu = modules.map { it.intitule }
    println(menu)

    // Fonction filter()
    val modulesRegionaux = modules.filter { it.siRegional }
    println(modulesRegionaux)

    val intitulesModulesRegionaux = modulesRegionaux.map { it.intitule }
    println(intitulesModulesRegionaux)

    // Fonction groupBy()
    val m = modules.groupBy { it.siRegional }
    println(m[true])
    println(m[false])

    // Fonction fold()
    val nbHeuresTotal = modules.fold(0) { total, module -> total + module.nbHeures }
    println("Nombre d'heures total : $nbHeuresTotal")

    // Fonction sortedBy()
    val listeTriee1 = modules.sortedBy { it.nbHeures }
    println(listeTriee1)

    val listeTriee2 = modules.sortedBy { it.intitule }
    println(listeTriee2)
}