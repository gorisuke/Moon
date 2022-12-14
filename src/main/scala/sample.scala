import scala.sys.process._
@main def sample(args: String*): Unit = process(args)
val supportOsList: List[String | (String | Nothing)] =
  ("Linux", "macOS").toList

def process(args: Seq[String]): Unit = {
  val argsLength = args.size

  if (argsLength > 0) {
    println(raw"${argsLength} arg set")
  } else {
    println("Not Set Args")
  }

  args.map(arg => println(arg))
  if (isSupportedEnv()) {
    println("Supported!!!!")
    val outPuts = excuteCommand("which fish")
    println(outPuts)
  }
}

def isSupportedEnv(): Boolean = {

  // Initialize Flg
  var isSupported = false
  // Check OS Name
  val envOs = getOperatingSystem()

  if (supportOsList.contains(envOs)) {
    isSupported = true
  }
  isSupported
}

def excuteCommand(cmd: String): String = {
  val output = cmd.!! // Captures the output
  output
}
def getOperatingSystem(): String = {
  val os: String = System.getProperty("os.name")
  os
}
