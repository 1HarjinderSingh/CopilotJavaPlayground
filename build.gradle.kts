plugins {
    id("buildlogic.java-application-conventions")
    id("buildlogic.java-library-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    // Consolidated dependencies from app and utilities modules
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}
