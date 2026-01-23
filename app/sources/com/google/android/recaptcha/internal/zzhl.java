package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.ArraysKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhl implements zzgz {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        int length = zzvlVarArr.length;
        if (length == 0) {
            throw new zzcg(4, 3, null);
        }
        Constructor<?> constructorZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != Objects.nonNull(constructorZza)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzcg(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
        Object[] objArrZzg = zzgfVar.zzc().zzg(ArraysKt.toList(zzvlVarArr).subList(1, length));
        try {
            zzgfVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            throw new zzcg(6, 14, e);
        }
    }
}
