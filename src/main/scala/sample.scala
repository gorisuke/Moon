@main def sample(args: String*): Unit = process(args.mkString)
val support_os_list: List[String | (String | Nothing)] =
  ("Linux", "macOS").toList

def process(args: String*): Unit = {
  if(isSupportedEnv()){
    println("Supported!!!!")
  }
}

def isSupportedEnv(): Boolean = {

  // Initialize Flg
  var is_supported = false
  // Check OS Name
  val env_os = getOperatingSystem()

  if (support_os_list.contains(env_os)) {
    is_supported = true
  }
  is_supported
}

def getOperatingSystem(): String = {
  val os: String = System.getProperty("os.name")
  os
}
