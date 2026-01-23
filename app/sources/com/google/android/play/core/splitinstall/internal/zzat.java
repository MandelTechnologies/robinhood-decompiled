package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes27.dex */
final class zzat implements zzan {
    static Object zzc(ClassLoader classLoader) {
        return zzbk.zzb(classLoader, "pathList", Object.class).zzc();
    }

    static boolean zze(ClassLoader classLoader, File file, File file2, boolean z, zzas zzasVar, String str, zzar zzarVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Object objZzc = zzc(classLoader);
        zzbi zzbiVarZza = zzbk.zza(objZzc, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) zzbiVarZza.zzc());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) zzbk.zzb(it.next(), str, File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !zzarVar.zza(objZzc, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        zzbiVarZza.zza(Arrays.asList(zzasVar.zza(objZzc, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IOException iOException = (IOException) arrayList.get(i);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
            } catch (Exception unused) {
            }
        }
        zzbk.zza(objZzc, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
        throw zzbhVar;
    }
}
