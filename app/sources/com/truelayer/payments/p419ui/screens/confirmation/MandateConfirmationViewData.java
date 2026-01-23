package com.truelayer.payments.p419ui.screens.confirmation;

import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.payments.MandateConstraints;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateConfirmationViewData.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0016HÆ\u0003J\t\u0010A\u001a\u00020\u0018HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000eHÆ\u0003J±\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010L\u001a\u00020\u00102\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0012\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-¨\u0006R"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "providerId", "", "providerName", "providerIconUrl", "providerExtendedIconUrl", "providerCountryCode", "merchantName", "merchantIconUrl", "Ljava/net/URL;", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "isEnabled", "", "isProviderSelected", "isMerchantRegulated", "paymentUseCase", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "mandate", "Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "beneficiary", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "paymentReference", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;ZZZLcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;Lcom/truelayer/payments/core/domain/payments/MandateConstraints;Lcom/truelayer/payments/core/domain/payments/Beneficiary;Ljava/lang/String;)V", "getBeneficiary", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "setLegals", "(Lcom/truelayer/payments/core/domain/experience/localisation/Legals;)V", "getMandate", "()Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "getMerchantIconUrl", "()Ljava/net/URL;", "setMerchantIconUrl", "(Ljava/net/URL;)V", "getMerchantName", "()Ljava/lang/String;", "setMerchantName", "(Ljava/lang/String;)V", "getPaymentReference", "getPaymentUseCase", "()Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "getProviderCountryCode", "setProviderCountryCode", "getProviderExtendedIconUrl", "setProviderExtendedIconUrl", "getProviderIconUrl", "setProviderIconUrl", "getProviderId", "setProviderId", "getProviderName", "setProviderName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MandateConfirmationViewData implements ConfirmationViewData {
    public static final int $stable = 8;
    private final Beneficiary beneficiary;
    private final Currency currency;
    private final boolean isEnabled;
    private final boolean isMerchantRegulated;
    private final boolean isProviderSelected;
    private Legals legals;
    private final MandateConstraints mandate;
    private URL merchantIconUrl;
    private String merchantName;
    private final String paymentReference;
    private final ConfirmationViewData.PaymentUseCase paymentUseCase;
    private String providerCountryCode;
    private String providerExtendedIconUrl;
    private String providerIconUrl;
    private String providerId;
    private String providerName;

    /* renamed from: component1, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsProviderSelected() {
        return this.isProviderSelected;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsMerchantRegulated() {
        return this.isMerchantRegulated;
    }

    /* renamed from: component13, reason: from getter */
    public final ConfirmationViewData.PaymentUseCase getPaymentUseCase() {
        return this.paymentUseCase;
    }

    /* renamed from: component14, reason: from getter */
    public final MandateConstraints getMandate() {
        return this.mandate;
    }

    /* renamed from: component15, reason: from getter */
    public final Beneficiary getBeneficiary() {
        return this.beneficiary;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPaymentReference() {
        return this.paymentReference;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProviderIconUrl() {
        return this.providerIconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProviderExtendedIconUrl() {
        return this.providerExtendedIconUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProviderCountryCode() {
        return this.providerCountryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component7, reason: from getter */
    public final URL getMerchantIconUrl() {
        return this.merchantIconUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final Legals getLegals() {
        return this.legals;
    }

    public final MandateConfirmationViewData copy(String providerId, String providerName, String providerIconUrl, String providerExtendedIconUrl, String providerCountryCode, String merchantName, URL merchantIconUrl, Currency currency, Legals legals, boolean isEnabled, boolean isProviderSelected, boolean isMerchantRegulated, ConfirmationViewData.PaymentUseCase paymentUseCase, MandateConstraints mandate, Beneficiary beneficiary, String paymentReference) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(providerIconUrl, "providerIconUrl");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentUseCase, "paymentUseCase");
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        return new MandateConfirmationViewData(providerId, providerName, providerIconUrl, providerExtendedIconUrl, providerCountryCode, merchantName, merchantIconUrl, currency, legals, isEnabled, isProviderSelected, isMerchantRegulated, paymentUseCase, mandate, beneficiary, paymentReference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MandateConfirmationViewData)) {
            return false;
        }
        MandateConfirmationViewData mandateConfirmationViewData = (MandateConfirmationViewData) other;
        return Intrinsics.areEqual(this.providerId, mandateConfirmationViewData.providerId) && Intrinsics.areEqual(this.providerName, mandateConfirmationViewData.providerName) && Intrinsics.areEqual(this.providerIconUrl, mandateConfirmationViewData.providerIconUrl) && Intrinsics.areEqual(this.providerExtendedIconUrl, mandateConfirmationViewData.providerExtendedIconUrl) && Intrinsics.areEqual(this.providerCountryCode, mandateConfirmationViewData.providerCountryCode) && Intrinsics.areEqual(this.merchantName, mandateConfirmationViewData.merchantName) && Intrinsics.areEqual(this.merchantIconUrl, mandateConfirmationViewData.merchantIconUrl) && Intrinsics.areEqual(this.currency, mandateConfirmationViewData.currency) && Intrinsics.areEqual(this.legals, mandateConfirmationViewData.legals) && this.isEnabled == mandateConfirmationViewData.isEnabled && this.isProviderSelected == mandateConfirmationViewData.isProviderSelected && this.isMerchantRegulated == mandateConfirmationViewData.isMerchantRegulated && this.paymentUseCase == mandateConfirmationViewData.paymentUseCase && Intrinsics.areEqual(this.mandate, mandateConfirmationViewData.mandate) && Intrinsics.areEqual(this.beneficiary, mandateConfirmationViewData.beneficiary) && Intrinsics.areEqual(this.paymentReference, mandateConfirmationViewData.paymentReference);
    }

    public int hashCode() {
        int iHashCode = ((((this.providerId.hashCode() * 31) + this.providerName.hashCode()) * 31) + this.providerIconUrl.hashCode()) * 31;
        String str = this.providerExtendedIconUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.providerCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        URL url = this.merchantIconUrl;
        int iHashCode3 = (((iHashCode2 + (url == null ? 0 : url.hashCode())) * 31) + this.currency.hashCode()) * 31;
        Legals legals = this.legals;
        int iHashCode4 = (((((((((((((iHashCode3 + (legals == null ? 0 : legals.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isProviderSelected)) * 31) + Boolean.hashCode(this.isMerchantRegulated)) * 31) + this.paymentUseCase.hashCode()) * 31) + this.mandate.hashCode()) * 31) + this.beneficiary.hashCode()) * 31;
        String str2 = this.paymentReference;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MandateConfirmationViewData(providerId=" + this.providerId + ", providerName=" + this.providerName + ", providerIconUrl=" + this.providerIconUrl + ", providerExtendedIconUrl=" + this.providerExtendedIconUrl + ", providerCountryCode=" + this.providerCountryCode + ", merchantName=" + this.merchantName + ", merchantIconUrl=" + this.merchantIconUrl + ", currency=" + this.currency + ", legals=" + this.legals + ", isEnabled=" + this.isEnabled + ", isProviderSelected=" + this.isProviderSelected + ", isMerchantRegulated=" + this.isMerchantRegulated + ", paymentUseCase=" + this.paymentUseCase + ", mandate=" + this.mandate + ", beneficiary=" + this.beneficiary + ", paymentReference=" + this.paymentReference + ")";
    }

    public MandateConfirmationViewData(String providerId, String providerName, String providerIconUrl, String str, String providerCountryCode, String merchantName, URL url, Currency currency, Legals legals, boolean z, boolean z2, boolean z3, ConfirmationViewData.PaymentUseCase paymentUseCase, MandateConstraints mandate, Beneficiary beneficiary, String str2) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(providerIconUrl, "providerIconUrl");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentUseCase, "paymentUseCase");
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerIconUrl = providerIconUrl;
        this.providerExtendedIconUrl = str;
        this.providerCountryCode = providerCountryCode;
        this.merchantName = merchantName;
        this.merchantIconUrl = url;
        this.currency = currency;
        this.legals = legals;
        this.isEnabled = z;
        this.isProviderSelected = z2;
        this.isMerchantRegulated = z3;
        this.paymentUseCase = paymentUseCase;
        this.mandate = mandate;
        this.beneficiary = beneficiary;
        this.paymentReference = str2;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.providerId = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.providerName = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getProviderIconUrl() {
        return this.providerIconUrl;
    }

    public void setProviderIconUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.providerIconUrl = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getProviderExtendedIconUrl() {
        return this.providerExtendedIconUrl;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public void setProviderExtendedIconUrl(String str) {
        this.providerExtendedIconUrl = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getProviderCountryCode() {
        return this.providerCountryCode;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public void setProviderCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.providerCountryCode = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantName = str;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public URL getMerchantIconUrl() {
        return this.merchantIconUrl;
    }

    public void setMerchantIconUrl(URL url) {
        this.merchantIconUrl = url;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public Currency getCurrency() {
        return this.currency;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public Legals getLegals() {
        return this.legals;
    }

    public void setLegals(Legals legals) {
        this.legals = legals;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public boolean isProviderSelected() {
        return this.isProviderSelected;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public boolean isMerchantRegulated() {
        return this.isMerchantRegulated;
    }

    @Override // com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData
    public ConfirmationViewData.PaymentUseCase getPaymentUseCase() {
        return this.paymentUseCase;
    }

    public final MandateConstraints getMandate() {
        return this.mandate;
    }

    public final Beneficiary getBeneficiary() {
        return this.beneficiary;
    }

    public final String getPaymentReference() {
        return this.paymentReference;
    }
}
