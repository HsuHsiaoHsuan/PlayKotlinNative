package idv.freeman.mpp

expect fun platformName(): String

fun helloKotlinMpp() : String {
    return "Kotlin MPP on ${platformName()}"
}