package com.mdse.eventero.interfaces;

interface CallbackEvent <T>{
    void OnSuccess(T O);
    void OnFailure(String E);
    void OnFailure(Exception E);
}
