package com.spreadtrum.csvt;

import com.spreadtrum.csvt.videophone.vtmanager.VTManagerProxy;

import android.app.Application;
import android.util.Log;
import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemProperties;
import android.os.UserHandle;

import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneFactory;
import com.android.internal.telephony.RIL;

import com.spreadtrum.csvt.videophone.vtmanager.VTManagerProxy;


public class CsvtApp extends Application {
    private static final String TAG = CsvtApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "CsvtApp Boot Successfully!");

        if(UserHandle.myUserId() != UserHandle.USER_OWNER){
            return;
        }
        boolean supportVT = SystemProperties.getBoolean("persist.sys.csvt", false);
        if (supportVT) VTManagerProxy.init(this);
    }

}
