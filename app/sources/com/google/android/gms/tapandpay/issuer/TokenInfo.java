package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zzg();
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final int zze;
    final int zzf;
    final int zzg;
    final boolean zzh;
    final String zzi;

    TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = z;
        this.zzi = str5;
    }

    public String getDpanLastFour() {
        return this.zzd;
    }

    public String getFpanLastFour() {
        return this.zzc;
    }

    public boolean getIsDefaultToken() {
        return this.zzh;
    }

    public String getIssuerName() {
        return this.zzb;
    }

    public String getIssuerTokenId() {
        return this.zza;
    }

    public int getNetwork() {
        return this.zzf;
    }

    public String getPortfolioName() {
        return this.zzi;
    }

    public int getTokenServiceProvider() {
        return this.zze;
    }

    public int getTokenState() {
        return this.zzg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
