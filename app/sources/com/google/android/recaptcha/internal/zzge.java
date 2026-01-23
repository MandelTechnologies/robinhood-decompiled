package com.google.android.recaptcha.internal;

import kotlin.LazyKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzge {
    public static final Class zza(Object obj) throws ClassNotFoundException, zzcg {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzcg(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzcg(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i = zzax.zza;
            if (((zzfw) LazyKt.lazy(zzgd.zza).getValue()).zzb(str)) {
                return cls2;
            }
            throw new zzcg(6, 47, null);
        } catch (Exception e) {
            throw new zzcg(6, 8, e);
        }
    }
}
