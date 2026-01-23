package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    final String zza;
    final byte[] zzb;
    final int zzc;
    final TokenStatus zzd;
    final String zze;
    final zzaz zzf;

    zzb(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, zzaz zzazVar) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = tokenStatus;
        this.zze = str2;
        this.zzf = zzazVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.zzc == zzbVar.zzc && Objects.equal(this.zza, zzbVar.zza) && Arrays.equals(this.zzb, zzbVar.zzb) && Objects.equal(this.zzd, zzbVar.zzd) && Objects.equal(this.zze, zzbVar.zze) && Objects.equal(this.zzf, zzbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("clientTokenId", this.zza);
        byte[] bArr = this.zzb;
        return toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardNetwork", Integer.valueOf(this.zzc)).add("tokenStatus", this.zzd).add("tokenLastDigits", this.zze).add("transactionInfo", this.zzf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
