package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    final long zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final String zze;

    zze(long j, String str, String str2, String str3, String str4) {
        this.zza = j;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(zzeVar.zza)) && Objects.equal(this.zzb, zzeVar.zzb) && Objects.equal(this.zzc, zzeVar.zzc) && Objects.equal(this.zzd, zzeVar.zzd) && Objects.equal(this.zze, zzeVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("expirationTimestamp", Long.valueOf(this.zza)).add("websiteUrl", this.zzb).add("websiteRedirectText", this.zzc).add("legalDisclaimer", this.zzd).add(ErrorBundle.SUMMARY_ENTRY, this.zze).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
