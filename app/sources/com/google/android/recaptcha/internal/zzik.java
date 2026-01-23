package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzik implements zzij {
    private final Context zza;
    private final Map zzb = MapsKt.mapOf(Tuples4.m3642to(2, Context.ACTIVITY_SERVICE), Tuples4.m3642to(3, Context.TELEPHONY_SERVICE), Tuples4.m3642to(4, Context.INPUT_METHOD_SERVICE), Tuples4.m3642to(5, Context.AUDIO_SERVICE));

    public zzik(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzij
    /* renamed from: cs */
    public final /* synthetic */ Object mo992cs(Object[] objArr) {
        return zzig.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzij
    public final Object zza(Object... objArr) throws zzcg {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzcg(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzcg(4, 4, null);
    }
}
