package interfaces

import OnClickListener

open class View {
    lateinit var clickListener:OnClickListener

    fun setListener(listener:OnClickListener){
        clickListener = listener
    }
    fun click(){
        clickListener.onClick()
    }
}