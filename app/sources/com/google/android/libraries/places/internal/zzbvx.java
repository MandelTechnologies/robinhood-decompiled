package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class zzbvx implements zzbwq {
    final /* synthetic */ zzbvz zza;
    final /* synthetic */ zzbwq zzb;

    zzbvx(zzbvz zzbvzVar, zzbwq zzbwqVar) {
        this.zza = zzbvzVar;
        this.zzb = zzbwqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzbvz zzbvzVar = this.zza;
        try {
            this.zzb.close();
            Unit unit = Unit.INSTANCE;
        } catch (IOException e) {
            throw e;
        } finally {
            zzbvw.zza(zzbvz.zza, zzbvzVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Flushable
    public final void flush() {
        zzbvz zzbvzVar = this.zza;
        try {
            this.zzb.flush();
            Unit unit = Unit.INSTANCE;
        } catch (IOException e) {
            throw e;
        } finally {
            zzbvw.zza(zzbvz.zza, zzbvzVar);
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.zzb + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzn(zzbwb source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        zzbvv.zzb(source.zzg(), 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            zzbwn zzbwnVar = source.zza;
            Intrinsics.checkNotNull(zzbwnVar);
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += zzbwnVar.zzd - zzbwnVar.zzc;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zzbwnVar = zzbwnVar.zzg;
                    Intrinsics.checkNotNull(zzbwnVar);
                }
            }
            zzbvz zzbvzVar = this.zza;
            try {
                try {
                    this.zzb.zzn(source, j2);
                    Unit unit = Unit.INSTANCE;
                    zzbvw.zza(zzbvz.zza, zzbvzVar);
                    j -= j2;
                } catch (IOException e) {
                    zzbvw.zza(zzbvz.zza, zzbvzVar);
                    throw e;
                }
            } catch (Throwable th) {
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                throw th;
            }
        }
    }
}
