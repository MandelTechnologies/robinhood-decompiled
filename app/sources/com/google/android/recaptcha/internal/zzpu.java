package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzpu extends RuntimeException {
    public zzpu(zzoq zzoqVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zznv zza() {
        return new zznv(getMessage());
    }
}
