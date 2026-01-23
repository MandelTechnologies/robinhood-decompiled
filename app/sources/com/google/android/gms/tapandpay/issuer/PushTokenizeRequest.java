package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new zze();
    final int zza;
    final int zzb;
    final byte[] zzc;
    final String zzd;
    final String zze;
    final UserAddress zzf;
    final boolean zzg;

    /* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private int zza;
        private int zzb;
        private byte[] zzc;
        private String zzd;
        private String zze;
        private UserAddress zzf;
        private boolean zzg;

        public PushTokenizeRequest build() {
            return new PushTokenizeRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public Builder setDisplayName(String str) {
            this.zze = str;
            return this;
        }

        public Builder setNetwork(int i) {
            this.zza = i;
            return this;
        }

        public Builder setOpaquePaymentCard(byte[] bArr) {
            this.zzc = bArr;
            return this;
        }

        public Builder setTokenServiceProvider(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setUserAddress(UserAddress userAddress) {
            this.zzf = userAddress;
            return this;
        }
    }

    PushTokenizeRequest(int i, int i2, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = userAddress;
        this.zzg = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
