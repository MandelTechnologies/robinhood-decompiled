package com.google.android.gms.auth.api.phone;

import android.content.Context;
import com.google.android.gms.internal.p556authapiphone.zzab;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes27.dex */
public final class SmsRetriever {
    public static SmsRetrieverClient getClient(Context context) {
        return new zzab(context);
    }
}
