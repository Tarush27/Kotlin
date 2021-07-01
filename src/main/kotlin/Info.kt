class Info(var aim: String,var calories: Int) {
    var goal = "$aim $calories"   // inline declaration

    init{
        println("come inside init block and achieve your $goal")
    }

    val goalMotive = goal.length  // read only properties


}

