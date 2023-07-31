class HelloWordDetectorHandler : IValidateHandler {
    override fun handle(call: String   ): String {
        if (call.contains("hello")) {
            // Handle the network error here
//            println("text contains word prohibited : ${error}")
            return "Headers : Fail - [text contains word prohibited : $call]" // Error handled successfully
        }

        return "Headers : Ok" // Pass the error to the next handler
    }
}