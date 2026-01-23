package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzpk {
    private static final ThreadLocal zza = new zzpj();

    static char[] zza() {
        char[] cArr = (char[]) zza.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
