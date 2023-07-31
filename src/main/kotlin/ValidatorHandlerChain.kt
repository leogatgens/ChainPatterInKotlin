class ValidatorHandlerChain {
    private val handlers: MutableList<IValidateHandler> = mutableListOf()

    private  val errors = mutableListOf<String>()
    fun addHandler(handler: IValidateHandler) {
        handlers.add(handler)
    }

    fun handleValidation(error: String) {
        for (handler in handlers) {
           val result = handler.handle(error)
            errors.add(result)
        }
    println(errors.toString())
    }
}