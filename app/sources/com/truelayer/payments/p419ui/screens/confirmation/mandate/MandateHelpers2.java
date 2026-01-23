package com.truelayer.payments.p419ui.screens.confirmation.mandate;

import com.robinhood.iso.countrycode.CountryCode;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.payments.Beneficiary;
import com.truelayer.payments.core.domain.payments.MandateConstraints;
import com.truelayer.payments.core.domain.payments.PeriodicLimits;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.confirmation.MandateConfirmationViewData;
import java.net.URL;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.datetime.Clock2;
import kotlinx.datetime.Instant;

/* compiled from: MandateHelpers.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/mandate/MandateSampleData;", "", "()V", "beneficiaryExternalAccount", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$ExternalAccount;", "beneficiaryMerchantAccount", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$MerchantAccount;", "confirmationViewData", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "getConfirmationViewData", "()Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "confirmationViewDataWithMerchantAccount", "getConfirmationViewDataWithMerchantAccount", "mandate", "Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "getMandate", "()Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.mandate.MandateSampleData, reason: use source file name */
/* loaded from: classes12.dex */
public final class MandateHelpers2 {
    public static final int $stable;
    public static final MandateHelpers2 INSTANCE = new MandateHelpers2();
    private static final Beneficiary.ExternalAccount beneficiaryExternalAccount;
    private static final Beneficiary.MerchantAccount beneficiaryMerchantAccount;
    private static final MandateConfirmationViewData confirmationViewData;
    private static final MandateConfirmationViewData confirmationViewDataWithMerchantAccount;
    private static final MandateConstraints mandate;

    private MandateHelpers2() {
    }

    static {
        Clock2 clock2 = Clock2.INSTANCE;
        Instant instantNow = clock2.now();
        Instant instantM28852plusLRDsOJo = clock2.now().m28852plusLRDsOJo(Duration.INSTANCE.m28768parseUwyO8pc("P7D"));
        PeriodicLimits.PeriodAlignment periodAlignment = PeriodicLimits.PeriodAlignment.Consent;
        MandateConstraints mandateConstraints = new MandateConstraints(instantNow, instantM28852plusLRDsOJo, 100L, new PeriodicLimits(new PeriodicLimits.Limit(100L, periodAlignment), new PeriodicLimits.Limit(200L, periodAlignment), new PeriodicLimits.Limit(300L, periodAlignment), new PeriodicLimits.Limit(450L, periodAlignment), new PeriodicLimits.Limit(555L, periodAlignment), new PeriodicLimits.Limit(1000L, periodAlignment)));
        mandate = mandateConstraints;
        Beneficiary.ExternalAccount externalAccount = new Beneficiary.ExternalAccount("The Holder Name", new Beneficiary.AccountIdentifier.SortCodeAccountNumber("123243", "12345678"), "231231290");
        beneficiaryExternalAccount = externalAccount;
        Beneficiary.MerchantAccount merchantAccount = new Beneficiary.MerchantAccount("fake-merchant-account-id", "Imaginary Account Holder", new Beneficiary.AccountIdentifier.SortCodeAccountNumber("123243", "12345678"), null);
        beneficiaryMerchantAccount = merchantAccount;
        MandateConfirmationViewData mandateConfirmationViewData = new MandateConfirmationViewData("fake-provider-id", "Monzo", "http://notavalidurl.com", null, CountryCode.COUNTRY_CODE_GB, "Netflix", new URL("http://notavalidurl.com"), Currency.Defaults.INSTANCE.getGBP(), new Legals("By continuing you are permitting TrueLayer to initiate a payment from your bank account. You also agree to our End User Terms of Service and <a href=\\\"https://truelayer.com/en-ie/enduser_tos\\\">Privacy Policy</a>", null), true, false, false, ConfirmationViewData.PaymentUseCase.SinglePayment, mandateConstraints, externalAccount, "#Payment reference");
        confirmationViewData = mandateConfirmationViewData;
        confirmationViewDataWithMerchantAccount = mandateConfirmationViewData.copy((49151 & 1) != 0 ? mandateConfirmationViewData.providerId : null, (49151 & 2) != 0 ? mandateConfirmationViewData.providerName : null, (49151 & 4) != 0 ? mandateConfirmationViewData.providerIconUrl : null, (49151 & 8) != 0 ? mandateConfirmationViewData.providerExtendedIconUrl : null, (49151 & 16) != 0 ? mandateConfirmationViewData.providerCountryCode : null, (49151 & 32) != 0 ? mandateConfirmationViewData.merchantName : null, (49151 & 64) != 0 ? mandateConfirmationViewData.merchantIconUrl : null, (49151 & 128) != 0 ? mandateConfirmationViewData.currency : null, (49151 & 256) != 0 ? mandateConfirmationViewData.legals : null, (49151 & 512) != 0 ? mandateConfirmationViewData.isEnabled : false, (49151 & 1024) != 0 ? mandateConfirmationViewData.isProviderSelected : false, (49151 & 2048) != 0 ? mandateConfirmationViewData.isMerchantRegulated : false, (49151 & 4096) != 0 ? mandateConfirmationViewData.paymentUseCase : null, (49151 & 8192) != 0 ? mandateConfirmationViewData.mandate : null, (49151 & 16384) != 0 ? mandateConfirmationViewData.beneficiary : merchantAccount, (49151 & 32768) != 0 ? mandateConfirmationViewData.paymentReference : null);
        $stable = 8;
    }

    public final MandateConstraints getMandate() {
        return mandate;
    }

    public final MandateConfirmationViewData getConfirmationViewData() {
        return confirmationViewData;
    }

    public final MandateConfirmationViewData getConfirmationViewDataWithMerchantAccount() {
        return confirmationViewDataWithMerchantAccount;
    }
}
