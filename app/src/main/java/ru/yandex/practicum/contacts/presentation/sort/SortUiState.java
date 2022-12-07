package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    // реализуйте get и set методы для обоих полей
    public boolean getisApplyEnable(){
        return isApplyEnable;
    }
    public String getnewSelectedSortType (){
        return newSelectedSortType;
    }
    public void setisApplyEnable(boolean isApplyEnable){
        this.isApplyEnable = isApplyEnable;
    }
    public void setnewSelectedSortType (String newSelectedSortType){
        this.newSelectedSortType = newSelectedSortType;
    }
}
