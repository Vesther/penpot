(ns uxbox.ui.workspace.clipboard
  (:require [sablono.core :as html :refer-macros [html]]
            [uxbox.ui.mixins :as mx]
            [uxbox.ui.lightbox :as lightbox]))

(defn- clipboard-dialog-render
  [own]
  (html
   [:div.lightbox-body
    [:div.clipboard-items
     (for [i (range 5)]
       [:div {:key i}
        [:span (str "shape " i)]])]]))

(def clipboard-dialog
  (mx/component
   {:render clipboard-dialog-render
    :name "clipboard-dialog"
    :mixins []}))

(defmethod lightbox/render-lightbox :clipboard
  [_]
  (clipboard-dialog))
