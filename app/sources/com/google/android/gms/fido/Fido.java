package com.google.android.gms.fido;

import android.app.Activity;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes27.dex */
public class Fido {
    public static final Api.ClientKey zza;
    public static final Api zzb;
    public static final zzaa zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.U2F_ZERO_PARTY_API", new zzab(), clientKey);
        zzc = new zzaa();
    }

    public static Fido2ApiClient getFido2ApiClient(Activity activity) {
        return new Fido2ApiClient(activity);
    }
}
