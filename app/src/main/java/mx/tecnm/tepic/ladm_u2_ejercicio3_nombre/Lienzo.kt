package mx.tecnm.tepic.ladm_u2_ejercicio3_nombre

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class Lienzo(p:MainActivity) : View(p) {

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        c.drawColor(Color.BLUE)


        //Luna
        p.color=Color.WHITE
        c.drawCircle(75f,45f,30f,p)

        p.color=Color.BLUE
        c.drawCircle(90f,30f,20f,p)

        //montana 1
        p.color=Color.WHITE
        p.style = Paint.Style.FILL
        c.drawCircle(0f,750f,450f,p)

        p.color=Color.CYAN
        p.style = Paint.Style.STROKE
        p.strokeWidth = 2f
        c.drawCircle(0f,750f,450f,p)


        //Montana 2
        p.color=Color.WHITE
        p.style = Paint.Style.FILL
        c.drawCircle(550f,750f,500f,p)

        p.color=Color.CYAN
        p.style = Paint.Style.STROKE
        p.strokeWidth = 2f
        c.drawCircle(550f,750f,500f,p)


        //Arbol 1
        p.color=Color.GREEN
        p.style = Paint.Style.FILL
        c.drawOval(RectF(150f,315f,45f,255f),p)

        p.color=Color.GREEN
        p.style = Paint.Style.FILL
        c.drawOval(RectF(150f,265f,45f,195f),p)

        //tronco
        p.style = Paint.Style.FILL
        c.drawRect(95f,315f,105f,350f,p)
        c.drawARGB(0,78,59,49)


        //Arbol 2
        p.color=Color.GREEN
        p.style = Paint.Style.FILL
        c.drawOval(RectF(450f,315f,305f,255f),p)

        p.color=Color.GREEN
        p.style = Paint.Style.FILL
        c.drawOval(RectF(450f,265f,305f,195f),p)

        //tronco
        p.style = Paint.Style.FILL
        c.drawRect(395f,315f,360f,350f,p)
        c.drawARGB(0,78,59,49)

        //CASA
        //cuarto
        p.color=Color.RED
        p.style = Paint.Style.FILL
        c.drawRect(280f,415f,450f,550f,p)
        c.drawARGB(0,78,59,49)

        //techo
        p.color=Color.DKGRAY
        p.style = Paint.Style.FILL
        c.drawRect(260f,415f,470f,450f,p)
        c.drawARGB(0,78,59,49)

        //puerta
        p.color=Color.MAGENTA
        p.style = Paint.Style.FILL
        c.drawRect(395f,515f,360f,550f,p)
        c.drawARGB(0,78,59,49)








    }
}