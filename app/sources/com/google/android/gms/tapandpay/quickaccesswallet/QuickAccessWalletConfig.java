package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzh();
    private int zza;
    private int zzb;
    private int zzc;
    private String[] zzd;

    private QuickAccessWalletConfig() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzb;
    }

    public int getCardWidthPx() {
        return this.zza;
    }

    public String[] getCurrentWalletCardIds() {
        return this.zzd;
    }

    public int getMaxCards() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = strArr;
    }
}
