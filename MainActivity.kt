package com.dpn4android.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener {
//            val toast=Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
//             by adding the 14th and 15th line we can use the 16th line alone
//        val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text="6"

            rollDice()

        }
    }
//        This the logic for the Rolling the Dice -->private fun rollDice and Class Dice
    private fun rollDice() {
//     Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

// Update the screen with the dice roll
  /*
****** This code is to view the Text like 1 ,2,3,4,5,6
          val resultTextView: TextView = findViewById(R.id.textview)
        resultTextView.text = diceRoll.toString()
    */
    val diceImage: ImageView = findViewById(R.id.imageView)
  //  diceImage.setImageResource(R.drawable.dice_2) =======>This code calls the `setImageResource()` method on the `ImageView`, passing the resource ID for the `dice_2` image.
                          // This will update the `ImageView` on screen to display the `dice_2` image.

    when(diceRoll)
    {
        1->diceImage.setImageResource(R.drawable.dice_1)
        2->diceImage.setImageResource(R.drawable.dice_2)
        3->diceImage.setImageResource(R.drawable.dice_3)
        4->diceImage.setImageResource(R.drawable.dice_4)
        5->diceImage.setImageResource(R.drawable.dice_5)
        6->diceImage.setImageResource(R.drawable.dice_6)

//     other method to describe the above function

//        if (diceRoll == 1) {
//            diceImage.setImageResource(R.drawable.dice_1)
//        } else if (diceRoll == 2) {
//            diceImage.setImageResource(R.drawable.dice_2)
//        }
//            ...

    }

}

}
class Dice(val numSides: Int)
{
    fun roll(): Int{
        return(1..numSides).random()
    }
}