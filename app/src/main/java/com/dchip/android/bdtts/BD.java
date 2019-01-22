package com.dchip.android.bdtts;

/**
 * Created by llakcs on 2018/3/31.
 */

public class BD {

    /**
     * 返回 人面识别管理器
     *
     * @return the opencv manager
     */
    public static VoiceManager tts(){
        if(Ext.voiceManager == null){
            VoiceManagerimpl.registerInstance();
        }
        return Ext.voiceManager;
    }


    /**
     * 扩展类
     */
    public static class Ext {

        private static VoiceManager voiceManager;

        private Ext() {
        }

        /**
         * 设置人面识别管理器
         *
         * @param voiceManager the opencv manager
         */
        public static void setVoiceManager(VoiceManager voiceManager) {
            Ext.voiceManager = voiceManager;
        }
    }
}
