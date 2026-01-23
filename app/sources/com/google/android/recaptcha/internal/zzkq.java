package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkp;
import com.google.android.recaptcha.internal.zzkq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zzkq<MessageType extends zzkq<MessageType, BuilderType>, BuilderType extends zzkp<MessageType, BuilderType>> implements zzoq {
    protected int zza = 0;

    protected static void zzc(Iterable iterable, List list) {
        byte[] bArr = zznt.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzoc)) {
            if (iterable instanceof zzoz) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    int size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        list.remove(size2);
                    }
                } else {
                    list.add(obj);
                }
            }
            return;
        }
        List listZza = ((zzoc) iterable).zza();
        zzoc zzocVar = (zzoc) list;
        int size3 = list.size();
        for (Object obj2 : listZza) {
            if (obj2 == null) {
                String str2 = "Element at index " + (zzocVar.size() - size3) + " is null.";
                int size4 = zzocVar.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    zzocVar.remove(size4);
                }
            } else if (obj2 instanceof zzlg) {
                zzocVar.zzb();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj2;
                zzlg.zzk(bArr2, 0, bArr2.length);
                zzocVar.zzb();
            } else {
                zzocVar.add((String) obj2);
            }
        }
    }

    int zza(zzpe zzpeVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final zzlg zzb() {
        try {
            int iZzn = zzn();
            zzlg zzlgVar = zzlg.zzb;
            byte[] bArr = new byte[iZzn];
            zzlo zzloVar = new zzlo(bArr, 0, iZzn);
            zze(zzloVar);
            zzloVar.zzC();
            return new zzlf(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzd() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            zzlo zzloVar = new zzlo(bArr, 0, iZzn);
            zze(zzloVar);
            zzloVar.zzC();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
