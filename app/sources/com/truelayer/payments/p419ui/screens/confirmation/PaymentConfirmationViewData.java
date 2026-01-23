package com.truelayer.payments.p419ui.screens.confirmation;

import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentConfirmationViewData.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 J2\u00020\u0001:\u0001JB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\t\u0010:\u001a\u00020\u0016HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u009b\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u0006K"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/PaymentConfirmationViewData;", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "providerId", "", "providerName", "providerIconUrl", "providerExtendedIconUrl", "providerCountryCode", "merchantName", "merchantIconUrl", "Ljava/net/URL;", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "isEnabled", "", "isProviderSelected", "isMerchantRegulated", "paymentUseCase", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "amount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;ZZZLcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;J)V", "getAmount", "()J", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "setLegals", "(Lcom/truelayer/payments/core/domain/experience/localisation/Legals;)V", "getMerchantIconUrl", "()Ljava/net/URL;", "setMerchantIconUrl", "(Ljava/net/URL;)V", "getMerchantName", "()Ljava/lang/String;", "setMerchantName", "(Ljava/lang/String;)V", "getPaymentUseCase", "()Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "getProviderCountryCode", "setProviderCountryCode", "getProviderExtendedIconUrl", "setProviderExtendedIconUrl", "getProviderIconUrl", "setProviderIconUrl", "getProviderId", "setProviderId", "getProviderName", "setProviderName", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentConfirmationViewData implements ConfirmationViewData {
    private final long amount;
    private final Currency currency;
    private final boolean isEnabled;
    private final boolean isMerchantRegulated;
    private final boolean isProviderSelected;
    private Legals legals;
    private URL merchantIconUrl;
    private String merchantName;
    private final ConfirmationViewData.PaymentUseCase paymentUseCase;
    private String providerCountryCode;
    private String providerExtendedIconUrl;
    private String providerIconUrl;
    private String providerId;
    private String providerName;
    public static final int $stable = 8;

    public static /* synthetic */ PaymentConfirmationViewData copy$default(PaymentConfirmationViewData paymentConfirmationViewData, String str, String str2, String str3, String str4, String str5, String str6, URL url, Currency currency, Legals legals, boolean z, boolean z2, boolean z3, ConfirmationViewData.PaymentUseCase paymentUseCase, long j, int i, Object obj) {
        long j2;
        String str7;
        PaymentConfirmationViewData paymentConfirmationViewData2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        URL url2;
        Currency currency2;
        Legals legals2;
        boolean z4;
        boolean z5;
        boolean z6;
        ConfirmationViewData.PaymentUseCase paymentUseCase2;
        String str13 = (i & 1) != 0 ? paymentConfirmationViewData.providerId : str;
        String str14 = (i & 2) != 0 ? paymentConfirmationViewData.providerName : str2;
        String str15 = (i & 4) != 0 ? paymentConfirmationViewData.providerIconUrl : str3;
        String str16 = (i & 8) != 0 ? paymentConfirmationViewData.providerExtendedIconUrl : str4;
        String str17 = (i & 16) != 0 ? paymentConfirmationViewData.providerCountryCode : str5;
        String str18 = (i & 32) != 0 ? paymentConfirmationViewData.merchantName : str6;
        URL url3 = (i & 64) != 0 ? paymentConfirmationViewData.merchantIconUrl : url;
        Currency currency3 = (i & 128) != 0 ? paymentConfirmationViewData.currency : currency;
        Legals legals3 = (i & 256) != 0 ? paymentConfirmationViewData.legals : legals;
        boolean z7 = (i & 512) != 0 ? paymentConfirmationViewData.isEnabled : z;
        boolean z8 = (i & 1024) != 0 ? paymentConfirmationViewData.isProviderSelected : z2;
        boolean z9 = (i & 2048) != 0 ? paymentConfirmationViewData.isMerchantRegulated : z3;
        ConfirmationViewData.PaymentUseCase paymentUseCase3 = (i & 4096) != 0 ? paymentConfirmationViewData.paymentUseCase : paymentUseCase;
        if ((i & 8192) != 0) {
            str7 = str13;
            j2 = paymentConfirmationViewData.amount;
            str8 = str14;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            url2 = url3;
            currency2 = currency3;
            legals2 = legals3;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            paymentUseCase2 = paymentUseCase3;
            paymentConfirmationViewData2 = paymentConfirmationViewData;
        } else {
            j2 = j;
            str7 = str13;
            paymentConfirmationViewData2 = paymentConfirmationViewData;
            str8 = str14;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            url2 = url3;
            currency2 = currency3;
            legals2 = legals3;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            paymentUseCase2 = paymentUseCase3;
        }
        return paymentConfirmationViewData2.copy(str7, str8, str9, str10, str11, str12, url2, currency2, legals2, z4, z5, z6, paymentUseCase2, j2);
    }

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
    public final long getAmount() {
        return this.amount;
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

    public final PaymentConfirmationViewData copy(String providerId, String providerName, String providerIconUrl, String providerExtendedIconUrl, String providerCountryCode, String merchantName, URL merchantIconUrl, Currency currency, Legals legals, boolean isEnabled, boolean isProviderSelected, boolean isMerchantRegulated, ConfirmationViewData.PaymentUseCase paymentUseCase, long amount) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(providerIconUrl, "providerIconUrl");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentUseCase, "paymentUseCase");
        return new PaymentConfirmationViewData(providerId, providerName, providerIconUrl, providerExtendedIconUrl, providerCountryCode, merchantName, merchantIconUrl, currency, legals, isEnabled, isProviderSelected, isMerchantRegulated, paymentUseCase, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentConfirmationViewData)) {
            return false;
        }
        PaymentConfirmationViewData paymentConfirmationViewData = (PaymentConfirmationViewData) other;
        return Intrinsics.areEqual(this.providerId, paymentConfirmationViewData.providerId) && Intrinsics.areEqual(this.providerName, paymentConfirmationViewData.providerName) && Intrinsics.areEqual(this.providerIconUrl, paymentConfirmationViewData.providerIconUrl) && Intrinsics.areEqual(this.providerExtendedIconUrl, paymentConfirmationViewData.providerExtendedIconUrl) && Intrinsics.areEqual(this.providerCountryCode, paymentConfirmationViewData.providerCountryCode) && Intrinsics.areEqual(this.merchantName, paymentConfirmationViewData.merchantName) && Intrinsics.areEqual(this.merchantIconUrl, paymentConfirmationViewData.merchantIconUrl) && Intrinsics.areEqual(this.currency, paymentConfirmationViewData.currency) && Intrinsics.areEqual(this.legals, paymentConfirmationViewData.legals) && this.isEnabled == paymentConfirmationViewData.isEnabled && this.isProviderSelected == paymentConfirmationViewData.isProviderSelected && this.isMerchantRegulated == paymentConfirmationViewData.isMerchantRegulated && this.paymentUseCase == paymentConfirmationViewData.paymentUseCase && this.amount == paymentConfirmationViewData.amount;
    }

    public int hashCode() {
        int iHashCode = ((((this.providerId.hashCode() * 31) + this.providerName.hashCode()) * 31) + this.providerIconUrl.hashCode()) * 31;
        String str = this.providerExtendedIconUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.providerCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        URL url = this.merchantIconUrl;
        int iHashCode3 = (((iHashCode2 + (url == null ? 0 : url.hashCode())) * 31) + this.currency.hashCode()) * 31;
        Legals legals = this.legals;
        return ((((((((((iHashCode3 + (legals != null ? legals.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isProviderSelected)) * 31) + Boolean.hashCode(this.isMerchantRegulated)) * 31) + this.paymentUseCase.hashCode()) * 31) + Long.hashCode(this.amount);
    }

    public String toString() {
        return "PaymentConfirmationViewData(providerId=" + this.providerId + ", providerName=" + this.providerName + ", providerIconUrl=" + this.providerIconUrl + ", providerExtendedIconUrl=" + this.providerExtendedIconUrl + ", providerCountryCode=" + this.providerCountryCode + ", merchantName=" + this.merchantName + ", merchantIconUrl=" + this.merchantIconUrl + ", currency=" + this.currency + ", legals=" + this.legals + ", isEnabled=" + this.isEnabled + ", isProviderSelected=" + this.isProviderSelected + ", isMerchantRegulated=" + this.isMerchantRegulated + ", paymentUseCase=" + this.paymentUseCase + ", amount=" + this.amount + ")";
    }

    public PaymentConfirmationViewData(String providerId, String providerName, String providerIconUrl, String str, String providerCountryCode, String merchantName, URL url, Currency currency, Legals legals, boolean z, boolean z2, boolean z3, ConfirmationViewData.PaymentUseCase paymentUseCase, long j) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(providerIconUrl, "providerIconUrl");
        Intrinsics.checkNotNullParameter(providerCountryCode, "providerCountryCode");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentUseCase, "paymentUseCase");
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
        this.amount = j;
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

    public final long getAmount() {
        return this.amount;
    }
}
