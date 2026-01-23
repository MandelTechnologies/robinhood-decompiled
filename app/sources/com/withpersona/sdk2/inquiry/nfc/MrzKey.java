package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportNfcReaderConfig.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "Landroid/os/Parcelable;", "", "passportNumber", "Ljava/util/Date;", "expirationDate", "dateOfBirth", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPassportNumber", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "getDateOfBirth", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class MrzKey implements Parcelable {
    public static final Parcelable.Creator<MrzKey> CREATOR = new Creator();
    private final Date dateOfBirth;
    private final Date expirationDate;
    private final String passportNumber;

    /* compiled from: PassportNfcReaderConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MrzKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MrzKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MrzKey(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MrzKey[] newArray(int i) {
            return new MrzKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzKey)) {
            return false;
        }
        MrzKey mrzKey = (MrzKey) other;
        return Intrinsics.areEqual(this.passportNumber, mrzKey.passportNumber) && Intrinsics.areEqual(this.expirationDate, mrzKey.expirationDate) && Intrinsics.areEqual(this.dateOfBirth, mrzKey.dateOfBirth);
    }

    public int hashCode() {
        return (((this.passportNumber.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.dateOfBirth.hashCode();
    }

    public String toString() {
        return "MrzKey(passportNumber=" + this.passportNumber + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.passportNumber);
        dest.writeSerializable(this.expirationDate);
        dest.writeSerializable(this.dateOfBirth);
    }

    public MrzKey(String passportNumber, Date expirationDate, Date dateOfBirth) {
        Intrinsics.checkNotNullParameter(passportNumber, "passportNumber");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        this.passportNumber = passportNumber;
        this.expirationDate = expirationDate;
        this.dateOfBirth = dateOfBirth;
    }
}
