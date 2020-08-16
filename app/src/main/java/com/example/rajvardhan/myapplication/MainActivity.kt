package com.example.rajvardhan.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    private var expression = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button0.setOnClickListener { view ->
            expression = expression + "0"
            ans_textView.text = expression
            Snackbar.make(view, "Clicked on 0", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button1.setOnClickListener { view ->
            expression = expression + "1"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 1", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button2.setOnClickListener { view ->
            expression = expression + "2"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 2", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button3.setOnClickListener { view ->
            expression = expression + "3"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 3", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button4.setOnClickListener { view ->
            expression = expression + "4"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 4", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button5.setOnClickListener { view ->
            expression = expression + "5"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 5", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button6.setOnClickListener { view ->
            expression = expression + "6"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 6", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button7.setOnClickListener { view ->
            expression = expression + "7"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 7", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button8.setOnClickListener { view ->
            expression = expression + "8"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 8", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        button9.setOnClickListener { view ->
            expression = expression + "9"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonPlus.setOnClickListener { view ->
            expression = expression + "+"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonMinus.setOnClickListener { view ->
            expression = expression + "-"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonMul.setOnClickListener { view ->
            expression = expression + "X"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonDiv.setOnClickListener { view ->
            expression = expression + "/"
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonEquals.setOnClickListener { view ->
            expression = solveExpression(expression).toString()
            ans_textView.text = expression
            Snackbar.make(view, "clicked on 9", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        buttonC.setOnClickListener { view ->
            expression = ""
            ans_textView.text = expression
            Snackbar.make(view, "Cleared expression", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun solveExpression(exp: String): Int{
        if (exp.contains("+")){
            val values = exp.split("+")
            return values[0].toInt() + values[1].toInt()
        }
        if (exp.contains("-")){
            val values = exp.split("-")
            return values[0].toInt() - values[1].toInt()
        }
        if (exp.contains("X")){
            val values = exp.split("X")
            return values[0].toInt() * values[1].toInt()
        }
        if (exp.contains("/")){
            val values = exp.split("/")
            return values[0].toInt() / values[1].toInt()
        }
        return 0
    }
}
