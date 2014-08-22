createArray <- function(x = 2,  y = 2) {
  helloRJava <- .jnew("HelloRJava") # create instance of HelloRJava class
  array <- .jcall(helloRJava, "[[I", "createArray", as.integer(x), as.integer(y), simplify = TRUE) # invoke sayHello method
  return(array)
}
