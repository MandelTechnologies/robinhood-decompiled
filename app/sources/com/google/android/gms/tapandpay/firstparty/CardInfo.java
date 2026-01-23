package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzd();
    private static final com.google.android.gms.internal.tapandpay.zzau zzL = com.google.android.gms.internal.tapandpay.zzau.zzi(10, 9);
    long zzA;
    long zzB;
    boolean zzC;
    long zzD;
    String zzE;
    String zzF;
    zze zzG;
    int zzH;
    boolean zzI;
    String zzJ;
    int zzK;
    String zza;
    byte[] zzb;
    String zzc;
    String zzd;
    int zze;
    TokenStatus zzf;
    String zzg;
    Uri zzh;
    int zzi;
    int zzj;
    zzaj zzk;
    String zzl;
    zzaz zzm;
    String zzn;
    byte[] zzo;
    int zzp;
    int zzq;
    int zzr;
    zzah zzs;
    zzaf zzt;
    String zzu;
    zzan[] zzv;
    boolean zzw;
    List zzx;
    boolean zzy;
    boolean zzz;

    CardInfo(String str, byte[] bArr, String str2, String str3, int i, TokenStatus tokenStatus, String str4, Uri uri, int i2, int i3, zzaj zzajVar, String str5, zzaz zzazVar, String str6, byte[] bArr2, int i4, int i5, int i6, zzah zzahVar, zzaf zzafVar, String str7, zzan[] zzanVarArr, boolean z, List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str8, String str9, zze zzeVar, int i7, boolean z5, String str10, int i8) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = i;
        this.zzf = tokenStatus;
        this.zzg = str4;
        this.zzh = uri;
        this.zzi = i2;
        this.zzj = i3;
        this.zzk = zzajVar;
        this.zzl = str5;
        this.zzm = zzazVar;
        this.zzn = str6;
        this.zzo = bArr2;
        this.zzp = i4;
        this.zzq = i5;
        this.zzr = i6;
        this.zzs = zzahVar;
        this.zzt = zzafVar;
        this.zzu = str7;
        this.zzv = zzanVarArr;
        this.zzw = z;
        this.zzx = list;
        this.zzy = z2;
        this.zzz = z3;
        this.zzA = j;
        this.zzB = j2;
        this.zzC = z4;
        this.zzD = j3;
        this.zzE = str8;
        this.zzF = str9;
        this.zzG = zzeVar;
        this.zzH = i7;
        this.zzI = z5;
        this.zzJ = str10;
        this.zzK = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (Objects.equal(this.zza, cardInfo.zza) && Arrays.equals(this.zzb, cardInfo.zzb) && Objects.equal(this.zzc, cardInfo.zzc) && Objects.equal(this.zzd, cardInfo.zzd) && this.zze == cardInfo.zze && Objects.equal(this.zzf, cardInfo.zzf) && Objects.equal(this.zzg, cardInfo.zzg) && Objects.equal(this.zzh, cardInfo.zzh) && this.zzi == cardInfo.zzi && this.zzj == cardInfo.zzj && Objects.equal(this.zzk, cardInfo.zzk) && Objects.equal(this.zzl, cardInfo.zzl) && Objects.equal(this.zzm, cardInfo.zzm) && this.zzp == cardInfo.zzp && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && Objects.equal(this.zzs, cardInfo.zzs) && Objects.equal(this.zzt, cardInfo.zzt) && Objects.equal(this.zzu, cardInfo.zzu) && Arrays.equals(this.zzv, cardInfo.zzv) && this.zzw == cardInfo.zzw && Objects.equal(this.zzx, cardInfo.zzx) && this.zzy == cardInfo.zzy && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzC == cardInfo.zzC && this.zzD == cardInfo.zzD && Objects.equal(this.zzE, cardInfo.zzE) && Objects.equal(this.zzF, cardInfo.zzF) && Objects.equal(this.zzG, cardInfo.zzG) && this.zzH == cardInfo.zzH && this.zzI == cardInfo.zzI && this.zzK == cardInfo.zzK) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Integer.valueOf(this.zzj), this.zzl, this.zzm, Integer.valueOf(this.zzp), Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv, Boolean.valueOf(this.zzw), this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), Long.valueOf(this.zzA), Boolean.valueOf(this.zzC), Long.valueOf(this.zzD), this.zzE, this.zzF, this.zzG, Integer.valueOf(this.zzH), Boolean.valueOf(this.zzI), Integer.valueOf(this.zzK));
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.zza);
        byte[] bArr = this.zzb;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardholderName", this.zzc).add("displayName", this.zzd).add("cardNetwork", Integer.valueOf(this.zze)).add("tokenStatus", this.zzf).add("panLastDigits", this.zzg).add("cardImageUrl", this.zzh).add("cardColor", Integer.valueOf(this.zzi)).add("overlayTextColor", Integer.valueOf(this.zzj));
        zzaj zzajVar = this.zzk;
        Objects.ToStringHelper toStringHelperAdd3 = toStringHelperAdd2.add("issuerInfo", zzajVar == null ? null : zzajVar.toString()).add("tokenLastDigits", this.zzl).add("transactionInfo", this.zzm).add("issuerTokenId", this.zzn);
        byte[] bArr2 = this.zzo;
        Objects.ToStringHelper toStringHelperAdd4 = toStringHelperAdd3.add("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2)).add("cachedEligibility", Integer.valueOf(this.zzp)).add("paymentProtocol", Integer.valueOf(this.zzq)).add("tokenType", Integer.valueOf(this.zzr)).add("inStoreCvmConfig", this.zzs).add("inAppCvmConfig", this.zzt).add("tokenDisplayName", this.zzu);
        zzan[] zzanVarArr = this.zzv;
        return toStringHelperAdd4.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("allowAidSelection", Boolean.valueOf(this.zzw)).add("badges", "[" + TextUtils.join(", ", this.zzx) + "]").add("upgradeAvailable", Boolean.valueOf(this.zzy)).add("requiresSignature", Boolean.valueOf(this.zzz)).add("googleTokenId", Long.valueOf(this.zzA)).add("isTransit", Boolean.valueOf(this.zzC)).add("googleWalletId", Long.valueOf(this.zzD)).add("devicePaymentMethodId", this.zzE).add("cloudPaymentMethodId", this.zzF).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzo, false);
        SafeParcelWriter.writeInt(parcel, 18, this.zzp);
        SafeParcelWriter.writeInt(parcel, 20, this.zzq);
        SafeParcelWriter.writeInt(parcel, 21, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzs, i, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.zzt, i, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzu, false);
        SafeParcelWriter.writeTypedArray(parcel, 25, this.zzv, i, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzw);
        SafeParcelWriter.writeTypedList(parcel, 27, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzy);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzz);
        SafeParcelWriter.writeLong(parcel, 30, this.zzA);
        SafeParcelWriter.writeLong(parcel, 31, this.zzB);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzC);
        SafeParcelWriter.writeLong(parcel, 33, this.zzD);
        SafeParcelWriter.writeString(parcel, 34, this.zzE, false);
        SafeParcelWriter.writeString(parcel, 35, this.zzF, false);
        SafeParcelWriter.writeParcelable(parcel, 36, this.zzG, i, false);
        SafeParcelWriter.writeInt(parcel, 37, this.zzH);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzI);
        SafeParcelWriter.writeString(parcel, 39, this.zzJ, false);
        SafeParcelWriter.writeInt(parcel, 40, this.zzK);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
