sayHello <- function() {
  helloRJava <- .jnew("HelloRJava") # create instance of HelloRJava class
  ret <- .jcall(helloRJava, "S", "sayHello") # invoke sayHello method
  return(ret)
}
