package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzga extends zzfz {
    private final Function2 zza;
    private final String zzb;

    public zzga(Function2 function2, String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfz
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionEmptyList;
        if (!Intrinsics.areEqual(method.getName(), this.zzb)) {
            return false;
        }
        zzud zzudVarZzf = zzuh.zzf();
        if (objArr != null) {
            collectionEmptyList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzuf zzufVarZzf = zzug.zzf();
                zzufVarZzf.zzv(obj2.toString());
                collectionEmptyList.add((zzug) zzufVarZzf.zzj());
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        zzudVarZzf.zzd(collectionEmptyList);
        zzuh zzuhVar = (zzuh) zzudVarZzf.zzj();
        Function2 function2 = this.zza;
        byte[] bArrZzd = zzuhVar.zzd();
        function2.invoke(objArr, zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
