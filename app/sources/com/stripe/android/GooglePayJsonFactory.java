package com.stripe.android;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayJsonFactory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0005%&'()B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B1\b\u0011\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J!\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0019JO\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory;", "", "context", "Landroid/content/Context;", "isJcbEnabled", "", "(Landroid/content/Context;Z)V", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;)V", "Lcom/stripe/android/GooglePayConfig;", "(Lcom/stripe/android/GooglePayConfig;Z)V", "createBaseCardPaymentMethodParams", "Lorg/json/JSONObject;", "createCardPaymentMethod", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "allowCreditCards", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createIsReadyToPayRequest", "existingPaymentMethodRequired", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createPaymentDataRequest", "transactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "shippingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "isEmailRequired", "merchantInfo", "Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "(Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "createShippingAddressParameters", "createTransactionInfo", "BillingAddressParameters", "Companion", "MerchantInfo", "ShippingAddressParameters", "TransactionInfo", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GooglePayJsonFactory {
    private final GooglePayConfig googlePayConfig;
    private final boolean isJcbEnabled;
    private static final Companion Companion = new Companion(null);
    private static final List<String> ALLOWED_AUTH_METHODS = CollectionsKt.listOf((Object[]) new String[]{"PAN_ONLY", "CRYPTOGRAM_3DS"});
    private static final List<String> DEFAULT_CARD_NETWORKS = CollectionsKt.listOf((Object[]) new String[]{"AMEX", "DISCOVER", "MASTERCARD", "VISA"});

    public GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z) {
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
        this.googlePayConfig = googlePayConfig;
        this.isJcbEnabled = z;
    }

    public /* synthetic */ GooglePayJsonFactory(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Context context, boolean z) {
        this(new GooglePayConfig(context), z);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, Config googlePayConfig) {
        this(new GooglePayConfig(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke()), googlePayConfig.isJcbEnabled$payments_core_release());
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
    }

    @JvmOverloads
    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean existingPaymentMethodRequired, Boolean allowCreditCards) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, allowCreditCards)));
        if (existingPaymentMethodRequired != null) {
            jSONObjectPut.put("existingPaymentMethodRequired", existingPaymentMethodRequired.booleanValue());
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    public static /* synthetic */ JSONObject createPaymentDataRequest$default(GooglePayJsonFactory googlePayJsonFactory, TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            billingAddressParameters = null;
        }
        if ((i & 4) != 0) {
            shippingAddressParameters = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            merchantInfo = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return googlePayJsonFactory.createPaymentDataRequest(transactionInfo, billingAddressParameters, shippingAddressParameters, z, merchantInfo, bool);
    }

    @JvmOverloads
    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean isEmailRequired, MerchantInfo merchantInfo, Boolean allowCreditCards) throws JSONException {
        String merchantName;
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, allowCreditCards))).put("transactionInfo", createTransactionInfo(transactionInfo)).put("emailRequired", isEmailRequired);
        if (shippingAddressParameters != null && shippingAddressParameters.getIsRequired()) {
            jSONObjectPut.put("shippingAddressRequired", true);
            jSONObjectPut.put("shippingAddressParameters", createShippingAddressParameters(shippingAddressParameters));
        }
        if (merchantInfo != null && (merchantName = merchantInfo.getMerchantName()) != null && merchantName.length() != 0) {
            jSONObjectPut.put("merchantInfo", new JSONObject().put("merchantName", merchantInfo.getMerchantName()));
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    private final JSONObject createTransactionInfo(TransactionInfo transactionInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String currencyCode = transactionInfo.getCurrencyCode();
        Locale locale = Locale.ROOT;
        String upperCase = currencyCode.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        JSONObject jSONObjectPut = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", transactionInfo.getTotalPriceStatus().getCode());
        String countryCode = transactionInfo.getCountryCode();
        if (countryCode != null) {
            String upperCase2 = countryCode.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            jSONObjectPut.put("countryCode", upperCase2);
        }
        String transactionId = transactionInfo.getTransactionId();
        if (transactionId != null) {
            jSONObjectPut.put("transactionId", transactionId);
        }
        Long totalPrice = transactionInfo.getTotalPrice();
        if (totalPrice != null) {
            long jLongValue = totalPrice.longValue();
            String upperCase3 = transactionInfo.getCurrencyCode().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            jSONObjectPut.put("totalPrice", PayWithGoogleUtils.getPriceString(jLongValue, currency));
        }
        String totalPriceLabel = transactionInfo.getTotalPriceLabel();
        if (totalPriceLabel != null) {
            jSONObjectPut.put("totalPriceLabel", totalPriceLabel);
        }
        TransactionInfo.CheckoutOption checkoutOption = transactionInfo.getCheckoutOption();
        if (checkoutOption != null) {
            jSONObjectPut.put("checkoutOption", checkoutOption.getCode());
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    private final JSONObject createShippingAddressParameters(ShippingAddressParameters shippingAddressParameters) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection<?>) shippingAddressParameters.getNormalizedAllowedCountryCodes$payments_core_release())).put("phoneNumberRequired", shippingAddressParameters.getPhoneNumberRequired());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final JSONObject createCardPaymentMethod(BillingAddressParameters billingAddressParameters, Boolean allowCreditCards) throws JSONException {
        JSONObject jSONObjectCreateBaseCardPaymentMethodParams = createBaseCardPaymentMethodParams();
        if (billingAddressParameters != null && billingAddressParameters.getIsRequired()) {
            jSONObjectCreateBaseCardPaymentMethodParams.put("billingAddressRequired", true);
            jSONObjectCreateBaseCardPaymentMethodParams.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", billingAddressParameters.getIsPhoneNumberRequired()).put("format", billingAddressParameters.getFormat().getCode()));
        }
        if (allowCreditCards != null) {
            jSONObjectCreateBaseCardPaymentMethodParams.put("allowCreditCards", allowCreditCards.booleanValue());
        }
        JSONObject jSONObjectPut = new JSONObject().put("type", "CARD").put("parameters", jSONObjectCreateBaseCardPaymentMethodParams).put("tokenizationSpecification", this.googlePayConfig.getTokenizationSpecification());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final JSONObject createBaseCardPaymentMethodParams() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection<?>) ALLOWED_AUTH_METHODS));
        List<String> list = DEFAULT_CARD_NETWORKS;
        List listListOf = CollectionsKt.listOf("JCB");
        if (!this.isJcbEnabled) {
            listListOf = null;
        }
        if (listListOf == null) {
            listListOf = CollectionsKt.emptyList();
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("allowedCardNetworks", new JSONArray((Collection<?>) CollectionsKt.plus((Collection) list, (Iterable) listListOf)));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "put(...)");
        return jSONObjectPut2;
    }

    /* compiled from: GooglePayJsonFactory.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Landroid/os/Parcelable;", "", "isRequired", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "format", "isPhoneNumberRequired", "<init>", "(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "isRequired$payments_core_release", "()Z", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "getFormat$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "isPhoneNumberRequired$payments_core_release", "Format", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BillingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new Creator();
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;

        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddressParameters(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressParameters[] newArray(int i) {
                return new BillingAddressParameters[i];
            }
        }

        @JvmOverloads
        public BillingAddressParameters() {
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
            if (!(other instanceof BillingAddressParameters)) {
                return false;
            }
            BillingAddressParameters billingAddressParameters = (BillingAddressParameters) other;
            return this.isRequired == billingAddressParameters.isRequired && this.format == billingAddressParameters.format && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberRequired);
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeString(this.format.name());
            parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        @JvmOverloads
        public BillingAddressParameters(boolean z, Format format2, boolean z2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            this.isRequired = z;
            this.format = format2;
            this.isPhoneNumberRequired = z2;
        }

        /* renamed from: isRequired$payments_core_release, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public /* synthetic */ BillingAddressParameters(boolean z, Format format2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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

    /* compiled from: GooglePayJsonFactory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b&\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b*\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "Landroid/os/Parcelable;", "", "currencyCode", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "totalPriceStatus", "countryCode", "transactionId", "", "totalPrice", "totalPriceLabel", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "checkoutOption", "<init>", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCurrencyCode$payments_core_release", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "getTotalPriceStatus$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "getCountryCode$payments_core_release", "getTransactionId$payments_core_release", "Ljava/lang/Long;", "getTotalPrice$payments_core_release", "()Ljava/lang/Long;", "getTotalPriceLabel$payments_core_release", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "getCheckoutOption$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "CheckoutOption", "TotalPriceStatus", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class TransactionInfo implements Parcelable {
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new Creator();
        private final CheckoutOption checkoutOption;
        private final String countryCode;
        private final String currencyCode;
        private final Long totalPrice;
        private final String totalPriceLabel;
        private final TotalPriceStatus totalPriceStatus;
        private final String transactionId;

        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionInfo(parcel.readString(), TotalPriceStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? CheckoutOption.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionInfo[] newArray(int i) {
                return new TransactionInfo[i];
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
            if (!(other instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) other;
            return Intrinsics.areEqual(this.currencyCode, transactionInfo.currencyCode) && this.totalPriceStatus == transactionInfo.totalPriceStatus && Intrinsics.areEqual(this.countryCode, transactionInfo.countryCode) && Intrinsics.areEqual(this.transactionId, transactionInfo.transactionId) && Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && Intrinsics.areEqual(this.totalPriceLabel, transactionInfo.totalPriceLabel) && this.checkoutOption == transactionInfo.checkoutOption;
        }

        public int hashCode() {
            int iHashCode = ((this.currencyCode.hashCode() * 31) + this.totalPriceStatus.hashCode()) * 31;
            String str = this.countryCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.totalPrice;
            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.totalPriceLabel;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CheckoutOption checkoutOption = this.checkoutOption;
            return iHashCode5 + (checkoutOption != null ? checkoutOption.hashCode() : 0);
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.currencyCode + ", totalPriceStatus=" + this.totalPriceStatus + ", countryCode=" + this.countryCode + ", transactionId=" + this.transactionId + ", totalPrice=" + this.totalPrice + ", totalPriceLabel=" + this.totalPriceLabel + ", checkoutOption=" + this.checkoutOption + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.currencyCode);
            parcel.writeString(this.totalPriceStatus.name());
            parcel.writeString(this.countryCode);
            parcel.writeString(this.transactionId);
            Long l = this.totalPrice;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.totalPriceLabel);
            CheckoutOption checkoutOption = this.checkoutOption;
            if (checkoutOption == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(checkoutOption.name());
            }
        }

        public TransactionInfo(String currencyCode, TotalPriceStatus totalPriceStatus, String str, String str2, Long l, String str3, CheckoutOption checkoutOption) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(totalPriceStatus, "totalPriceStatus");
            this.currencyCode = currencyCode;
            this.totalPriceStatus = totalPriceStatus;
            this.countryCode = str;
            this.transactionId = str2;
            this.totalPrice = l;
            this.totalPriceLabel = str3;
            this.checkoutOption = checkoutOption;
        }

        /* renamed from: getCurrencyCode$payments_core_release, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: getTotalPriceStatus$payments_core_release, reason: from getter */
        public final TotalPriceStatus getTotalPriceStatus() {
            return this.totalPriceStatus;
        }

        /* renamed from: getCountryCode$payments_core_release, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: getTransactionId$payments_core_release, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: getTotalPrice$payments_core_release, reason: from getter */
        public final Long getTotalPrice() {
            return this.totalPrice;
        }

        /* renamed from: getTotalPriceLabel$payments_core_release, reason: from getter */
        public final String getTotalPriceLabel() {
            return this.totalPriceLabel;
        }

        /* renamed from: getCheckoutOption$payments_core_release, reason: from getter */
        public final CheckoutOption getCheckoutOption() {
            return this.checkoutOption;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "NotCurrentlyKnown", "Estimated", "Final", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class TotalPriceStatus {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TotalPriceStatus[] $VALUES;
            private final String code;
            public static final TotalPriceStatus NotCurrentlyKnown = new TotalPriceStatus("NotCurrentlyKnown", 0, "NOT_CURRENTLY_KNOWN");
            public static final TotalPriceStatus Estimated = new TotalPriceStatus("Estimated", 1, "ESTIMATED");
            public static final TotalPriceStatus Final = new TotalPriceStatus("Final", 2, "FINAL");

            private static final /* synthetic */ TotalPriceStatus[] $values() {
                return new TotalPriceStatus[]{NotCurrentlyKnown, Estimated, Final};
            }

            public static EnumEntries<TotalPriceStatus> getEntries() {
                return $ENTRIES;
            }

            public static TotalPriceStatus valueOf(String str) {
                return (TotalPriceStatus) Enum.valueOf(TotalPriceStatus.class, str);
            }

            public static TotalPriceStatus[] values() {
                return (TotalPriceStatus[]) $VALUES.clone();
            }

            private TotalPriceStatus(String str, int i, String str2) {
                this.code = str2;
            }

            /* renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            static {
                TotalPriceStatus[] totalPriceStatusArr$values = $values();
                $VALUES = totalPriceStatusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(totalPriceStatusArr$values);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Default", "CompleteImmediatePurchase", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class CheckoutOption {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CheckoutOption[] $VALUES;
            private final String code;
            public static final CheckoutOption Default = new CheckoutOption("Default", 0, "DEFAULT");
            public static final CheckoutOption CompleteImmediatePurchase = new CheckoutOption("CompleteImmediatePurchase", 1, "COMPLETE_IMMEDIATE_PURCHASE");

            private static final /* synthetic */ CheckoutOption[] $values() {
                return new CheckoutOption[]{Default, CompleteImmediatePurchase};
            }

            public static EnumEntries<CheckoutOption> getEntries() {
                return $ENTRIES;
            }

            public static CheckoutOption valueOf(String str) {
                return (CheckoutOption) Enum.valueOf(CheckoutOption.class, str);
            }

            public static CheckoutOption[] values() {
                return (CheckoutOption[]) $VALUES.clone();
            }

            private CheckoutOption(String str, int i, String str2) {
                this.code = str2;
            }

            /* renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            static {
                CheckoutOption[] checkoutOptionArr$values = $values();
                $VALUES = checkoutOptionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(checkoutOptionArr$values);
            }
        }
    }

    /* compiled from: GooglePayJsonFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "Landroid/os/Parcelable;", "", "isRequired", "", "", "allowedCountryCodes", "phoneNumberRequired", "<init>", "(ZLjava/util/Set;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "isRequired$payments_core_release", "()Z", "Ljava/util/Set;", "getPhoneNumberRequired$payments_core_release", "getNormalizedAllowedCountryCodes$payments_core_release", "()Ljava/util/Set;", "normalizedAllowedCountryCodes", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ShippingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new Creator();
        private final Set<String> allowedCountryCodes;
        private final boolean isRequired;
        private final boolean phoneNumberRequired;

        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ShippingAddressParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new ShippingAddressParameters(z, linkedHashSet, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingAddressParameters[] newArray(int i) {
                return new ShippingAddressParameters[i];
            }
        }

        @JvmOverloads
        public ShippingAddressParameters() {
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
            if (!(other instanceof ShippingAddressParameters)) {
                return false;
            }
            ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) other;
            return this.isRequired == shippingAddressParameters.isRequired && Intrinsics.areEqual(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.phoneNumberRequired == shippingAddressParameters.phoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.allowedCountryCodes.hashCode()) * 31) + Boolean.hashCode(this.phoneNumberRequired);
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.isRequired + ", allowedCountryCodes=" + this.allowedCountryCodes + ", phoneNumberRequired=" + this.phoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
            Set<String> set = this.allowedCountryCodes;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            parcel.writeInt(this.phoneNumberRequired ? 1 : 0);
        }

        @JvmOverloads
        public ShippingAddressParameters(boolean z, Set<String> allowedCountryCodes, boolean z2) {
            Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
            this.isRequired = z;
            this.allowedCountryCodes = allowedCountryCodes;
            this.phoneNumberRequired = z2;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : getNormalizedAllowedCountryCodes$payments_core_release()) {
                Intrinsics.checkNotNull(iSOCountries);
                for (String str2 : iSOCountries) {
                    if (Intrinsics.areEqual(str, str2)) {
                        break;
                    }
                }
                throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
            }
        }

        /* renamed from: isRequired$payments_core_release, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public /* synthetic */ ShippingAddressParameters(boolean z, Set set, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? SetsKt.emptySet() : set, (i & 4) != 0 ? false : z2);
        }

        /* renamed from: getPhoneNumberRequired$payments_core_release, reason: from getter */
        public final boolean getPhoneNumberRequired() {
            return this.phoneNumberRequired;
        }

        public final Set<String> getNormalizedAllowedCountryCodes$payments_core_release() {
            Set<String> set = this.allowedCountryCodes;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            return CollectionsKt.toSet(arrayList);
        }
    }

    /* compiled from: GooglePayJsonFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "Landroid/os/Parcelable;", "", "merchantName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMerchantName$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class MerchantInfo implements Parcelable {
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        private final String merchantName;

        /* compiled from: GooglePayJsonFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MerchantInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo[] newArray(int i) {
                return new MerchantInfo[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MerchantInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MerchantInfo) && Intrinsics.areEqual(this.merchantName, ((MerchantInfo) other).merchantName);
        }

        public int hashCode() {
            String str = this.merchantName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.merchantName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.merchantName);
        }

        public MerchantInfo(String str) {
            this.merchantName = str;
        }

        public /* synthetic */ MerchantInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        /* renamed from: getMerchantName$payments_core_release, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }
    }

    /* compiled from: GooglePayJsonFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/GooglePayJsonFactory$Companion;", "", "()V", "ALLOWED_AUTH_METHODS", "", "", "ALLOWED_PAYMENT_METHODS", "API_VERSION", "", "API_VERSION_MINOR", "CARD_PAYMENT_METHOD", "DEFAULT_CARD_NETWORKS", "JCB_CARD_NETWORK", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
