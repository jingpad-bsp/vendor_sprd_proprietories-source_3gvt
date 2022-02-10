
package com.spreadtrum.csvt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;





public class CsvtService extends Service {
	private static final String TAG = CsvtService.class.getSimpleName();
	
	@Override
    public void onCreate() {
        iLog("csvt Service onCreate.");
	}
	@Override
    public IBinder onBind(Intent intent) {
        iLog("csvt Service onBind:" + intent.getAction());
        return null;
    }
	private void iLog(String log) {
        Log.i(TAG, log);
    }
	@Override
    public void onDestroy() {
        iLog("csvt Service Destroyed.");
        super.onDestroy();
    }
	
}
