package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzf();
    private int zza;
    private String zzb;
    private Bitmap zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private Bitmap zzg;
    private PendingIntent zzh;

    private GlobalActionCard() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && Objects.equal(this.zzb, globalActionCard.zzb) && Objects.equal(this.zzc, globalActionCard.zzc) && Objects.equal(this.zzd, globalActionCard.zzd) && Objects.equal(this.zze, globalActionCard.zze) && Objects.equal(this.zzf, globalActionCard.zzf) && Objects.equal(this.zzg, globalActionCard.zzg) && Objects.equal(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    public String getCardId() {
        return this.zzb;
    }

    public Bitmap getCardImage() {
        return this.zzc;
    }

    public int getCardType() {
        return this.zza;
    }

    public String getContentDescription() {
        return this.zzd;
    }

    public String getDeviceLockedMessageText() {
        return this.zzf;
    }

    public Bitmap getMessageIcon() {
        return this.zzg;
    }

    public String getMessageText() {
        return this.zze;
    }

    public PendingIntent getPendingIntent() {
        return this.zzh;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardType());
        SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i, false);
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }
}
