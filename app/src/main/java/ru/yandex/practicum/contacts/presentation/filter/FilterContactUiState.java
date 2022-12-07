package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    public Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    public boolean getisApplyEnable(){
        return isApplyEnable;
    }
    public void setisApplyEnable (boolean isApplyEnable){
        this.isApplyEnable = isApplyEnable;
    }
}
