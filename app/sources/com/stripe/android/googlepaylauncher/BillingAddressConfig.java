package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayLauncher.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006\""}, m3636d2 = {"com/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig", "Landroid/os/Parcelable;", "", "isRequired", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "format", "isPhoneNumberRequired", "<init>", "(ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "isRequired$payments_core_release", "()Z", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "getFormat$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired$payments_core_release", "Format", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$BillingAddressConfig, reason: use source file name and from toString */
/* loaded from: classes8.dex */
public final /* data */ class BillingAddressConfig implements Parcelable {
    public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new Creator();
    private final Format format;
    private final boolean isPhoneNumberRequired;
    private final boolean isRequired;

    /* compiled from: GooglePayLauncher.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$BillingAddressConfig$Creator */
    public static final class Creator implements Parcelable.Creator<BillingAddressConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingAddressConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillingAddressConfig(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillingAddressConfig[] newArray(int i) {
            return new BillingAddressConfig[i];
        }
    }

    @JvmOverloads
    public BillingAddressConfig() {
        this(false, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddressConfig)) {
            return false;
        }
        BillingAddressConfig billingAddressConfig = (BillingAddressConfig) other;
        return this.isRequired == billingAddressConfig.isRequired && this.format == billingAddressConfig.format && this.isPhoneNumberRequired == billingAddressConfig.isPhoneNumberRequired;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isRequired) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberRequired);
    }

    public String toString() {
        return "BillingAddressConfig(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeString(this.format.name());
        parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
    }

    @JvmOverloads
    public BillingAddressConfig(boolean z, Format format2, boolean z2) {
        Intrinsics.checkNotNullParameter(format2, "format");
        this.isRequired = z;
        this.format = format2;
        this.isPhoneNumberRequired = z2;
    }

    /* renamed from: isRequired$payments_core_release, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public /* synthetic */ BillingAddressConfig(boolean z, Format format2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Format.Min : format2, (i & 4) != 0 ? false : z2);
    }

    /* renamed from: getFormat$payments_core_release, reason: from getter */
    public final Format getFormat() {
        return this.format;
    }

    /* renamed from: isPhoneNumberRequired$payments_core_release, reason: from getter */
    public final boolean getIsPhoneNumberRequired() {
        return this.isPhoneNumberRequired;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GooglePayLauncher.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$BillingAddressConfig$Format */
    public static final class Format {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Format[] $VALUES;
        private final String code;
        public static final Format Min = new Format("Min", 0, "MIN");
        public static final Format Full = new Format("Full", 1, "FULL");

        private static final /* synthetic */ Format[] $values() {
            return new Format[]{Min, Full};
        }

        public static EnumEntries<Format> getEntries() {
            return $ENTRIES;
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }

        private Format(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Format[] formatArr$values = $values();
            $VALUES = formatArr$values;
            $ENTRIES = EnumEntries2.enumEntries(formatArr$values);
        }
    }
}
