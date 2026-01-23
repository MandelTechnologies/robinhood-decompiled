package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    final boolean zza;
    final int zzb;
    final int zzc;
    final int zzd;
    final boolean zze;

    zzah(boolean z, int i, int i2, int i3, boolean z2) {
        this.zza = z;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (this.zza == zzahVar.zza && this.zzb == zzahVar.zzb && this.zzd == zzahVar.zzd && this.zzc == zzahVar.zzc && this.zze == zzahVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Boolean.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("requireCdcvmPassing", Boolean.valueOf(this.zza)).add("cdcvmExpirtaionInSecs", Integer.valueOf(this.zzb)).add("unlockedTapLimit", Integer.valueOf(this.zzc)).add("cdcvmTapLimit", Integer.valueOf(this.zzd)).add("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
