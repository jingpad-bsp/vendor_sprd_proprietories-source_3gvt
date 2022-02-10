package com.spreadtrum.csvt;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemProperties;
import android.util.Log;
import com.android.internal.telephony.TelephonyIntents;

public class CsvtBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = CsvtBroadcastReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        if(TelephonyIntents.ACTION_SIM_STATE_CHANGED.equals(intent.getAction())){
            Log.i(TAG, "ACTION_SIM_STATE_CHANGED.");
        } else {
            Log.e(TAG, "Received Intent: " + intent.toString());
        }
    }
}