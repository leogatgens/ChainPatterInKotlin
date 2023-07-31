fun main() {
  val something = ValidatorHandlerChain()
    something.addHandler(HelloWordDetectorHandler())
    something.addHandler(LengthDetectorHandler())

    something.handleValidation("Hello this a text for testing")
}