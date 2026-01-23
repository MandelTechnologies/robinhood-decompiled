package com.truelayer.payments.p419ui.screens;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.ProviderScheme;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.coordinator.FlowState;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen;", "", "AccountSelection", "Failure", "Form", "Init", "ProviderSelection", "Redirect", "Result", "Success", "SuccessfulRedirect", "SuccessfulWait", "UserCancelled", "Wait", "Lcom/truelayer/payments/ui/screens/Screen$AccountSelection;", "Lcom/truelayer/payments/ui/screens/Screen$Failure;", "Lcom/truelayer/payments/ui/screens/Screen$Form;", "Lcom/truelayer/payments/ui/screens/Screen$Init;", "Lcom/truelayer/payments/ui/screens/Screen$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/Screen$Redirect;", "Lcom/truelayer/payments/ui/screens/Screen$Result;", "Lcom/truelayer/payments/ui/screens/Screen$Success;", "Lcom/truelayer/payments/ui/screens/Screen$SuccessfulRedirect;", "Lcom/truelayer/payments/ui/screens/Screen$SuccessfulWait;", "Lcom/truelayer/payments/ui/screens/Screen$UserCancelled;", "Lcom/truelayer/payments/ui/screens/Screen$Wait;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Screen {

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Init;", "Lcom/truelayer/payments/ui/screens/Screen;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Init implements Screen {
        public static final int $stable = 0;
        public static final Init INSTANCE = new Init();

        public boolean equals(Object other) {
            return this == other || (other instanceof Init);
        }

        public int hashCode() {
            return -405439654;
        }

        public String toString() {
            return "Init";
        }

        private Init() {
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$AccountSelection;", "Lcom/truelayer/payments/ui/screens/Screen;", "accounts", "", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AccountSelection implements Screen {
        public static final int $stable = 8;
        private final List<UserAccount> accounts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountSelection copy$default(AccountSelection accountSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = accountSelection.accounts;
            }
            return accountSelection.copy(list);
        }

        public final List<UserAccount> component1() {
            return this.accounts;
        }

        public final AccountSelection copy(List<UserAccount> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            return new AccountSelection(accounts2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSelection) && Intrinsics.areEqual(this.accounts, ((AccountSelection) other).accounts);
        }

        public int hashCode() {
            return this.accounts.hashCode();
        }

        public String toString() {
            return "AccountSelection(accounts=" + this.accounts + ")";
        }

        public AccountSelection(List<UserAccount> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            this.accounts = accounts2;
        }

        public final List<UserAccount> getAccounts() {
            return this.accounts;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003Jg\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$ProviderSelection;", "Lcom/truelayer/payments/ui/screens/Screen;", "providers", "", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "recommendedProviders", "preferredCountryCode", "", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "preselectedProvider", "availableSchemes", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/util/List;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;)V", "getAvailableSchemes", "()Ljava/util/List;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPreferredCountryCode", "()Ljava/lang/String;", "getPreselectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getProviders", "getRecommendedProviders", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ProviderSelection implements Screen {
        private final List<ProviderScheme> availableSchemes;
        private final MerchantConfig merchantConfig;
        private final Payment payment;
        private final String preferredCountryCode;
        private final PaymentProvider preselectedProvider;
        private final List<PaymentProvider> providers;
        private final List<PaymentProvider> recommendedProviders;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ ProviderSelection copy$default(ProviderSelection providerSelection, List list, List list2, String str, Payment payment, PaymentProvider paymentProvider, List list3, MerchantConfig merchantConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                list = providerSelection.providers;
            }
            if ((i & 2) != 0) {
                list2 = providerSelection.recommendedProviders;
            }
            if ((i & 4) != 0) {
                str = providerSelection.preferredCountryCode;
            }
            if ((i & 8) != 0) {
                payment = providerSelection.payment;
            }
            if ((i & 16) != 0) {
                paymentProvider = providerSelection.preselectedProvider;
            }
            if ((i & 32) != 0) {
                list3 = providerSelection.availableSchemes;
            }
            if ((i & 64) != 0) {
                merchantConfig = providerSelection.merchantConfig;
            }
            List list4 = list3;
            MerchantConfig merchantConfig2 = merchantConfig;
            PaymentProvider paymentProvider2 = paymentProvider;
            String str2 = str;
            return providerSelection.copy(list, list2, str2, payment, paymentProvider2, list4, merchantConfig2);
        }

        public final List<PaymentProvider> component1() {
            return this.providers;
        }

        public final List<PaymentProvider> component2() {
            return this.recommendedProviders;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPreferredCountryCode() {
            return this.preferredCountryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentProvider getPreselectedProvider() {
            return this.preselectedProvider;
        }

        public final List<ProviderScheme> component6() {
            return this.availableSchemes;
        }

        /* renamed from: component7, reason: from getter */
        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public final ProviderSelection copy(List<PaymentProvider> providers, List<PaymentProvider> recommendedProviders, String preferredCountryCode, Payment payment, PaymentProvider preselectedProvider, List<ProviderScheme> availableSchemes, MerchantConfig merchantConfig) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            return new ProviderSelection(providers, recommendedProviders, preferredCountryCode, payment, preselectedProvider, availableSchemes, merchantConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProviderSelection)) {
                return false;
            }
            ProviderSelection providerSelection = (ProviderSelection) other;
            return Intrinsics.areEqual(this.providers, providerSelection.providers) && Intrinsics.areEqual(this.recommendedProviders, providerSelection.recommendedProviders) && Intrinsics.areEqual(this.preferredCountryCode, providerSelection.preferredCountryCode) && Intrinsics.areEqual(this.payment, providerSelection.payment) && Intrinsics.areEqual(this.preselectedProvider, providerSelection.preselectedProvider) && Intrinsics.areEqual(this.availableSchemes, providerSelection.availableSchemes) && Intrinsics.areEqual(this.merchantConfig, providerSelection.merchantConfig);
        }

        public int hashCode() {
            int iHashCode = ((this.providers.hashCode() * 31) + this.recommendedProviders.hashCode()) * 31;
            String str = this.preferredCountryCode;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.payment.hashCode()) * 31;
            PaymentProvider paymentProvider = this.preselectedProvider;
            int iHashCode3 = (iHashCode2 + (paymentProvider == null ? 0 : paymentProvider.hashCode())) * 31;
            List<ProviderScheme> list = this.availableSchemes;
            return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.merchantConfig.hashCode();
        }

        public String toString() {
            return "ProviderSelection(providers=" + this.providers + ", recommendedProviders=" + this.recommendedProviders + ", preferredCountryCode=" + this.preferredCountryCode + ", payment=" + this.payment + ", preselectedProvider=" + this.preselectedProvider + ", availableSchemes=" + this.availableSchemes + ", merchantConfig=" + this.merchantConfig + ")";
        }

        public ProviderSelection(List<PaymentProvider> providers, List<PaymentProvider> recommendedProviders, String str, Payment payment, PaymentProvider paymentProvider, List<ProviderScheme> list, MerchantConfig merchantConfig) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(recommendedProviders, "recommendedProviders");
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            this.providers = providers;
            this.recommendedProviders = recommendedProviders;
            this.preferredCountryCode = str;
            this.payment = payment;
            this.preselectedProvider = paymentProvider;
            this.availableSchemes = list;
            this.merchantConfig = merchantConfig;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ProviderSelection(List list, List list2, String str, Payment payment, PaymentProvider paymentProvider, List list3, MerchantConfig merchantConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            MerchantConfig merchantConfig2;
            List list4;
            paymentProvider = (i & 16) != 0 ? null : paymentProvider;
            if ((i & 32) != 0) {
                merchantConfig2 = merchantConfig;
                list4 = null;
            } else {
                merchantConfig2 = merchantConfig;
                list4 = list3;
            }
            this(list, list2, str, payment, paymentProvider, list4, merchantConfig2);
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

        /* compiled from: Screen.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$ProviderSelection$Companion;", "", "()V", "preselectedProvider", "Lcom/truelayer/payments/ui/screens/Screen$ProviderSelection;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "availableSchemes", "", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ProviderSelection preselectedProvider(PaymentProvider preselectedProvider, Payment payment, MerchantConfig merchantConfig, List<ProviderScheme> availableSchemes) {
                Intrinsics.checkNotNullParameter(preselectedProvider, "preselectedProvider");
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
                List listListOf = CollectionsKt.listOf(preselectedProvider);
                List listEmptyList = CollectionsKt.emptyList();
                if (availableSchemes == null) {
                    availableSchemes = preselectedProvider.getSchemes();
                }
                return new ProviderSelection(listListOf, listEmptyList, null, payment, preselectedProvider, availableSchemes, merchantConfig);
            }
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003JS\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Form;", "Lcom/truelayer/payments/ui/screens/Screen;", "inputs", "", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "previouslyUsedValues", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "api", "Lcom/truelayer/payments/core/network/Network;", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "selectedBranch", "Lcom/truelayer/payments/core/domain/payments/Branch;", "isSignupPlus", "", "(Ljava/util/List;Ljava/util/List;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/Branch;Z)V", "getApi", "()Lcom/truelayer/payments/core/network/Network;", "getInputs", "()Ljava/util/List;", "()Z", "getPreviouslyUsedValues", "getSelectedBranch", "()Lcom/truelayer/payments/core/domain/payments/Branch;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Form implements Screen {
        public static final int $stable = 8;
        private final Network api;
        private final List<FormInputWrapper> inputs;
        private final boolean isSignupPlus;
        private final List<RecentAdditionalInput> previouslyUsedValues;
        private final Branch selectedBranch;
        private final PaymentProvider selectedProvider;

        public static /* synthetic */ Form copy$default(Form form, List list, List list2, Network network, PaymentProvider paymentProvider, Branch branch, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = form.inputs;
            }
            if ((i & 2) != 0) {
                list2 = form.previouslyUsedValues;
            }
            if ((i & 4) != 0) {
                network = form.api;
            }
            if ((i & 8) != 0) {
                paymentProvider = form.selectedProvider;
            }
            if ((i & 16) != 0) {
                branch = form.selectedBranch;
            }
            if ((i & 32) != 0) {
                z = form.isSignupPlus;
            }
            Branch branch2 = branch;
            boolean z2 = z;
            return form.copy(list, list2, network, paymentProvider, branch2, z2);
        }

        public final List<FormInputWrapper> component1() {
            return this.inputs;
        }

        public final List<RecentAdditionalInput> component2() {
            return this.previouslyUsedValues;
        }

        /* renamed from: component3, reason: from getter */
        public final Network getApi() {
            return this.api;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        /* renamed from: component5, reason: from getter */
        public final Branch getSelectedBranch() {
            return this.selectedBranch;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        public final Form copy(List<? extends FormInputWrapper> inputs, List<RecentAdditionalInput> previouslyUsedValues, Network api, PaymentProvider selectedProvider, Branch selectedBranch, boolean isSignupPlus) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(previouslyUsedValues, "previouslyUsedValues");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
            return new Form(inputs, previouslyUsedValues, api, selectedProvider, selectedBranch, isSignupPlus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return Intrinsics.areEqual(this.inputs, form.inputs) && Intrinsics.areEqual(this.previouslyUsedValues, form.previouslyUsedValues) && Intrinsics.areEqual(this.api, form.api) && Intrinsics.areEqual(this.selectedProvider, form.selectedProvider) && Intrinsics.areEqual(this.selectedBranch, form.selectedBranch) && this.isSignupPlus == form.isSignupPlus;
        }

        public int hashCode() {
            int iHashCode = ((((((this.inputs.hashCode() * 31) + this.previouslyUsedValues.hashCode()) * 31) + this.api.hashCode()) * 31) + this.selectedProvider.hashCode()) * 31;
            Branch branch = this.selectedBranch;
            return ((iHashCode + (branch == null ? 0 : branch.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus);
        }

        public String toString() {
            return "Form(inputs=" + this.inputs + ", previouslyUsedValues=" + this.previouslyUsedValues + ", api=" + this.api + ", selectedProvider=" + this.selectedProvider + ", selectedBranch=" + this.selectedBranch + ", isSignupPlus=" + this.isSignupPlus + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Form(List<? extends FormInputWrapper> inputs, List<RecentAdditionalInput> previouslyUsedValues, Network api, PaymentProvider selectedProvider, Branch branch, boolean z) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(previouslyUsedValues, "previouslyUsedValues");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
            this.inputs = inputs;
            this.previouslyUsedValues = previouslyUsedValues;
            this.api = api;
            this.selectedProvider = selectedProvider;
            this.selectedBranch = branch;
            this.isSignupPlus = z;
        }

        public final List<FormInputWrapper> getInputs() {
            return this.inputs;
        }

        public final List<RecentAdditionalInput> getPreviouslyUsedValues() {
            return this.previouslyUsedValues;
        }

        public final Network getApi() {
            return this.api;
        }

        public final PaymentProvider getSelectedProvider() {
            return this.selectedProvider;
        }

        public final Branch getSelectedBranch() {
            return this.selectedBranch;
        }

        public final boolean isSignupPlus() {
            return this.isSignupPlus;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Redirect;", "Lcom/truelayer/payments/ui/screens/Screen;", "redirectUrl", "", "(Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Redirect implements Screen {
        public static final int $stable = 0;
        private final String redirectUrl;

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.redirectUrl;
            }
            return redirect.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final Redirect copy(String redirectUrl) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            return new Redirect(redirectUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.areEqual(this.redirectUrl, ((Redirect) other).redirectUrl);
        }

        public int hashCode() {
            return this.redirectUrl.hashCode();
        }

        public String toString() {
            return "Redirect(redirectUrl=" + this.redirectUrl + ")";
        }

        public Redirect(String redirectUrl) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Failure;", "Lcom/truelayer/payments/ui/screens/Screen;", "flowState", "Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "(Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;)V", "getFlowState", "()Lcom/truelayer/payments/ui/screens/coordinator/FlowState$Failure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements Screen {
        public static final int $stable = 8;
        private final FlowState.Failure flowState;

        public static /* synthetic */ Failure copy$default(Failure failure, FlowState.Failure failure2, int i, Object obj) {
            if ((i & 1) != 0) {
                failure2 = failure.flowState;
            }
            return failure.copy(failure2);
        }

        /* renamed from: component1, reason: from getter */
        public final FlowState.Failure getFlowState() {
            return this.flowState;
        }

        public final Failure copy(FlowState.Failure flowState) {
            Intrinsics.checkNotNullParameter(flowState, "flowState");
            return new Failure(flowState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.flowState, ((Failure) other).flowState);
        }

        public int hashCode() {
            return this.flowState.hashCode();
        }

        public String toString() {
            return "Failure(flowState=" + this.flowState + ")";
        }

        public Failure(FlowState.Failure flowState) {
            Intrinsics.checkNotNullParameter(flowState, "flowState");
            this.flowState = flowState;
        }

        public final FlowState.Failure getFlowState() {
            return this.flowState;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$SuccessfulRedirect;", "Lcom/truelayer/payments/ui/screens/Screen;", "redirectUrl", "", "providerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getProviderId", "()Ljava/lang/String;", "getRedirectUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SuccessfulRedirect implements Screen {
        public static final int $stable = 0;
        private final String providerId;
        private final String redirectUrl;

        public static /* synthetic */ SuccessfulRedirect copy$default(SuccessfulRedirect successfulRedirect, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successfulRedirect.redirectUrl;
            }
            if ((i & 2) != 0) {
                str2 = successfulRedirect.providerId;
            }
            return successfulRedirect.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public final SuccessfulRedirect copy(String redirectUrl, String providerId) {
            return new SuccessfulRedirect(redirectUrl, providerId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessfulRedirect)) {
                return false;
            }
            SuccessfulRedirect successfulRedirect = (SuccessfulRedirect) other;
            return Intrinsics.areEqual(this.redirectUrl, successfulRedirect.redirectUrl) && Intrinsics.areEqual(this.providerId, successfulRedirect.providerId);
        }

        public int hashCode() {
            String str = this.redirectUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.providerId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SuccessfulRedirect(redirectUrl=" + this.redirectUrl + ", providerId=" + this.providerId + ")";
        }

        public SuccessfulRedirect(String str, String str2) {
            this.redirectUrl = str;
            this.providerId = str2;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final String getProviderId() {
            return this.providerId;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$SuccessfulWait;", "Lcom/truelayer/payments/ui/screens/Screen;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Lcom/truelayer/payments/core/domain/payments/Payment;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SuccessfulWait implements Screen {
        public static final int $stable = 8;
        private final Payment payment;

        public static /* synthetic */ SuccessfulWait copy$default(SuccessfulWait successfulWait, Payment payment, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = successfulWait.payment;
            }
            return successfulWait.copy(payment);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        public final SuccessfulWait copy(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            return new SuccessfulWait(payment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SuccessfulWait) && Intrinsics.areEqual(this.payment, ((SuccessfulWait) other).payment);
        }

        public int hashCode() {
            return this.payment.hashCode();
        }

        public String toString() {
            return "SuccessfulWait(payment=" + this.payment + ")";
        }

        public SuccessfulWait(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.payment = payment;
        }

        public final Payment getPayment() {
            return this.payment;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Success;", "Lcom/truelayer/payments/ui/screens/Screen;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Lcom/truelayer/payments/core/domain/payments/Payment;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Success implements Screen {
        public static final int $stable = 8;
        private final Payment payment;

        public static /* synthetic */ Success copy$default(Success success, Payment payment, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = success.payment;
            }
            return success.copy(payment);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        public final Success copy(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            return new Success(payment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.payment, ((Success) other).payment);
        }

        public int hashCode() {
            return this.payment.hashCode();
        }

        public String toString() {
            return "Success(payment=" + this.payment + ")";
        }

        public Success(Payment payment) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            this.payment = payment;
        }

        public final Payment getPayment() {
            return this.payment;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Wait;", "Lcom/truelayer/payments/ui/screens/Screen;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "paymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "translations", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "api", "Lcom/truelayer/payments/core/network/Network;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/util/Map;Lcom/truelayer/payments/core/network/Network;)V", "getApi", "()Lcom/truelayer/payments/core/network/Network;", "getLegals", "()Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getTranslations", "()Ljava/util/Map;", "setTranslations", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Wait implements Screen {
        public static final int $stable = 8;
        private final Network api;
        private final Legals legals;
        private final Payment payment;
        private final PaymentProvider paymentProvider;
        private Map<String, LocalisedText> translations;

        public static /* synthetic */ Wait copy$default(Wait wait, Payment payment, Legals legals, PaymentProvider paymentProvider, Map map, Network network, int i, Object obj) {
            if ((i & 1) != 0) {
                payment = wait.payment;
            }
            if ((i & 2) != 0) {
                legals = wait.legals;
            }
            if ((i & 4) != 0) {
                paymentProvider = wait.paymentProvider;
            }
            if ((i & 8) != 0) {
                map = wait.translations;
            }
            if ((i & 16) != 0) {
                network = wait.api;
            }
            Network network2 = network;
            PaymentProvider paymentProvider2 = paymentProvider;
            return wait.copy(payment, legals, paymentProvider2, map, network2);
        }

        /* renamed from: component1, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final Legals getLegals() {
            return this.legals;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentProvider getPaymentProvider() {
            return this.paymentProvider;
        }

        public final Map<String, LocalisedText> component4() {
            return this.translations;
        }

        /* renamed from: component5, reason: from getter */
        public final Network getApi() {
            return this.api;
        }

        public final Wait copy(Payment payment, Legals legals, PaymentProvider paymentProvider, Map<String, LocalisedText> translations, Network api) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(legals, "legals");
            Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
            Intrinsics.checkNotNullParameter(api, "api");
            return new Wait(payment, legals, paymentProvider, translations, api);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wait)) {
                return false;
            }
            Wait wait = (Wait) other;
            return Intrinsics.areEqual(this.payment, wait.payment) && Intrinsics.areEqual(this.legals, wait.legals) && Intrinsics.areEqual(this.paymentProvider, wait.paymentProvider) && Intrinsics.areEqual(this.translations, wait.translations) && Intrinsics.areEqual(this.api, wait.api);
        }

        public int hashCode() {
            int iHashCode = ((((this.payment.hashCode() * 31) + this.legals.hashCode()) * 31) + this.paymentProvider.hashCode()) * 31;
            Map<String, LocalisedText> map = this.translations;
            return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.api.hashCode();
        }

        public String toString() {
            return "Wait(payment=" + this.payment + ", legals=" + this.legals + ", paymentProvider=" + this.paymentProvider + ", translations=" + this.translations + ", api=" + this.api + ")";
        }

        public Wait(Payment payment, Legals legals, PaymentProvider paymentProvider, Map<String, LocalisedText> map, Network api) {
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(legals, "legals");
            Intrinsics.checkNotNullParameter(paymentProvider, "paymentProvider");
            Intrinsics.checkNotNullParameter(api, "api");
            this.payment = payment;
            this.legals = legals;
            this.paymentProvider = paymentProvider;
            this.translations = map;
            this.api = api;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final Legals getLegals() {
            return this.legals;
        }

        public final PaymentProvider getPaymentProvider() {
            return this.paymentProvider;
        }

        public final Map<String, LocalisedText> getTranslations() {
            return this.translations;
        }

        public final void setTranslations(Map<String, LocalisedText> map) {
            this.translations = map;
        }

        public final Network getApi() {
            return this.api;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$UserCancelled;", "Lcom/truelayer/payments/ui/screens/Screen;", "failureReason", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;)V", "getFailureReason", "()Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$FailureReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class UserCancelled implements Screen {
        public static final int $stable = 0;
        private final ProcessorResult.FailureReason failureReason;

        public static /* synthetic */ UserCancelled copy$default(UserCancelled userCancelled, ProcessorResult.FailureReason failureReason, int i, Object obj) {
            if ((i & 1) != 0) {
                failureReason = userCancelled.failureReason;
            }
            return userCancelled.copy(failureReason);
        }

        /* renamed from: component1, reason: from getter */
        public final ProcessorResult.FailureReason getFailureReason() {
            return this.failureReason;
        }

        public final UserCancelled copy(ProcessorResult.FailureReason failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            return new UserCancelled(failureReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserCancelled) && this.failureReason == ((UserCancelled) other).failureReason;
        }

        public int hashCode() {
            return this.failureReason.hashCode();
        }

        public String toString() {
            return "UserCancelled(failureReason=" + this.failureReason + ")";
        }

        public UserCancelled(ProcessorResult.FailureReason failureReason) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            this.failureReason = failureReason;
        }

        public final ProcessorResult.FailureReason getFailureReason() {
            return this.failureReason;
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/Screen$Result;", "Lcom/truelayer/payments/ui/screens/Screen;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "paymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentContext", "()Lcom/truelayer/payments/ui/models/PaymentContext;", "getPaymentProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Result implements Screen {
        public static final int $stable = 8;
        private final MerchantConfig merchantConfig;
        private final Payment payment;
        private final PaymentContext paymentContext;
        private final PaymentProvider paymentProvider;

        public static /* synthetic */ Result copy$default(Result result, PaymentContext paymentContext, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentContext = result.paymentContext;
            }
            if ((i & 2) != 0) {
                payment = result.payment;
            }
            if ((i & 4) != 0) {
                merchantConfig = result.merchantConfig;
            }
            if ((i & 8) != 0) {
                paymentProvider = result.paymentProvider;
            }
            return result.copy(paymentContext, payment, merchantConfig, paymentProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentContext getPaymentContext() {
            return this.paymentContext;
        }

        /* renamed from: component2, reason: from getter */
        public final Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component3, reason: from getter */
        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentProvider getPaymentProvider() {
            return this.paymentProvider;
        }

        public final Result copy(PaymentContext paymentContext, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider) {
            Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            return new Result(paymentContext, payment, merchantConfig, paymentProvider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.paymentContext, result.paymentContext) && Intrinsics.areEqual(this.payment, result.payment) && Intrinsics.areEqual(this.merchantConfig, result.merchantConfig) && Intrinsics.areEqual(this.paymentProvider, result.paymentProvider);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentContext.hashCode() * 31) + this.payment.hashCode()) * 31) + this.merchantConfig.hashCode()) * 31;
            PaymentProvider paymentProvider = this.paymentProvider;
            return iHashCode + (paymentProvider == null ? 0 : paymentProvider.hashCode());
        }

        public String toString() {
            return "Result(paymentContext=" + this.paymentContext + ", payment=" + this.payment + ", merchantConfig=" + this.merchantConfig + ", paymentProvider=" + this.paymentProvider + ")";
        }

        public Result(PaymentContext paymentContext, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider) {
            Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
            Intrinsics.checkNotNullParameter(payment, "payment");
            Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
            this.paymentContext = paymentContext;
            this.payment = payment;
            this.merchantConfig = merchantConfig;
            this.paymentProvider = paymentProvider;
        }

        public final PaymentContext getPaymentContext() {
            return this.paymentContext;
        }

        public final Payment getPayment() {
            return this.payment;
        }

        public final MerchantConfig getMerchantConfig() {
            return this.merchantConfig;
        }

        public final PaymentProvider getPaymentProvider() {
            return this.paymentProvider;
        }
    }
}
