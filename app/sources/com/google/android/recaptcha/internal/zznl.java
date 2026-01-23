package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zznf;
import com.google.android.recaptcha.internal.zznl;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zznl<MessageType extends zznl<MessageType, BuilderType>, BuilderType extends zznf<MessageType, BuilderType>> extends zzkq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzpw zzc = zzpw.zzc();

    protected static zzns zzA() {
        return zzpb.zze();
    }

    protected static zzns zzB(zzns zznsVar) {
        int size = zznsVar.size();
        return zznsVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzD(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzE(zzoq zzoqVar, String str, Object[] objArr) {
        return new zzpc(zzoqVar, str, objArr);
    }

    protected static void zzH(Class cls, zznl zznlVar) {
        zznlVar.zzG();
        zzb.put(cls, zznlVar);
    }

    protected static final boolean zzJ(zznl zznlVar, boolean z) {
        byte bByteValue = ((Byte) zznlVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzpa.zza().zzb(zznlVar.getClass()).zzl(zznlVar);
        if (z) {
            zznlVar.zzh(2, true != zZzl ? null : zznlVar, null);
        }
        return zZzl;
    }

    private final int zzf(zzpe zzpeVar) {
        return zzpa.zza().zzb(getClass()).zza(this);
    }

    private static zznl zzg(zznl zznlVar) throws zznv {
        if (zznlVar == null || zzJ(zznlVar, true)) {
            return zznlVar;
        }
        throw new zzpu(zznlVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zznl zzi(zznl zznlVar, byte[] bArr, int i, int i2, zzmw zzmwVar) throws zznv {
        if (i2 == 0) {
            return zznlVar;
        }
        zznl zznlVarZzu = zznlVar.zzu();
        try {
            zzpe zzpeVarZzb = zzpa.zza().zzb(zznlVarZzu.getClass());
            zzpeVarZzb.zzi(zznlVarZzu, bArr, 0, i2, new zzkv(zzmwVar));
            zzpeVarZzb.zzf(zznlVarZzu);
            return zznlVarZzu;
        } catch (zznv e) {
            if (e.zzb()) {
                throw new zznv(e);
            }
            throw e;
        } catch (zzpu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zznv) {
                throw ((zznv) e3.getCause());
            }
            throw new zznv(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zznv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zznk zzr(zzoq zzoqVar, Object obj, zzoq zzoqVar2, zzno zznoVar, int i, zzqg zzqgVar, Class cls) {
        return new zznk(zzoqVar, "", null, new zznj(null, i, zzqgVar, false, false), cls);
    }

    static zznl zzt(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        zznl zznlVar = (zznl) map.get(cls);
        if (zznlVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zznlVar = (zznl) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zznlVar != null) {
            return zznlVar;
        }
        zznl zznlVar2 = (zznl) ((zznl) zzqc.zze(cls)).zzh(6, null, null);
        if (zznlVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zznlVar2);
        return zznlVar2;
    }

    protected static zznl zzv(zznl zznlVar, InputStream inputStream) throws zznv {
        zzlm zzlkVar;
        int i = zzlm.zzd;
        if (inputStream == null) {
            byte[] bArr = zznt.zzb;
            int length = bArr.length;
            zzlkVar = zzlm.zzH(bArr, 0, 0, false);
        } else {
            zzlkVar = new zzlk(inputStream, 4096, null);
        }
        int i2 = zzmw.zzb;
        int i3 = zzpa.zza;
        zzmw zzmwVar = zzmw.zza;
        zznl zznlVarZzu = zznlVar.zzu();
        try {
            zzpe zzpeVarZzb = zzpa.zza().zzb(zznlVarZzu.getClass());
            zzpeVarZzb.zzh(zznlVarZzu, zzln.zzq(zzlkVar), zzmwVar);
            zzpeVarZzb.zzf(zznlVarZzu);
            zzg(zznlVarZzu);
            return zznlVarZzu;
        } catch (zznv e) {
            if (e.zzb()) {
                throw new zznv(e);
            }
            throw e;
        } catch (zzpu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zznv) {
                throw ((zznv) e3.getCause());
            }
            throw new zznv(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zznv) {
                throw ((zznv) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zznl zzw(zznl zznlVar, byte[] bArr) throws zznv {
        int i = zzmw.zzb;
        int i2 = zzpa.zza;
        zznl zznlVarZzi = zzi(zznlVar, bArr, 0, bArr.length, zzmw.zza);
        zzg(zznlVarZzi);
        return zznlVarZzi;
    }

    protected static zznq zzx() {
        return zznm.zzf();
    }

    protected static zznq zzy(zznq zznqVar) {
        int size = zznqVar.size();
        return zznqVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zznr zzz() {
        return zzof.zzf();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzpa.zza().zzb(getClass()).zzk(this, (zznl) obj);
    }

    public final int hashCode() {
        if (zzK()) {
            return zzm();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzos.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final zzoy zzC() {
        return (zzoy) zzh(7, null, null);
    }

    protected final void zzF() {
        zzpa.zza().zzb(getClass()).zzf(this);
        zzG();
    }

    final void zzG() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzI(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzK() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    final int zza(zzpe zzpeVar) {
        if (zzK()) {
            int iZza = zzpeVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzpeVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ zzop zzad() {
        return (zznf) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ zzop zzae() {
        zznf zznfVar = (zznf) zzh(5, null, null);
        zznfVar.zzg(this);
        return zznfVar;
    }

    @Override // com.google.android.recaptcha.internal.zzor
    public final /* synthetic */ zzoq zzaf() {
        return (zznl) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final void zze(zzlr zzlrVar) throws IOException {
        zzpa.zza().zzb(getClass()).zzj(this, zzls.zza(zzlrVar));
    }

    protected abstract Object zzh(int i, Object obj, Object obj2);

    final int zzm() {
        return zzpa.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzor
    public final boolean zzo() {
        return zzJ(this, true);
    }

    protected final zznf zzp() {
        return (zznf) zzh(5, null, null);
    }

    public final zznf zzq() {
        zznf zznfVar = (zznf) zzh(5, null, null);
        zznfVar.zzg(this);
        return zznfVar;
    }

    final zznl zzu() {
        return (zznl) zzh(4, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final int zzn() {
        if (zzK()) {
            int iZzf = zzf(null);
            if (iZzf >= 0) {
                return iZzf;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzf2 = zzf(null);
        if (iZzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
            return iZzf2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzf2);
    }
}
