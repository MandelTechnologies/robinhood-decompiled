package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.BillingAddressFields;
import com.stripe.android.view.ShippingInfoWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: PaymentSessionConfig.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0004MNOPBÇ\u0001\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u00106R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\n\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b9\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b;\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\bB\u00106R\u001a\u0010\u0017\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\bC\u00106R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bK\u0010L¨\u0006Q"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionConfig;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "optionalShippingInfoFields", "Lcom/stripe/android/model/ShippingInformation;", "prepopulatedShippingInfo", "", "isShippingInfoRequired", "isShippingMethodRequired", "", "paymentMethodsFooterLayoutId", "addPaymentMethodFooterLayoutId", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodTypes", "shouldShowGooglePay", "", "", "allowedShippingCountryCodes", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "canDeletePaymentMethods", "shouldPrefetchCustomer", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInformationValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "windowFlags", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getHiddenShippingInfoFields", "()Ljava/util/List;", "getOptionalShippingInfoFields", "Lcom/stripe/android/model/ShippingInformation;", "getPrepopulatedShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "Z", "()Z", "I", "getPaymentMethodsFooterLayoutId", "getAddPaymentMethodFooterLayoutId", "getPaymentMethodTypes", "getShouldShowGooglePay", "Ljava/util/Set;", "getAllowedShippingCountryCodes", "()Ljava/util/Set;", "Lcom/stripe/android/view/BillingAddressFields;", "getBillingAddressFields", "()Lcom/stripe/android/view/BillingAddressFields;", "getCanDeletePaymentMethods", "getShouldPrefetchCustomer$payments_core_release", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "getShippingInformationValidator$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "getShippingMethodsFactory$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "()Ljava/lang/Integer;", "Companion", "DefaultShippingInfoValidator", "ShippingInformationValidator", "ShippingMethodsFactory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class PaymentSessionConfig implements Parcelable {
    private final int addPaymentMethodFooterLayoutId;
    private final Set<String> allowedShippingCountryCodes;
    private final BillingAddressFields billingAddressFields;
    private final boolean canDeletePaymentMethods;
    private final List<ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final List<ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
    private final List<PaymentMethod.Type> paymentMethodTypes;
    private final int paymentMethodsFooterLayoutId;
    private final ShippingInformation prepopulatedShippingInfo;
    private final ShippingInformationValidator shippingInformationValidator;
    private final ShippingMethodsFactory shippingMethodsFactory;
    private final boolean shouldPrefetchCustomer;
    private final boolean shouldShowGooglePay;
    private final Integer windowFlags;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentSessionConfig> CREATOR = new Creator();
    private static final BillingAddressFields DEFAULT_BILLING_ADDRESS_FIELDS = BillingAddressFields.PostalCode;

    /* compiled from: PaymentSessionConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSessionConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig createFromParcel(Parcel parcel) {
            boolean z;
            String string2;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(ShippingInfoWidget.CustomizableShippingField.valueOf(parcel.readString()));
            }
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            boolean z3 = true;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = parcel.readInt();
            boolean z5 = z;
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList3.add(PaymentMethod.Type.CREATOR.createFromParcel(parcel));
            }
            boolean z6 = parcel.readInt() != 0 ? z5 : false;
            int i9 = parcel.readInt();
            boolean z7 = z5;
            LinkedHashSet linkedHashSet = new LinkedHashSet(i9);
            int i10 = 0;
            while (true) {
                string2 = parcel.readString();
                if (i10 == i9) {
                    break;
                }
                linkedHashSet.add(string2);
                i10++;
            }
            BillingAddressFields billingAddressFieldsValueOf = BillingAddressFields.valueOf(string2);
            if (parcel.readInt() != 0) {
                z2 = z7;
            } else {
                z2 = z7;
                z7 = false;
            }
            return new PaymentSessionConfig(arrayList, arrayList2, shippingInformationCreateFromParcel, z4, z3, i5, i6, arrayList3, z6, linkedHashSet, billingAddressFieldsValueOf, z7, parcel.readInt() != 0 ? z2 : false, (ShippingInformationValidator) parcel.readSerializable(), (ShippingMethodsFactory) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionConfig[] newArray(int i) {
            return new PaymentSessionConfig[i];
        }
    }

    /* compiled from: PaymentSessionConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Ljava/io/Serializable;", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ShippingInformationValidator extends Serializable {
        String getErrorMessage(ShippingInformation shippingInformation);

        boolean isValid(ShippingInformation shippingInformation);
    }

    /* compiled from: PaymentSessionConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/io/Serializable;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "Lcom/stripe/android/model/ShippingMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ShippingMethodsFactory extends Serializable {
        List<ShippingMethod> create(ShippingInformation shippingInformation);
    }

    public PaymentSessionConfig() {
        this(null, null, null, false, false, 0, 0, null, false, null, null, false, false, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionConfig)) {
            return false;
        }
        PaymentSessionConfig paymentSessionConfig = (PaymentSessionConfig) other;
        return Intrinsics.areEqual(this.hiddenShippingInfoFields, paymentSessionConfig.hiddenShippingInfoFields) && Intrinsics.areEqual(this.optionalShippingInfoFields, paymentSessionConfig.optionalShippingInfoFields) && Intrinsics.areEqual(this.prepopulatedShippingInfo, paymentSessionConfig.prepopulatedShippingInfo) && this.isShippingInfoRequired == paymentSessionConfig.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionConfig.isShippingMethodRequired && this.paymentMethodsFooterLayoutId == paymentSessionConfig.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == paymentSessionConfig.addPaymentMethodFooterLayoutId && Intrinsics.areEqual(this.paymentMethodTypes, paymentSessionConfig.paymentMethodTypes) && this.shouldShowGooglePay == paymentSessionConfig.shouldShowGooglePay && Intrinsics.areEqual(this.allowedShippingCountryCodes, paymentSessionConfig.allowedShippingCountryCodes) && this.billingAddressFields == paymentSessionConfig.billingAddressFields && this.canDeletePaymentMethods == paymentSessionConfig.canDeletePaymentMethods && this.shouldPrefetchCustomer == paymentSessionConfig.shouldPrefetchCustomer && Intrinsics.areEqual(this.shippingInformationValidator, paymentSessionConfig.shippingInformationValidator) && Intrinsics.areEqual(this.shippingMethodsFactory, paymentSessionConfig.shippingMethodsFactory) && Intrinsics.areEqual(this.windowFlags, paymentSessionConfig.windowFlags);
    }

    public int hashCode() {
        int iHashCode = ((this.hiddenShippingInfoFields.hashCode() * 31) + this.optionalShippingInfoFields.hashCode()) * 31;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        int iHashCode2 = (((((((((((((((((((((((iHashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + Boolean.hashCode(this.isShippingInfoRequired)) * 31) + Boolean.hashCode(this.isShippingMethodRequired)) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31) + this.paymentMethodTypes.hashCode()) * 31) + Boolean.hashCode(this.shouldShowGooglePay)) * 31) + this.allowedShippingCountryCodes.hashCode()) * 31) + this.billingAddressFields.hashCode()) * 31) + Boolean.hashCode(this.canDeletePaymentMethods)) * 31) + Boolean.hashCode(this.shouldPrefetchCustomer)) * 31) + this.shippingInformationValidator.hashCode()) * 31;
        ShippingMethodsFactory shippingMethodsFactory = this.shippingMethodsFactory;
        int iHashCode3 = (iHashCode2 + (shippingMethodsFactory == null ? 0 : shippingMethodsFactory.hashCode())) * 31;
        Integer num = this.windowFlags;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.hiddenShippingInfoFields + ", optionalShippingInfoFields=" + this.optionalShippingInfoFields + ", prepopulatedShippingInfo=" + this.prepopulatedShippingInfo + ", isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", paymentMethodsFooterLayoutId=" + this.paymentMethodsFooterLayoutId + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", paymentMethodTypes=" + this.paymentMethodTypes + ", shouldShowGooglePay=" + this.shouldShowGooglePay + ", allowedShippingCountryCodes=" + this.allowedShippingCountryCodes + ", billingAddressFields=" + this.billingAddressFields + ", canDeletePaymentMethods=" + this.canDeletePaymentMethods + ", shouldPrefetchCustomer=" + this.shouldPrefetchCustomer + ", shippingInformationValidator=" + this.shippingInformationValidator + ", shippingMethodsFactory=" + this.shippingMethodsFactory + ", windowFlags=" + this.windowFlags + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        parcel.writeInt(list.size());
        Iterator<ShippingInfoWidget.CustomizableShippingField> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        parcel.writeInt(list2.size());
        Iterator<ShippingInfoWidget.CustomizableShippingField> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeInt(this.paymentMethodsFooterLayoutId);
        parcel.writeInt(this.addPaymentMethodFooterLayoutId);
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        parcel.writeInt(list3.size());
        Iterator<PaymentMethod.Type> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.shouldShowGooglePay ? 1 : 0);
        Set<String> set = this.allowedShippingCountryCodes;
        parcel.writeInt(set.size());
        Iterator<String> it4 = set.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
        parcel.writeString(this.billingAddressFields.name());
        parcel.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        parcel.writeInt(this.shouldPrefetchCustomer ? 1 : 0);
        parcel.writeSerializable(this.shippingInformationValidator);
        parcel.writeSerializable(this.shippingMethodsFactory);
        Integer num = this.windowFlags;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSessionConfig(List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List<? extends PaymentMethod.Type> paymentMethodTypes, boolean z3, Set<String> allowedShippingCountryCodes, BillingAddressFields billingAddressFields, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num) {
        Intrinsics.checkNotNullParameter(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        Intrinsics.checkNotNullParameter(optionalShippingInfoFields, "optionalShippingInfoFields");
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
        Intrinsics.checkNotNullParameter(shippingInformationValidator, "shippingInformationValidator");
        this.hiddenShippingInfoFields = hiddenShippingInfoFields;
        this.optionalShippingInfoFields = optionalShippingInfoFields;
        this.prepopulatedShippingInfo = shippingInformation;
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.paymentMethodsFooterLayoutId = i;
        this.addPaymentMethodFooterLayoutId = i2;
        this.paymentMethodTypes = paymentMethodTypes;
        this.shouldShowGooglePay = z3;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.billingAddressFields = billingAddressFields;
        this.canDeletePaymentMethods = z4;
        this.shouldPrefetchCustomer = z5;
        this.shippingInformationValidator = shippingInformationValidator;
        this.shippingMethodsFactory = shippingMethodsFactory;
        this.windowFlags = num;
        String[] iSOCountries = Locale.getISOCountries();
        for (String str : allowedShippingCountryCodes) {
            Intrinsics.checkNotNull(iSOCountries);
            for (String str2 : iSOCountries) {
                if (StringsKt.equals(str, str2, true)) {
                    break;
                }
            }
            throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
        }
        if (this.isShippingMethodRequired && this.shippingMethodsFactory == null) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.");
        }
    }

    public /* synthetic */ PaymentSessionConfig(List list, List list2, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List list3, boolean z3, Set set, BillingAddressFields billingAddressFields, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator, ShippingMethodsFactory shippingMethodsFactory, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 4) != 0 ? null : shippingInformation, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? CollectionsKt.listOf(PaymentMethod.Type.Card) : list3, (i3 & 256) == 0 ? z3 : false, (i3 & 512) != 0 ? SetsKt.emptySet() : set, (i3 & 1024) != 0 ? DEFAULT_BILLING_ADDRESS_FIELDS : billingAddressFields, (i3 & 2048) != 0 ? true : z4, (i3 & 4096) == 0 ? z5 : true, (i3 & 8192) != 0 ? new DefaultShippingInfoValidator() : shippingInformationValidator, (i3 & 16384) != 0 ? null : shippingMethodsFactory, (i3 & 32768) != 0 ? null : num);
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getHiddenShippingInfoFields() {
        return this.hiddenShippingInfoFields;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getOptionalShippingInfoFields() {
        return this.optionalShippingInfoFields;
    }

    public final ShippingInformation getPrepopulatedShippingInfo() {
        return this.prepopulatedShippingInfo;
    }

    /* renamed from: isShippingInfoRequired, reason: from getter */
    public final boolean getIsShippingInfoRequired() {
        return this.isShippingInfoRequired;
    }

    /* renamed from: isShippingMethodRequired, reason: from getter */
    public final boolean getIsShippingMethodRequired() {
        return this.isShippingMethodRequired;
    }

    public final Set<String> getAllowedShippingCountryCodes() {
        return this.allowedShippingCountryCodes;
    }

    /* renamed from: getShippingInformationValidator$payments_core_release, reason: from getter */
    public final ShippingInformationValidator getShippingInformationValidator() {
        return this.shippingInformationValidator;
    }

    /* renamed from: getShippingMethodsFactory$payments_core_release, reason: from getter */
    public final ShippingMethodsFactory getShippingMethodsFactory() {
        return this.shippingMethodsFactory;
    }

    /* compiled from: PaymentSessionConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionConfig$DefaultShippingInfoValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "()V", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class DefaultShippingInfoValidator implements ShippingInformationValidator {
        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public boolean isValid(ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
            return true;
        }

        @Override // com.stripe.android.PaymentSessionConfig.ShippingInformationValidator
        public String getErrorMessage(ShippingInformation shippingInformation) {
            Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
            return "";
        }
    }

    /* compiled from: PaymentSessionConfig.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/PaymentSessionConfig$Companion;", "", "()V", "DEFAULT_BILLING_ADDRESS_FIELDS", "Lcom/stripe/android/view/BillingAddressFields;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
