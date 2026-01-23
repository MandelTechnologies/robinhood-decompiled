package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final String zze;
    final String zzf;
    final String zzg;
    final String zzh;
    final String zzi;
    final String zzj;
    final String zzk;
    final String zzl;
    final String zzm;
    final long zzn;
    final String zzo;
    final String zzp;
    final String zzq;
    final String zzr;
    final String zzs;
    final String zzt;
    final String zzu;
    final int zzv;

    zzaj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = j;
        this.zzo = str14;
        this.zzp = str15;
        this.zzq = str16;
        this.zzr = str17;
        this.zzs = str18;
        this.zzt = str19;
        this.zzu = str20;
        this.zzv = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaj) {
            zzaj zzajVar = (zzaj) obj;
            if (Objects.equal(this.zza, zzajVar.zza) && Objects.equal(this.zzb, zzajVar.zzb) && Objects.equal(this.zzc, zzajVar.zzc) && Objects.equal(this.zzd, zzajVar.zzd) && Objects.equal(this.zze, zzajVar.zze) && Objects.equal(this.zzf, zzajVar.zzf) && Objects.equal(this.zzg, zzajVar.zzg) && Objects.equal(this.zzh, zzajVar.zzh) && Objects.equal(this.zzi, zzajVar.zzi) && Objects.equal(this.zzj, zzajVar.zzj) && Objects.equal(this.zzk, zzajVar.zzk) && Objects.equal(this.zzl, zzajVar.zzl) && Objects.equal(this.zzm, zzajVar.zzm) && this.zzn == zzajVar.zzn && Objects.equal(this.zzo, zzajVar.zzo) && Objects.equal(this.zzp, zzajVar.zzp) && Objects.equal(this.zzq, zzajVar.zzq) && Objects.equal(this.zzr, zzajVar.zzr) && Objects.equal(this.zzs, zzajVar.zzs) && Objects.equal(this.zzt, zzajVar.zzt) && Objects.equal(this.zzu, zzajVar.zzu) && Objects.equal(Integer.valueOf(this.zzv), Integer.valueOf(zzajVar.zzv))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, Integer.valueOf(this.zzv));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("issuerName", this.zza).add("issuerPhoneNumber", this.zzb).add("appLogoUrl", this.zzc).add("appName", this.zzd).add("appDeveloperName", this.zze).add("appPackageName", this.zzf).add("privacyNoticeUrl", this.zzg).add("termsAndConditionsUrl", this.zzh).add("productShortName", this.zzi).add("appAction", this.zzj).add("appIntentExtraMessage", this.zzk).add("issuerMessageHeadline", this.zzl).add("issuerMessageBody", this.zzm).add("issuerMessageExpiryTimestampMillis", Long.valueOf(this.zzn)).add("issuerMessageLinkPackageName", this.zzo).add("issuerMessageLinkAction", this.zzp).add("issuerMessageLinkExtraText", this.zzq).add("issuerMessageLinkUrl", this.zzr).add("issuerMessageLinkText", this.zzs).add("issuerWebLinkUrl", this.zzt).add("issuerWebLinkText", this.zzu).add("issuerMessageType", Integer.valueOf(this.zzv)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 22, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 23, this.zzu, false);
        SafeParcelWriter.writeInt(parcel, 24, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
