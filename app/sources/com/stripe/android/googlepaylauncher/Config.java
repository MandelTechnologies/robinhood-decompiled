package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GooglePayLauncher.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010%\u001a\u0004\b\b\u0010&\"\u0004\b'\u0010(R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u0014\u00103\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010&¨\u00064"}, m3636d2 = {"com/stripe/android/googlepaylauncher/GooglePayLauncher$Config", "Landroid/os/Parcelable;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "environment", "", "merchantCountryCode", "merchantName", "", "isEmailRequired", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "billingAddressConfig", "existingPaymentMethodRequired", "allowCreditCards", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Ljava/lang/String;", "getMerchantCountryCode", "getMerchantName", "Z", "()Z", "setEmailRequired", "(Z)V", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "getBillingAddressConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;)V", "getExistingPaymentMethodRequired", "setExistingPaymentMethodRequired", "getAllowCreditCards", "setAllowCreditCards", "isJcbEnabled$payments_core_release", "isJcbEnabled", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$Config, reason: use source file name and from toString */
/* loaded from: classes8.dex */
public final /* data */ class Config implements Parcelable {
    public static final Parcelable.Creator<Config> CREATOR = new Creator();
    private boolean allowCreditCards;
    private BillingAddressConfig billingAddressConfig;
    private final GooglePayEnvironment environment;
    private boolean existingPaymentMethodRequired;
    private boolean isEmailRequired;
    private final String merchantCountryCode;
    private final String merchantName;

    /* compiled from: GooglePayLauncher.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncher$Config$Creator */
    public static final class Creator implements Parcelable.Creator<Config> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Config createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            BillingAddressConfig billingAddressConfig;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            GooglePayEnvironment googlePayEnvironmentValueOf = GooglePayEnvironment.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            BillingAddressConfig billingAddressConfigCreateFromParcel = BillingAddressConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z2 = true;
                billingAddressConfig = billingAddressConfigCreateFromParcel;
                z3 = true;
            } else {
                z2 = true;
                billingAddressConfig = billingAddressConfigCreateFromParcel;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new Config(googlePayEnvironmentValueOf, string2, string3, z4, billingAddressConfig, z3, z2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Config[] newArray(int i) {
            return new Config[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return this.environment == config.environment && Intrinsics.areEqual(this.merchantCountryCode, config.merchantCountryCode) && Intrinsics.areEqual(this.merchantName, config.merchantName) && this.isEmailRequired == config.isEmailRequired && Intrinsics.areEqual(this.billingAddressConfig, config.billingAddressConfig) && this.existingPaymentMethodRequired == config.existingPaymentMethodRequired && this.allowCreditCards == config.allowCreditCards;
    }

    public int hashCode() {
        return (((((((((((this.environment.hashCode() * 31) + this.merchantCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + Boolean.hashCode(this.isEmailRequired)) * 31) + this.billingAddressConfig.hashCode()) * 31) + Boolean.hashCode(this.existingPaymentMethodRequired)) * 31) + Boolean.hashCode(this.allowCreditCards);
    }

    public String toString() {
        return "Config(environment=" + this.environment + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantName=" + this.merchantName + ", isEmailRequired=" + this.isEmailRequired + ", billingAddressConfig=" + this.billingAddressConfig + ", existingPaymentMethodRequired=" + this.existingPaymentMethodRequired + ", allowCreditCards=" + this.allowCreditCards + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.environment.name());
        parcel.writeString(this.merchantCountryCode);
        parcel.writeString(this.merchantName);
        parcel.writeInt(this.isEmailRequired ? 1 : 0);
        this.billingAddressConfig.writeToParcel(parcel, flags);
        parcel.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
        parcel.writeInt(this.allowCreditCards ? 1 : 0);
    }

    @JvmOverloads
    public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
        this.environment = environment;
        this.merchantCountryCode = merchantCountryCode;
        this.merchantName = merchantName;
        this.isEmailRequired = z;
        this.billingAddressConfig = billingAddressConfig;
        this.existingPaymentMethodRequired = z2;
        this.allowCreditCards = z3;
    }

    public final GooglePayEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: isEmailRequired, reason: from getter */
    public final boolean getIsEmailRequired() {
        return this.isEmailRequired;
    }

    public final BillingAddressConfig getBillingAddressConfig() {
        return this.billingAddressConfig;
    }

    public final boolean getExistingPaymentMethodRequired() {
        return this.existingPaymentMethodRequired;
    }

    public final boolean getAllowCreditCards() {
        return this.allowCreditCards;
    }

    public final boolean isJcbEnabled$payments_core_release() {
        return StringsKt.equals(this.merchantCountryCode, Locale.JAPAN.getCountry(), true);
    }
}
