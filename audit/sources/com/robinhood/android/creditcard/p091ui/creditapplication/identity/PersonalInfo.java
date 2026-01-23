package com.robinhood.android.creditcard.p091ui.creditapplication.identity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentityViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "email", "e164", "dateOfBirth", "ssnLast4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getEmail", "getE164", "getDateOfBirth", "getSsnLast4", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PersonalInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PersonalInfo> CREATOR = new Creator();
    private final String dateOfBirth;
    private final String e164;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String ssnLast4;

    /* compiled from: IdentityViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PersonalInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfo[] newArray(int i) {
            return new PersonalInfo[i];
        }
    }

    public PersonalInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PersonalInfo copy$default(PersonalInfo personalInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalInfo.firstName;
        }
        if ((i & 2) != 0) {
            str2 = personalInfo.lastName;
        }
        if ((i & 4) != 0) {
            str3 = personalInfo.email;
        }
        if ((i & 8) != 0) {
            str4 = personalInfo.e164;
        }
        if ((i & 16) != 0) {
            str5 = personalInfo.dateOfBirth;
        }
        if ((i & 32) != 0) {
            str6 = personalInfo.ssnLast4;
        }
        String str7 = str5;
        String str8 = str6;
        return personalInfo.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getE164() {
        return this.e164;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    public final PersonalInfo copy(String firstName, String lastName, String email, String e164, String dateOfBirth, String ssnLast4) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(e164, "e164");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(ssnLast4, "ssnLast4");
        return new PersonalInfo(firstName, lastName, email, e164, dateOfBirth, ssnLast4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalInfo)) {
            return false;
        }
        PersonalInfo personalInfo = (PersonalInfo) other;
        return Intrinsics.areEqual(this.firstName, personalInfo.firstName) && Intrinsics.areEqual(this.lastName, personalInfo.lastName) && Intrinsics.areEqual(this.email, personalInfo.email) && Intrinsics.areEqual(this.e164, personalInfo.e164) && Intrinsics.areEqual(this.dateOfBirth, personalInfo.dateOfBirth) && Intrinsics.areEqual(this.ssnLast4, personalInfo.ssnLast4);
    }

    public int hashCode() {
        return (((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.e164.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.ssnLast4.hashCode();
    }

    public String toString() {
        return "PersonalInfo(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", e164=" + this.e164 + ", dateOfBirth=" + this.dateOfBirth + ", ssnLast4=" + this.ssnLast4 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.email);
        dest.writeString(this.e164);
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.ssnLast4);
    }

    public PersonalInfo(String firstName, String lastName, String email, String e164, String dateOfBirth, String ssnLast4) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(e164, "e164");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(ssnLast4, "ssnLast4");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.e164 = e164;
        this.dateOfBirth = dateOfBirth;
        this.ssnLast4 = ssnLast4;
    }

    public /* synthetic */ PersonalInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getE164() {
        return this.e164;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getSsnLast4() {
        return this.ssnLast4;
    }
}
