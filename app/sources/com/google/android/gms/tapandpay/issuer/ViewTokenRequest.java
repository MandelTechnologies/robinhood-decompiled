package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public class ViewTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new zzj();
    final String zza;
    final int zzb;

    /* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private String zza;
        private int zzb;

        public ViewTokenRequest build() {
            return new ViewTokenRequest(this.zza, this.zzb);
        }

        public Builder setIssuerTokenId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setTokenServiceProvider(int i) {
            this.zzb = i;
            return this;
        }
    }

    ViewTokenRequest(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
