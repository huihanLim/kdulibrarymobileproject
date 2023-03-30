package com.example.prototype2.fragments.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public HomeViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is the Home Fragment I DONT ANDASTANDO");
    }

    public LiveData<String> getText() {return mText;};

}
