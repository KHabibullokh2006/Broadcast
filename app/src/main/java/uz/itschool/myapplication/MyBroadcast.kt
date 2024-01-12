package uz.itschool.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.widget.Toast

class MyBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val systemService = context?.getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        val isCharging = systemService.isCharging
//        if (isCharging){
//            Toast.makeText(context, "Device is charging",Toast.LENGTH_LONG).show()
//        }else{
//            Toast.makeText(context, "Device is not charging",Toast.LENGTH_LONG).show()
//        }

//        val status = intent?.getStringExtra(BatteryManager.EXTRA_STATUS)
//        Toast.makeText(context, "Status of battery is $status",Toast.LENGTH_LONG).show()

        val level = intent?.getIntExtra("level",0)
        val status = intent?.getIntExtra("status",0)
        when(status){
            1->{

            }
        }
        Toast.makeText(context, "Status of battery is ${level.toString()}%",Toast.LENGTH_LONG).show()
        Toast.makeText(context, "Status of battery is $status",Toast.LENGTH_LONG).show()
    }
}