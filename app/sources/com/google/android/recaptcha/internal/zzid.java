package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.places.api.model.PlaceTypes;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzid implements zzij {
    private final Context zza;

    public zzid(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzij
    /* renamed from: cs */
    public final /* synthetic */ Object mo992cs(Object[] objArr) {
        return zzig.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzij
    @SuppressLint({"UnprotectedReceiver"})
    public final Object zza(Object... objArr) throws zzcg {
        Intent intentRegisterReceiver = this.zza.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            throw new zzcg(7, 19, null);
        }
        int intExtra = intentRegisterReceiver.getIntExtra(PlaceTypes.HEALTH, -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("plugged", -1);
        boolean booleanExtra = intentRegisterReceiver.getBooleanExtra("present", false);
        int intExtra4 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra5 = intentRegisterReceiver.getIntExtra("status", -1);
        String stringExtra = intentRegisterReceiver.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(intentRegisterReceiver.getIntExtra("temperature", -1)), Integer.valueOf(intentRegisterReceiver.getIntExtra("voltage", -1))};
    }
}
