# CW2-Diamond-Hunter-Group21
Software Maintenance Coursework 2

# 1. Clone Project
Install lastest version of intelliJ

From main page -> Check out from Version Control -> Git

Paste "https://github.com/ChenYao-666/CW2-Diamond-Hunter-Group21.git" into URL

# 2. Install Java 1.8 (version 8)

From here: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html and look for "Java SE Development Kit 8u231".

Open IJ > File > Project Structure > Project > Project SDK > New > JDK > directory to your jdk1.8.0_231

The previously added JavaFX 13 libary at the project structure should be deleted as Java 1.8 comes along with the JavaFX.

# 3. Install Scene Builder

Install from "https://gluonhq.com/products/scene-builder/" 

# 4. After we done everything only we create .jar file 

1) Open IJ > File > Project Structure > Artifacts > + > JAR > From modules with dependencies > Choose main class > Ok > Output directory to bin > Apply > Ok

2) Build > Build artifacts > build

3) Run > Edit Configurations > + > JAR application > Path to JAR > point to the .jar file > search sources using module's classpath > diamond hunter > Apply > Ok
