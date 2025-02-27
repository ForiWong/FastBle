package com.clj.fastble.data;


public enum BleScanState {

    STATE_IDLE(-1),//IDLE 空闲状态
    STATE_SCANNING(0X01);

    private int code;

    BleScanState(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
