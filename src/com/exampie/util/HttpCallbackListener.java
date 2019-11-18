package com.exampie.util;

public interface HttpCallbackListener {
	void onFinish(String response);
    void onEttor(Exception e);
}
