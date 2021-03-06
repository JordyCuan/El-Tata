package com.pid2.tata.gcm;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by JordyCuan on 19/08/15.
 */
public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		// Explicitly specify that GcmMessageHandler will handle the intent.
		ComponentName comp = new ComponentName(context.getPackageName(),
				GcmMessageHandler.class.getName());

		// Start the service, keeping the device awake while it is launching.
		startWakefulService(context, (intent.setComponent(comp)));
		setResultCode(Activity.RESULT_OK);
	}

	// TODO: Verificar en el arranque del dispositivo si es que este está registrado
}