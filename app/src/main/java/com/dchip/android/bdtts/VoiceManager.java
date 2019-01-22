package com.dchip.android.bdtts;

import android.content.Context;

import com.baidu.tts.client.TtsMode;

/**
 * Created by llakcs on 2018/3/31.
 */

public interface VoiceManager {

    void initialTts(Context context,String appId, String appKey, String secretKey);
    void speak(String str);
}
