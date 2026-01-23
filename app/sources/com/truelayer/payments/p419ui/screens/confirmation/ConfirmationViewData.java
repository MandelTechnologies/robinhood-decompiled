package com.truelayer.payments.p419ui.screens.confirmation;

import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import java.net.URL;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: ConfirmationViewData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 (2\u00020\u0001:\u0002()R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u0014X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u001eR\u0012\u0010\"\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0012\u0010$\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0012\u0010&\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0016\u0082\u0001\u0002*+¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "isEnabled", "", "()Z", "isMerchantRegulated", "isProviderSelected", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "merchantIconUrl", "Ljava/net/URL;", "getMerchantIconUrl", "()Ljava/net/URL;", "merchantName", "", "getMerchantName", "()Ljava/lang/String;", "paymentUseCase", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "getPaymentUseCase", "()Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "providerCountryCode", "getProviderCountryCode", "setProviderCountryCode", "(Ljava/lang/String;)V", "providerExtendedIconUrl", "getProviderExtendedIconUrl", "setProviderExtendedIconUrl", "providerIconUrl", "getProviderIconUrl", "providerId", "getProviderId", "providerName", "getProviderName", "Companion", "PaymentUseCase", "Lcom/truelayer/payments/ui/screens/confirmation/MandateConfirmationViewData;", "Lcom/truelayer/payments/ui/screens/confirmation/PaymentConfirmationViewData;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ConfirmationViewData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Currency getCurrency();

    Legals getLegals();

    URL getMerchantIconUrl();

    String getMerchantName();

    PaymentUseCase getPaymentUseCase();

    String getProviderCountryCode();

    String getProviderExtendedIconUrl();

    String getProviderIconUrl();

    String getProviderId();

    String getProviderName();

    boolean isEnabled();

    boolean isMerchantRegulated();

    boolean isProviderSelected();

    void setProviderCountryCode(String str);

    void setProviderExtendedIconUrl(String str);

    /* compiled from: ConfirmationViewData.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$Companion;", "", "()V", "fallbackIconUrl", "Ljava/net/URL;", "getFallbackIconUrl", "()Ljava/net/URL;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final URL fallbackIconUrl = new URL("https://truelayer-client-logos.s3-eu-west-1.amazonaws.com/placeholder.svg");

        private Companion() {
        }

        public final URL getFallbackIconUrl() {
            return fallbackIconUrl;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfirmationViewData.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData$PaymentUseCase;", "", "(Ljava/lang/String;I)V", "SignUpPlus", "SinglePayment", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PaymentUseCase {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentUseCase[] $VALUES;
        public static final PaymentUseCase SignUpPlus = new PaymentUseCase("SignUpPlus", 0);
        public static final PaymentUseCase SinglePayment = new PaymentUseCase("SinglePayment", 1);

        private static final /* synthetic */ PaymentUseCase[] $values() {
            return new PaymentUseCase[]{SignUpPlus, SinglePayment};
        }

        public static EnumEntries<PaymentUseCase> getEntries() {
            return $ENTRIES;
        }

        public static PaymentUseCase valueOf(String str) {
            return (PaymentUseCase) Enum.valueOf(PaymentUseCase.class, str);
        }

        public static PaymentUseCase[] values() {
            return (PaymentUseCase[]) $VALUES.clone();
        }

        private PaymentUseCase(String str, int i) {
        }

        static {
            PaymentUseCase[] paymentUseCaseArr$values = $values();
            $VALUES = paymentUseCaseArr$values;
            $ENTRIES = EnumEntries2.enumEntries(paymentUseCaseArr$values);
        }
    }
}
