package com.salomao.cartoesdevisita

import android.app.Application
import com.salomao.cartoesdevisita.data.AppDatabase
import com.salomao.cartoesdevisita.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}