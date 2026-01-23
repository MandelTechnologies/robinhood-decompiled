package com.google.android.libraries.places.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzmu extends zzmx {
    final /* synthetic */ zzmv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmu(zzmv zzmvVar, zzmy zzmyVar, CharSequence charSequence) {
        super(zzmyVar, charSequence);
        this.zza = zzmvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzmx
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzmx
    final int zzd(int i) {
        CharSequence charSequence = ((zzmx) this).zzb;
        int length = charSequence.length();
        zzmt.zzb(i, length, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        while (i < length) {
            zzmv zzmvVar = this.zza;
            if (zzmvVar.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
