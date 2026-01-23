package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.model.MandateDataParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConfirmSetupIntentParams.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001<BW\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b \u0010\u001cJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010/R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0015R\"\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0015¨\u0006="}, m3636d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "clientSecret", "paymentMethodId", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "returnUrl", "", "useStripeSdk", "mandateId", "Lcom/stripe/android/model/MandateDataParams;", "mandateData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)V", "shouldUseStripeSdk", "withShouldUseStripeSdk", "(Z)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "", "", "toParamMap", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientSecret", "getPaymentMethodId$payments_core_release", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "Z", "getMandateId", "setMandateId", "Lcom/stripe/android/model/MandateDataParams;", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "getPaymentMethodParamMap", "paymentMethodParamMap", "getMandateDataParams", "mandateDataParams", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmSetupIntentParams implements ConfirmStripeIntentParams {
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private String returnUrl;
    private final boolean useStripeSdk;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Creator();

    /* compiled from: ConfirmSetupIntentParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfirmSetupIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? MandateDataParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams[] newArray(int i) {
            return new ConfirmSetupIntentParams[i];
        }
    }

    public static /* synthetic */ ConfirmSetupIntentParams copy$default(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmSetupIntentParams.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        if ((i & 4) != 0) {
            paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        if ((i & 8) != 0) {
            str3 = confirmSetupIntentParams.returnUrl;
        }
        if ((i & 16) != 0) {
            z = confirmSetupIntentParams.useStripeSdk;
        }
        if ((i & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        if ((i & 64) != 0) {
            mandateDataParams = confirmSetupIntentParams.mandateData;
        }
        String str5 = str4;
        MandateDataParams mandateDataParams2 = mandateDataParams;
        boolean z2 = z;
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        return confirmSetupIntentParams.copy(str, str2, paymentMethodCreateParams2, str3, z2, str5, mandateDataParams2);
    }

    public final ConfirmSetupIntentParams copy(String clientSecret, String paymentMethodId, PaymentMethodCreateParams paymentMethodCreateParams, String returnUrl, boolean useStripeSdk, String mandateId, MandateDataParams mandateData) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, paymentMethodCreateParams, returnUrl, useStripeSdk, mandateId, mandateData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmSetupIntentParams)) {
            return false;
        }
        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) other;
        return Intrinsics.areEqual(this.clientSecret, confirmSetupIntentParams.clientSecret) && Intrinsics.areEqual(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.returnUrl, confirmSetupIntentParams.returnUrl) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && Intrinsics.areEqual(this.mandateId, confirmSetupIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmSetupIntentParams.mandateData);
    }

    public int hashCode() {
        int iHashCode = this.clientSecret.hashCode() * 31;
        String str = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode3 = (iHashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.useStripeSdk)) * 31;
        String str3 = this.mandateId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        return iHashCode5 + (mandateDataParams != null ? mandateDataParams.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + this.clientSecret + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", returnUrl=" + this.returnUrl + ", useStripeSdk=" + this.useStripeSdk + ", mandateId=" + this.mandateId + ", mandateData=" + this.mandateData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodCreateParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.returnUrl);
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mandateDataParams.writeToParcel(parcel, flags);
        }
    }

    public ConfirmSetupIntentParams(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z, String str3, MandateDataParams mandateDataParams) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.paymentMethodId = str;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str2;
        this.useStripeSdk = z;
        this.mandateId = str3;
        this.mandateData = mandateDataParams;
    }

    public /* synthetic */ ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : paymentMethodCreateParams, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : mandateDataParams);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: getPaymentMethodCreateParams$payments_core_release, reason: from getter */
    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmSetupIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk) {
        return copy$default(this, null, null, null, null, shouldUseStripeSdk, null, null, 111, null);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("client_secret", getClientSecret()), Tuples4.m3642to("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl = getReturnUrl();
        Map mapMapOf2 = returnUrl != null ? MapsKt.mapOf(Tuples4.m3642to("return_url", returnUrl)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        String str = this.mandateId;
        Map mapMapOf3 = str != null ? MapsKt.mapOf(Tuples4.m3642to("mandate", str)) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        Map mapMapOf4 = mandateDataParams != null ? MapsKt.mapOf(Tuples4.m3642to("mandate_data", mandateDataParams)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        return MapsKt.plus(MapsKt.plus(mapPlus2, mapMapOf4), getPaymentMethodParamMap());
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            return MapsKt.mapOf(Tuples4.m3642to("payment_method_data", paymentMethodCreateParams.toParamMap()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return MapsKt.mapOf(Tuples4.m3642to("payment_method", str));
        }
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> getMandateDataParams() {
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null && (paramMap = mandateDataParams.toParamMap()) != null) {
            return paramMap;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null && paymentMethodCreateParams.getRequiresMandate() && this.mandateId == null) {
            return new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT()).toParamMap();
        }
        return null;
    }

    /* compiled from: ConfirmSetupIntentParams.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;", "", "<init>", "()V", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "", "clientSecret", "Lcom/stripe/android/model/MandateDataParams;", "mandateData", "mandateId", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
        }

        @JvmStatic
        @JvmOverloads
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateData, String mandateId) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, paymentMethodCreateParams, null, false, mandateId, mandateData, 26, null);
        }
    }
}
