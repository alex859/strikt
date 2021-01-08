import java.net.URL

plugins {
  kotlin("jvm")
  id("published")
  id("info.solidsoft.pitest")
}

dependencies {
  api(project(":strikt-core"))

  compileOnly("io.arrow-kt:arrow-core:0.10.5")
  testImplementation("io.arrow-kt:arrow-core:0.10.5")

  testImplementation("dev.minutest:minutest:+")
}

tasks.dokka {
  configuration {
    "https://arrow-kt.io/docs/apidocs/arrow-core-data/".also {
      externalDocumentationLink {
        url = URL(it)
        packageListUrl = URL(it + "package-list")
      }
    }
  }
}
