package com.example.testmultispinner



import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.androidbuts.multispinnerfilter.MultiSpinnerSearch
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val list: List<Gender> = Arrays.asList("satti1", "satti2", "satti3")
        var list2= arrayListOf<Gender>()
        list2.add(Gender("Mudassir",22))
        list2.add(Gender("Ahsan",33))

   //     patientGenderList = it as ArrayList<PatientGender> as ArrayList<PatientGender>

        val listArray: ArrayList<KeyPairBoolData> = arrayListOf()

        for (i in list2.indices) {
            val h = KeyPairBoolData()
            h.id = i + 1.toLong()
            h.name = list2[i].Name
            h.isSelected = false
            listArray.add(h)
        }

        val multiSelectSpinnerWithSearch = findViewById<MultiSpinnerSearch>(R.id.multipleItemSelectionSpinner)

        // Pass true If you want searchView above the list. Otherwise false. default = true.
        multiSelectSpinnerWithSearch.setSearchEnabled(true);

        // A text that will display in search hint.
        multiSelectSpinnerWithSearch.setSearchHint("Select your mood");

        // Set text that will display when search result not found...
        multiSelectSpinnerWithSearch.setEmptyTitle("Not Data Found!");

        // If you will set the limit, this button will not display automatically.
        multiSelectSpinnerWithSearch.setShowSelectAllButton(true);
        //A text that will display in clear text button
        multiSelectSpinnerWithSearch.setClearText("Close & Clear");


        // Removed second parameter, position. Its not required now..
        // If you want to pass preselected items, you can do it while making listArray,
        // pass true in setSelected of any item that you want to preselect

        /*val checkSelected = BooleanArray(arrayList.size)
        for (i in 0 until checkSelected.size) {
            checkSelected[i] = false
        }*/


        var keyPairBoolData1 = KeyPairBoolData()
        var keyPairBoolData2 = KeyPairBoolData()
        var keyPairBoolData3 = KeyPairBoolData()

        val gender=Gender("Male", 23)
        val gender1=Gender("Female", 33)


        var KeyPairBoolData =KeyPairBoolData()
         KeyPairBoolData.`object`=gender


        var KeyPairBoolData2 =KeyPairBoolData()
        KeyPairBoolData2.`object`=gender1


        var keyPairBoolData33= arrayListOf<KeyPairBoolData>()


        keyPairBoolData33.add(KeyPairBoolData)
        keyPairBoolData33.add(KeyPairBoolData2)







        keyPairBoolData1.id = 0
        keyPairBoolData1.name = "Item1"
        keyPairBoolData1.isSelected = false

        keyPairBoolData2.id = 0
        keyPairBoolData2.name = "Item2"
        keyPairBoolData2.isSelected = false

        keyPairBoolData3.id = 0
        keyPairBoolData3.name = "Item3"
        keyPairBoolData3.isSelected = false

        var listofkeypairData = arrayListOf<KeyPairBoolData>()
        listofkeypairData.add(keyPairBoolData1)
        listofkeypairData.add(keyPairBoolData2)
        listofkeypairData.add(keyPairBoolData3)

        multiSelectSpinnerWithSearch.setItems(listArray) { items ->
            for (i in items.indices) {
                if (items[i].isSelected) {
                    //ptienGnderId
                    val i1 = Log.i("TAG", i.toString() + " : " + items[i].name + " : " + items[i].isSelected)
                }
            }
        }


        /*  If you want to set limit as maximum item should be selected is 2.
          For No limit -1 or do not call this method.*/



    }
}


