package com.google.android.recaptcha.internal;

import com.adjust.sdk.network.ErrorCodes;
import kotlin.jvm.JvmField;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbn {

    @JvmField
    public static final zzbn zza = new zzbn(9999);

    @JvmField
    public static final zzbn zzb = new zzbn(1004);

    @JvmField
    public static final zzbn zzc = new zzbn(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);

    @JvmField
    public static final zzbn zzd = new zzbn(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);

    @JvmField
    public static final zzbn zze = new zzbn(ErrorCodes.IO_EXCEPTION);

    @JvmField
    public static final zzbn zzf = new zzbn(1008);

    @JvmField
    public static final zzbn zzg = new zzbn(1009);

    @JvmField
    public static final zzbn zzh = new zzbn(1010);
    private final int zzi;

    private zzbn(int i) {
        this.zzi = i;
    }

    public final int zza() {
        return this.zzi;
    }
}
