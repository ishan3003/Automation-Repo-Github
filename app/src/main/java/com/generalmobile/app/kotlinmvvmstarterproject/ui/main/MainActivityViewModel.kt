package com.generalmobile.app.kotlinmvvmstarterproject.ui.main

import android.app.Application
import com.generalmobile.app.kotlinmvvmstarterproject.db.AppDatabase
import com.generalmobile.app.kotlinmvvmstarterproject.R
import com.generalmobile.app.kotlinmvvmstarterproject.App
import com.generalmobile.app.kotlinmvvmstarterproject.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)

    /* Example Usage Of LiveData
    fun getExamples(): LiveData<List<Example>> {
        if (examples == null) {
            examples = MutableLiveData<List<Note>>()
            loadExamples()
        }

        return examples!!;
    }

    private fun loadExamples() {
        examples = db.exampleDao().getExamples()
    }
    */

}