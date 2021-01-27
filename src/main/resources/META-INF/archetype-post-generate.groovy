def outputDirectory = request.getOutputDirectory()
def file = new File(outputDirectory, "${request.getArtifactId()}/mvnw")
println("change executable (cmod +x) for: ${file}")
file.setExecutable(true, false)
