(defproject clj-tinify "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit/http-kit "2.5.3"]
                 [commons-codec/commons-codec "1.15"]]
  :repl-options {:init-ns clj-tinify.core})
