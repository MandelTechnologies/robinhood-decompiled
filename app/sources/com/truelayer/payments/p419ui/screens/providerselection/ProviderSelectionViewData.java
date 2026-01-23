package com.truelayer.payments.p419ui.screens.providerselection;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderScheme;
import com.truelayer.payments.p419ui.models.PaymentContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderSelectionViewData.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0012HÆ\u0003J{\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00063"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", "", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "providers", "", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "recommendedProviders", "preferredCountryCode", "", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "preselectedProvider", "availableSchemes", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "allowUserSelectedScheme", "", "(Lcom/truelayer/payments/ui/models/PaymentContext;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/util/List;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Z)V", "getAllowUserSelectedScheme", "()Z", "getAvailableSchemes", "()Ljava/util/List;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentContext", "()Lcom/truelayer/payments/ui/models/PaymentContext;", "getPreferredCountryCode", "()Ljava/lang/String;", "getPreselectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getProviders", "getRecommendedProviders", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProviderSelectionViewData {
    public static final int $stable = 8;
    private final boolean allowUserSelectedScheme;
    private final List<ProviderScheme> availableSchemes;
    private final MerchantConfig merchantConfig;
    private final Payment payment;
    private final PaymentContext paymentContext;
    private final String preferredCountryCode;
    private final PaymentProvider preselectedProvider;
    private final List<PaymentProvider> providers;
    private final List<PaymentProvider> recommendedProviders;

    public static /* synthetic */ ProviderSelectionViewData copy$default(ProviderSelectionViewData providerSelectionViewData, PaymentContext paymentContext, List list, List list2, String str, Payment payment, PaymentProvider paymentProvider, List list3, MerchantConfig merchantConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentContext = providerSelectionViewData.paymentContext;
        }
        if ((i & 2) != 0) {
            list = providerSelectionViewData.providers;
        }
        if ((i & 4) != 0) {
            list2 = providerSelectionViewData.recommendedProviders;
        }
        if ((i & 8) != 0) {
            str = providerSelectionViewData.preferredCountryCode;
        }
        if ((i & 16) != 0) {
            payment = providerSelectionViewData.payment;
        }
        if ((i & 32) != 0) {
            paymentProvider = providerSelectionViewData.preselectedProvider;
        }
        if ((i & 64) != 0) {
            list3 = providerSelectionViewData.availableSchemes;
        }
        if ((i & 128) != 0) {
            merchantConfig = providerSelectionViewData.merchantConfig;
        }
        if ((i & 256) != 0) {
            z = providerSelectionViewData.allowUserSelectedScheme;
        }
        MerchantConfig merchantConfig2 = merchantConfig;
        boolean z2 = z;
        PaymentProvider paymentProvider2 = paymentProvider;
        List list4 = list3;
        Payment payment2 = payment;
        List list5 = list2;
        return providerSelectionViewData.copy(paymentContext, list, list5, str, payment2, paymentProvider2, list4, merchantConfig2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentContext getPaymentContext() {
        return this.paymentContext;
    }

    public final List<PaymentProvider> component2() {
        return this.providers;
    }

    public final List<PaymentProvider> component3() {
        return this.recommendedProviders;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPreferredCountryCode() {
        return this.preferredCountryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final Payment getPayment() {
        return this.payment;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentProvider getPreselectedProvider() {
        return this.preselectedProvider;
    }

    public final List<ProviderScheme> component7() {
        return this.availableSchemes;
    }

    /* renamed from: component8, reason: from getter */
    public final MerchantConfig getMerchantConfig() {
        return this.merchantConfig;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAllowUserSelectedScheme() {
        return this.allowUserSelectedScheme;
    }

    public final ProviderSelectionViewData copy(PaymentContext paymentContext, List<PaymentProvider> providers, List<PaymentProvider> recommendedProviders, String preferredCountryCode, Payment payment, PaymentProvider preselectedProvider, List<ProviderScheme> availableSchemes, MerchantConfig merchantConfig, boolean allowUserSelectedScheme) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
        return new ProviderSelectionViewData(paymentContext, providers, recommendedProviders, preferredCountryCode, payment, preselectedProvider, availableSchemes, merchantConfig, allowUserSelectedScheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderSelectionViewData)) {
            return false;
        }
        ProviderSelectionViewData providerSelectionViewData = (ProviderSelectionViewData) other;
        return Intrinsics.areEqual(this.paymentContext, providerSelectionViewData.paymentContext) && Intrinsics.areEqual(this.providers, providerSelectionViewData.providers) && Intrinsics.areEqual(this.recommendedProviders, providerSelectionViewData.recommendedProviders) && Intrinsics.areEqual(this.preferredCountryCode, providerSelectionViewData.preferredCountryCode) && Intrinsics.areEqual(this.payment, providerSelectionViewData.payment) && Intrinsics.areEqual(this.preselectedProvider, providerSelectionViewData.preselectedProvider) && Intrinsics.areEqual(this.availableSchemes, providerSelectionViewData.availableSchemes) && Intrinsics.areEqual(this.merchantConfig, providerSelectionViewData.merchantConfig) && this.allowUserSelectedScheme == providerSelectionViewData.allowUserSelectedScheme;
    }

    public int hashCode() {
        int iHashCode = ((((this.paymentContext.hashCode() * 31) + this.providers.hashCode()) * 31) + this.recommendedProviders.hashCode()) * 31;
        String str = this.preferredCountryCode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.payment.hashCode()) * 31;
        PaymentProvider paymentProvider = this.preselectedProvider;
        int iHashCode3 = (iHashCode2 + (paymentProvider == null ? 0 : paymentProvider.hashCode())) * 31;
        List<ProviderScheme> list = this.availableSchemes;
        return ((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.merchantConfig.hashCode()) * 31) + Boolean.hashCode(this.allowUserSelectedScheme);
    }

    public String toString() {
        return "ProviderSelectionViewData(paymentContext=" + this.paymentContext + ", providers=" + this.providers + ", recommendedProviders=" + this.recommendedProviders + ", preferredCountryCode=" + this.preferredCountryCode + ", payment=" + this.payment + ", preselectedProvider=" + this.preselectedProvider + ", availableSchemes=" + this.availableSchemes + ", merchantConfig=" + this.merchantConfig + ", allowUserSelectedScheme=" + this.allowUserSelectedScheme + ")";
    }

    public ProviderSelectionViewData(PaymentContext paymentContext, List<PaymentProvider> providers, List<PaymentProvider> recommendedProviders, String str, Payment payment, PaymentProvider paymentProvider, List<ProviderScheme> list, MerchantConfig merchantConfig, boolean z) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
        this.paymentContext = paymentContext;
        this.providers = providers;
        this.recommendedProviders = recommendedProviders;
        this.preferredCountryCode = str;
        this.payment = payment;
        this.preselectedProvider = paymentProvider;
        this.availableSchemes = list;
        this.merchantConfig = merchantConfig;
        this.allowUserSelectedScheme = z;
    }

    public final PaymentContext getPaymentContext() {
        return this.paymentContext;
    }

    public /* synthetic */ ProviderSelectionViewData(PaymentContext paymentContext, List list, List list2, String str, Payment payment, PaymentProvider paymentProvider, List list3, MerchantConfig merchantConfig, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? null : str, payment, paymentProvider, (i & 64) != 0 ? null : list3, merchantConfig, (i & 256) != 0 ? true : z);
    }

    public final List<PaymentProvider> getProviders() {
        return this.providers;
    }

    public final List<PaymentProvider> getRecommendedProviders() {
        return this.recommendedProviders;
    }

    public final String getPreferredCountryCode() {
        return this.preferredCountryCode;
    }

    public final Payment getPayment() {
        return this.payment;
    }

    public final PaymentProvider getPreselectedProvider() {
        return this.preselectedProvider;
    }

    public final List<ProviderScheme> getAvailableSchemes() {
        return this.availableSchemes;
    }

    public final MerchantConfig getMerchantConfig() {
        return this.merchantConfig;
    }

    public final boolean getAllowUserSelectedScheme() {
        return this.allowUserSelectedScheme;
    }
}
