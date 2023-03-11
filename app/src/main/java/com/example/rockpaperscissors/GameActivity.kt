package com.example.rockpaperscissors

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupWindow
import kotlin.random.Random

class GameActivity : AppCompatActivity() {
    private lateinit var btnScissor: ImageButton
    private lateinit var btnPaper: ImageButton
    private lateinit var btnRock: ImageButton
    private lateinit var btnExit: Button
    private lateinit var myDialog: Dialog
    private lateinit var exitPopup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btnScissor = findViewById(R.id.btnScissor)
        btnPaper = findViewById(R.id.btnPaper)
        btnRock = findViewById(R.id.btnRock)
        btnExit = findViewById(R.id.btnExit)
        myDialog = Dialog(this)

        //Rock = 1, Paper = 2, Scissors = 3
        btnScissor.setOnClickListener{
            val machine = rand(1,3)
            when(machine){
                1 -> {
                    myDialog.setContentView(R.layout.activity_lose_popup)
                    exitPopup = myDialog.findViewById(R.id.exitLose)

                    val imgUser:ImageView = myDialog.findViewById(R.id.loseUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.scissors)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.loseMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.rock)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }

                }
                2 -> {
                    myDialog.setContentView(R.layout.activity_win_popup)
                    exitPopup = myDialog.findViewById(R.id.exitWin)

                    val imgUser:ImageView = myDialog.findViewById(R.id.winUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.scissors)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.winMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.paper)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }
                }
                3 -> {
                    myDialog.setContentView(R.layout.activity_draw_popup)
                    exitPopup = myDialog.findViewById(R.id.exitDraw)

                    val imgUser:ImageView = myDialog.findViewById(R.id.drawUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.scissors)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.drawMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.scissors)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }
                }
            }
        }

        //Rock = 1, Paper = 2, Scissors = 3
        btnRock.setOnClickListener{
            val machine = rand(1,3)
            when(machine){
                1 -> {
                    myDialog.setContentView(R.layout.activity_draw_popup)
                    exitPopup = myDialog.findViewById(R.id.exitDraw)

                    val imgUser:ImageView = myDialog.findViewById(R.id.drawUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.rock)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.drawMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.rock)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }

                }
                2 -> {
                    myDialog.setContentView(R.layout.activity_lose_popup)
                    exitPopup = myDialog.findViewById(R.id.exitLose)

                    val imgUser:ImageView = myDialog.findViewById(R.id.loseUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.rock)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.loseMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.paper)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }
                }
                3 -> {
                    myDialog.setContentView(R.layout.activity_win_popup)
                    exitPopup = myDialog.findViewById(R.id.exitWin)

                    val imgUser: ImageView = myDialog.findViewById(R.id.winUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.rock)
                    val imgMachine: ImageView = myDialog.findViewById(R.id.winMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.scissors)

                    myDialog.show()

                    exitPopup.setOnClickListener {
                        myDialog.dismiss()
                    }
                }
            }
        }

        //Rock = 1, Paper = 2, Scissors = 3
        btnPaper.setOnClickListener{
            val machine = rand(1,3)
            when(machine){
                1 -> {
                    myDialog.setContentView(R.layout.activity_win_popup)
                    exitPopup = myDialog.findViewById(R.id.exitWin)

                    val imgUser:ImageView = myDialog.findViewById(R.id.winUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.paper)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.winMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.rock)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }

                }
                2 -> {
                    myDialog.setContentView(R.layout.activity_draw_popup)
                    exitPopup = myDialog.findViewById(R.id.exitDraw)

                    val imgUser:ImageView = myDialog.findViewById(R.id.drawUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.paper)
                    val imgMachine:ImageView = myDialog.findViewById(R.id.drawMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.paper)

                    myDialog.show()

                    exitPopup.setOnClickListener{
                        myDialog.dismiss()
                    }
                }
                3 -> {
                    myDialog.setContentView(R.layout.activity_lose_popup)
                    exitPopup = myDialog.findViewById(R.id.exitLose)

                    val imgUser: ImageView = myDialog.findViewById(R.id.loseUserChoosePopUp)
                    imgUser.setImageResource(R.drawable.paper)
                    val imgMachine: ImageView = myDialog.findViewById(R.id.loseMachineChoosePopUp)
                    imgMachine.setImageResource(R.drawable.scissors)

                    myDialog.show()

                    exitPopup.setOnClickListener {
                        myDialog.dismiss()
                    }
                }
            }
        }

        btnExit.setOnClickListener{
            val context = btnExit.context
            backToMenu(context)
        }

    }
}

fun rand(start:Int, end:Int): Int{
    require(start <= end){"Illegal Argument"}
    return (start..end).random()
}

fun backToMenu(context: Context){
    val intent = Intent(context,MainActivity::class.java).apply {  }
    context.startActivity(intent)
}