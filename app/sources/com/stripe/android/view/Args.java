package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethodActivityStarter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BI\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"com/stripe/android/view/AddPaymentMethodActivityStarter$Args", "", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "", "shouldAttachToCustomer", "isPaymentSessionActive", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration", "", "addPaymentMethodFooterLayoutId", "windowFlags", "<init>", "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/view/BillingAddressFields;", "getBillingAddressFields$payments_core_release", "()Lcom/stripe/android/view/BillingAddressFields;", "Z", "getShouldAttachToCustomer$payments_core_release", "()Z", "isPaymentSessionActive$payments_core_release", "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/PaymentConfiguration;", "getPaymentConfiguration$payments_core_release", "()Lcom/stripe/android/PaymentConfiguration;", "I", "getAddPaymentMethodFooterLayoutId$payments_core_release", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "Companion", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.AddPaymentMethodActivityStarter$Args, reason: use source file name and from toString */
/* loaded from: classes26.dex */
public final /* data */ class Args implements Parcelable {
    private final int addPaymentMethodFooterLayoutId;
    private final BillingAddressFields billingAddressFields;
    private final boolean isPaymentSessionActive;
    private final PaymentConfiguration paymentConfiguration;
    private final PaymentMethod.Type paymentMethodType;
    private final boolean shouldAttachToCustomer;
    private final Integer windowFlags;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Args> CREATOR = new Creator();

    /* compiled from: AddPaymentMethodActivityStarter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.AddPaymentMethodActivityStarter$Args$Creator */
    public static final class Creator implements Parcelable.Creator<Args> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Args createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BillingAddressFields billingAddressFieldsValueOf = BillingAddressFields.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Args(billingAddressFieldsValueOf, z2, parcel.readInt() == 0 ? z : true, PaymentMethod.Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Args[] newArray(int i) {
            return new Args[i];
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
        if (!(other instanceof Args)) {
            return false;
        }
        Args args = (Args) other;
        return this.billingAddressFields == args.billingAddressFields && this.shouldAttachToCustomer == args.shouldAttachToCustomer && this.isPaymentSessionActive == args.isPaymentSessionActive && this.paymentMethodType == args.paymentMethodType && Intrinsics.areEqual(this.paymentConfiguration, args.paymentConfiguration) && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && Intrinsics.areEqual(this.windowFlags, args.windowFlags);
    }

    public int hashCode() {
        int iHashCode = ((((((this.billingAddressFields.hashCode() * 31) + Boolean.hashCode(this.shouldAttachToCustomer)) * 31) + Boolean.hashCode(this.isPaymentSessionActive)) * 31) + this.paymentMethodType.hashCode()) * 31;
        PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
        int iHashCode2 = (((iHashCode + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31;
        Integer num = this.windowFlags;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Args(billingAddressFields=" + this.billingAddressFields + ", shouldAttachToCustomer=" + this.shouldAttachToCustomer + ", isPaymentSessionActive=" + this.isPaymentSessionActive + ", paymentMethodType=" + this.paymentMethodType + ", paymentConfiguration=" + this.paymentConfiguration + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", windowFlags=" + this.windowFlags + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.billingAddressFields.name());
        parcel.writeInt(this.shouldAttachToCustomer ? 1 : 0);
        parcel.writeInt(this.isPaymentSessionActive ? 1 : 0);
        this.paymentMethodType.writeToParcel(parcel, flags);
        PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
        if (paymentConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.addPaymentMethodFooterLayoutId);
        Integer num = this.windowFlags;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public Args(BillingAddressFields billingAddressFields, boolean z, boolean z2, PaymentMethod.Type paymentMethodType, PaymentConfiguration paymentConfiguration, int i, Integer num) {
        Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        this.billingAddressFields = billingAddressFields;
        this.shouldAttachToCustomer = z;
        this.isPaymentSessionActive = z2;
        this.paymentMethodType = paymentMethodType;
        this.paymentConfiguration = paymentConfiguration;
        this.addPaymentMethodFooterLayoutId = i;
        this.windowFlags = num;
    }

    /* renamed from: getBillingAddressFields$payments_core_release, reason: from getter */
    public final BillingAddressFields getBillingAddressFields() {
        return this.billingAddressFields;
    }

    /* renamed from: getShouldAttachToCustomer$payments_core_release, reason: from getter */
    public final boolean getShouldAttachToCustomer() {
        return this.shouldAttachToCustomer;
    }

    /* renamed from: isPaymentSessionActive$payments_core_release, reason: from getter */
    public final boolean getIsPaymentSessionActive() {
        return this.isPaymentSessionActive;
    }

    /* renamed from: getPaymentMethodType$payments_core_release, reason: from getter */
    public final PaymentMethod.Type getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: getPaymentConfiguration$payments_core_release, reason: from getter */
    public final PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    /* renamed from: getAddPaymentMethodFooterLayoutId$payments_core_release, reason: from getter */
    public final int getAddPaymentMethodFooterLayoutId() {
        return this.addPaymentMethodFooterLayoutId;
    }

    /* renamed from: getWindowFlags$payments_core_release, reason: from getter */
    public final Integer getWindowFlags() {
        return this.windowFlags;
    }

    /* compiled from: AddPaymentMethodActivityStarter.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0015J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "", "()V", "addPaymentMethodFooterLayoutId", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "isPaymentSessionActive", "", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "shouldAttachToCustomer", "windowFlags", "Ljava/lang/Integer;", "build", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "setAddPaymentMethodFooter", "setBillingAddressFields", "setIsPaymentSessionActive", "setIsPaymentSessionActive$payments_core_release", "setPaymentConfiguration", "setPaymentMethodType", "setShouldAttachToCustomer", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.AddPaymentMethodActivityStarter$Args$Builder */
    public static final class Builder {
        private int addPaymentMethodFooterLayoutId;
        private boolean isPaymentSessionActive;
        private PaymentConfiguration paymentConfiguration;
        private boolean shouldAttachToCustomer;
        private Integer windowFlags;
        private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
        private PaymentMethod.Type paymentMethodType = PaymentMethod.Type.Card;

        public final Builder setShouldAttachToCustomer(boolean shouldAttachToCustomer) {
            this.shouldAttachToCustomer = shouldAttachToCustomer;
            return this;
        }

        public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields) {
            Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
            this.billingAddressFields = billingAddressFields;
            return this;
        }

        public final Builder setPaymentMethodType(PaymentMethod.Type paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public final Builder setAddPaymentMethodFooter(int addPaymentMethodFooterLayoutId) {
            this.addPaymentMethodFooterLayoutId = addPaymentMethodFooterLayoutId;
            return this;
        }

        public final Builder setWindowFlags(Integer windowFlags) {
            this.windowFlags = windowFlags;
            return this;
        }

        public final /* synthetic */ Builder setIsPaymentSessionActive$payments_core_release(boolean isPaymentSessionActive) {
            this.isPaymentSessionActive = isPaymentSessionActive;
            return this;
        }

        public final /* synthetic */ Builder setPaymentConfiguration(PaymentConfiguration paymentConfiguration) {
            this.paymentConfiguration = paymentConfiguration;
            return this;
        }

        public final Args build() {
            BillingAddressFields billingAddressFields = this.billingAddressFields;
            boolean z = this.shouldAttachToCustomer;
            boolean z2 = this.isPaymentSessionActive;
            PaymentMethod.Type type2 = this.paymentMethodType;
            if (type2 == null) {
                type2 = PaymentMethod.Type.Card;
            }
            return new Args(billingAddressFields, z, z2, type2, this.paymentConfiguration, this.addPaymentMethodFooterLayoutId, this.windowFlags);
        }
    }

    /* compiled from: AddPaymentMethodActivityStarter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.AddPaymentMethodActivityStarter$Args$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ Args create$payments_core_release(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (Args) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
