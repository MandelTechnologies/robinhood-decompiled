package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.math.BigDecimal;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    final long zza;
    final BigDecimal zzb;
    final String zzc;
    final long zzd;
    final int zze;

    public zzas(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.zza = j;
        this.zzb = bigDecimal;
        this.zzc = str;
        this.zzd = j2;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzasVar = (zzas) obj;
            if (this.zza == zzasVar.zza && Objects.equal(this.zzb, zzasVar.zzb) && Objects.equal(this.zzc, zzasVar.zzc) && this.zzd == zzasVar.zzd && this.zze == zzasVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionId", Long.valueOf(this.zza)).add("amount", this.zzb).add("currency", this.zzc).add("transactionTimeMillis", Long.valueOf(this.zzd)).add("type", Integer.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBigDecimal(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
