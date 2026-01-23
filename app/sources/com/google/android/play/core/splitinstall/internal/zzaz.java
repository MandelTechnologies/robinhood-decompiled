package com.google.android.play.core.splitinstall.internal;

import io.jsonwebtoken.Header;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes27.dex */
final class zzaz implements zzan {
    zzaz() {
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzay.zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzay.zzd(classLoader, file, file2, z, Header.COMPRESSION_ALGORITHM);
    }
}
