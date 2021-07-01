class Hospital(var nurseName: String, var patientName: String) {

    var roomName: String = "$nurseName $patientName"
        get() = "Name : $field"  // getters in kotlin

    //    get() = "Room Name: $roomName"  <- // causes stack overflow error
    var nurse: String = nurseName
        get() = "Nurse Name: $field"

        var patient: String = patientName
            get() = "Patient Name: $field"
        // setters in kotlin
        set(value) {
           /* if (value.endsWith("Jaya")) {
                field = "Ms. Jaya"
            } else {
                    field = value
            }*/

            field = value
        }
    var wardNo: Int = 0
    var floorNo: Int = 0
    fun showDetails(): String = "$nurseName $patientName"
    fun updateDetailsWithSuffix(suffix: String){
        nurseName = "$nurseName $suffix"
    }
}