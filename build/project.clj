(defproject org.immutant/immutant-build "1.0.3-SNAPSHOT"
  :parent [org.immutant/immutant-parent _ :relative-path "../pom.xml"]
  :plugins [[lein-modules "0.2.0"]]
  :packaging "pom"

  :modules {:dirs ["assembly"]}

  :profiles {:dist {:modules {:dirs ["dist"]}}})