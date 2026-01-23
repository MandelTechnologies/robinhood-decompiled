package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzjd {
    public static final Map zza() {
        Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(-4, zzbc.zzo), Tuples4.m3642to(-12, zzbc.zzp), Tuples4.m3642to(-6, zzbc.zzk), Tuples4.m3642to(-11, zzbc.zzm), Tuples4.m3642to(-13, zzbc.zzq), Tuples4.m3642to(-14, zzbc.zzr), Tuples4.m3642to(-2, zzbc.zzl), Tuples4.m3642to(-7, zzbc.zzs), Tuples4.m3642to(-5, zzbc.zzt), Tuples4.m3642to(-9, zzbc.zzu), Tuples4.m3642to(-8, zzbc.zzE), Tuples4.m3642to(-15, zzbc.zzn), Tuples4.m3642to(-1, zzbc.zzv), Tuples4.m3642to(-3, zzbc.zzx), Tuples4.m3642to(-10, zzbc.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            mapMutableMapOf.put(-16, zzbc.zzw);
        }
        if (i >= 27) {
            mapMutableMapOf.put(1, zzbc.zzA);
            mapMutableMapOf.put(2, zzbc.zzB);
            mapMutableMapOf.put(0, zzbc.zzC);
            mapMutableMapOf.put(3, zzbc.zzD);
        }
        if (i >= 29) {
            mapMutableMapOf.put(4, zzbc.zzz);
        }
        return mapMutableMapOf;
    }
}
