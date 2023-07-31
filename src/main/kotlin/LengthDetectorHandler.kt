class LengthDetectorHandler : IValidateHandler {
    override fun handle(call: String): String {
        if (call.length > 150) {
            // Handle the database error here
//            println("length is not supported : ${error.length}")
            return "Cookies : Fail - [length is not supported : ${call.length}]" // Error handled successfully
        }

        return "Cookies : OK" // Pass the error to the next handler
    }
}
