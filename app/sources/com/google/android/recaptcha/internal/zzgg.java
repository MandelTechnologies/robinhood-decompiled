package com.google.android.recaptcha.internal;

import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgg {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzvl) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzvl zzvlVar) throws zzcg {
        int iZzS = zzvlVar.zzS();
        int i = iZzS - 1;
        if (iZzS == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zza.get(Integer.valueOf(zzvlVar.zzi()));
            case 1:
                return Boolean.valueOf(zzvlVar.zzQ());
            case 2:
                byte[] bArrZzl = zzvlVar.zzM().zzl();
                if (bArrZzl.length == 1) {
                    return Byte.valueOf(bArrZzl[0]);
                }
                throw new zzcg(4, 6, null);
            case 3:
                String strZzO = zzvlVar.zzO();
                if (strZzO.length() == 1) {
                    return Character.valueOf(strZzO.charAt(0));
                }
                throw new zzcg(4, 6, null);
            case 4:
                int iZzj = zzvlVar.zzj();
                if (iZzj < -32768 || iZzj > 32767) {
                    throw new zzcg(4, 6, null);
                }
                return Short.valueOf((short) iZzj);
            case 5:
                return Integer.valueOf(zzvlVar.zzk());
            case 6:
            case 8:
                throw new zzcg(4, 6, null);
            case 7:
                return Long.valueOf(zzvlVar.zzL());
            case 9:
                return Float.valueOf(zzvlVar.zzg());
            case 10:
                return Double.valueOf(zzvlVar.zzf());
            case 11:
                return zzvlVar.zzP();
            case 12:
                return null;
            default:
                throw new zzcg(4, 5, null);
        }
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, obj);
        this.zzb.add(Integer.valueOf(EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE));
    }

    public final void zze(int i, Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzge.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
