package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public abstract class zzbeg implements zzbnv {
    @Override // com.google.android.libraries.places.internal.zzbnv, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected final void zza(int i) {
        if (zzf() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public boolean zzd() {
        return false;
    }
}
