(ns clj-tinify.core
  (:require [org.httpkit.client :as http]
            [org.httpkit.sni-client :as sni-client])
  (:import [org.apache.commons.codec.binary Base64]))

(def ^:private http-client
  "Default HTTP Client"
  sni-client/default-client)

(defn make-auth
  [api-key]
  (->> (format "api:%s" api-key)
       (.getBytes)
       (Base64/encodeBase64String)
       (str "Basic ")))

(defn make-client
  "Creates a new Tinify Client with the specified API key"
  ([api-key]
   (make-client "api.tinify.com" api-key))
  ([host api-key]
   (make-client host api-key {}))
  ([host api-key http-options]
   {:host host
    :api-key api-key
    :opts http-options
    :auth (make-auth api-key)}))

