package my.toru.kbviperusage.mvp

import my.toru.kbviperusage.model.response.InstagramModel

/**
 * Created by toruchoi on 24/10/2017.
 */
interface MainView {
    fun onUpdate(result:List<InstagramModel>)
}