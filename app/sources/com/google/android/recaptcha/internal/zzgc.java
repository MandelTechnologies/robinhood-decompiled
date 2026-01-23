package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgc extends zzfz {
    private final zzgb zza;
    private final String zzb;

    public zzgc(zzgb zzgbVar, String str, Object obj) {
        super(obj);
        this.zza = zzgbVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfz
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listEmptyList;
        if (!Intrinsics.areEqual(method.getName(), this.zzb)) {
            return false;
        }
        zzgb zzgbVar = this.zza;
        if (objArr == null || (listEmptyList = ArraysKt.asList(objArr)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        zzgbVar.zzb(listEmptyList);
        return true;
    }
}
