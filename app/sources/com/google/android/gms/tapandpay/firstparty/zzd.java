package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        TokenStatus tokenStatus = null;
        String strCreateString4 = null;
        Uri uri = null;
        zzaj zzajVar = null;
        String strCreateString5 = null;
        zzaz zzazVar = null;
        String strCreateString6 = null;
        byte[] bArrCreateByteArray2 = null;
        zzah zzahVar = null;
        zzaf zzafVar = null;
        String strCreateString7 = null;
        zzan[] zzanVarArr = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        zze zzeVar = null;
        String strCreateString10 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, header, TokenStatus.CREATOR);
                    break;
                case 8:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 10:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 11:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    zzajVar = (zzaj) SafeParcelReader.createParcelable(parcel, header, zzaj.CREATOR);
                    break;
                case 13:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 15:
                    zzazVar = (zzaz) SafeParcelReader.createParcelable(parcel, header, zzaz.CREATOR);
                    break;
                case 16:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 22:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
                    break;
                case 23:
                    zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header, zzaf.CREATOR);
                    break;
                case 24:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, header, zzan.CREATOR);
                    break;
                case 26:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzb.CREATOR);
                    break;
                case 28:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 31:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 32:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 34:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 35:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, header, zze.CREATOR);
                    break;
                case 37:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 38:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardInfo(strCreateString, bArrCreateByteArray, strCreateString2, strCreateString3, i, tokenStatus, strCreateString4, uri, i2, i3, zzajVar, strCreateString5, zzazVar, strCreateString6, bArrCreateByteArray2, i4, i5, i6, zzahVar, zzafVar, strCreateString7, zzanVarArr, z, arrayListCreateTypedList, z2, z3, j, j2, z4, j3, strCreateString8, strCreateString9, zzeVar, i7, z5, strCreateString10, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
