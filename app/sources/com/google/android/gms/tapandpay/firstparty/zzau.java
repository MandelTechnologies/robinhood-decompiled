package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    final String zza;
    final String zzb;
    final int zzc;
    final TokenStatus zzd;
    final String zze;
    final Uri zzf;
    final byte[] zzg;
    final zzan[] zzh;
    final int zzi;
    final boolean zzj;

    zzau(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, zzan[] zzanVarArr, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = tokenStatus;
        this.zze = str3;
        this.zzf = uri;
        this.zzg = bArr;
        this.zzh = zzanVarArr;
        this.zzi = i2;
        this.zzj = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (Objects.equal(this.zza, zzauVar.zza) && Objects.equal(this.zzb, zzauVar.zzb) && this.zzc == zzauVar.zzc && Objects.equal(this.zzd, zzauVar.zzd) && Objects.equal(this.zze, zzauVar.zze) && Objects.equal(this.zzf, zzauVar.zzf) && Arrays.equals(this.zzg, zzauVar.zzg) && Arrays.equals(this.zzh, zzauVar.zzh) && this.zzi == zzauVar.zzi && this.zzj == zzauVar.zzj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.zza).add("displayName", this.zzb).add("cardNetwork", Integer.valueOf(this.zzc)).add("tokenStatus", this.zzd).add("panLastDigits", this.zze).add("cardImageUrl", this.zzf);
        byte[] bArr = this.zzg;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("inAppCardToken", bArr == null ? null : Arrays.toString(bArr));
        zzan[] zzanVarArr = this.zzh;
        return toStringHelperAdd2.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("tokenType", Integer.valueOf(this.zzi)).add("supportsOdaTransit", Boolean.valueOf(this.zzj)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
