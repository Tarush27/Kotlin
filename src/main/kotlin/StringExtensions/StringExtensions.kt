@file:JvmName("StringExtensions")
package StringExtensions

fun String.initials(): String {
    val her = this.split(' ')
    val firstInitials = her[0].substring(0, 1)
    val secondInitials = her[1].substring(0, 1)
    return "$firstInitials $secondInitials"
}

fun Int.isAdult(): Boolean = this >= 18

