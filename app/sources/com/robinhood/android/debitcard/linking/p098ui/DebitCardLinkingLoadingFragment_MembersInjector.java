package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.store.stripe.StripeStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingLoadingFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "bonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DebitCardLinkingLoadingFragment_MembersInjector implements MembersInjector<DebitCardLinkingLoadingFragment> {
    private final Provider<PaymentInstrumentBonfireApi> bonfireApi;
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<StringToLongMapPreference> paymentMethodLastUsagesPref;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<StripeStore> stripeStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<DebitCardLinkingLoadingFragment> create(Provider<BaseFragmentSingletons> provider, Provider<PaymentInstrumentBonfireApi> provider2, Provider<DebitCardInstrumentStore> provider3, Provider<EventLogger> provider4, Provider<StripeStore> provider5, Provider<StringToLongMapPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectBonfireApi(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
        INSTANCE.injectBonfireApi(debitCardLinkingLoadingFragment, paymentInstrumentBonfireApi);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentStore(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, DebitCardInstrumentStore debitCardInstrumentStore) {
        INSTANCE.injectDebitCardInstrumentStore(debitCardLinkingLoadingFragment, debitCardInstrumentStore);
    }

    @JvmStatic
    public static final void injectEventLogger(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(debitCardLinkingLoadingFragment, eventLogger);
    }

    @JvmStatic
    @PaymentMethodLastUsagesPref
    public static final void injectPaymentMethodLastUsagesPref(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, StringToLongMapPreference stringToLongMapPreference) {
        INSTANCE.injectPaymentMethodLastUsagesPref(debitCardLinkingLoadingFragment, stringToLongMapPreference);
    }

    @JvmStatic
    public static final void injectStripeStore(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, StripeStore stripeStore) {
        INSTANCE.injectStripeStore(debitCardLinkingLoadingFragment, stripeStore);
    }

    public DebitCardLinkingLoadingFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<PaymentInstrumentBonfireApi> bonfireApi, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<EventLogger> eventLogger, Provider<StripeStore> stripeStore, Provider<StringToLongMapPreference> paymentMethodLastUsagesPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        this.singletons = singletons;
        this.bonfireApi = bonfireApi;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.eventLogger = eventLogger;
        this.stripeStore = stripeStore;
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DebitCardLinkingLoadingFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        companion2.injectBonfireApi(instance, paymentInstrumentBonfireApi);
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        companion2.injectDebitCardInstrumentStore(instance, debitCardInstrumentStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        StripeStore stripeStore = this.stripeStore.get();
        Intrinsics.checkNotNullExpressionValue(stripeStore, "get(...)");
        companion2.injectStripeStore(instance, stripeStore);
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        companion2.injectPaymentMethodLastUsagesPref(instance, stringToLongMapPreference);
    }

    /* compiled from: DebitCardLinkingLoadingFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "bonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "injectBonfireApi", "", "instance", "injectDebitCardInstrumentStore", "injectEventLogger", "injectStripeStore", "injectPaymentMethodLastUsagesPref", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DebitCardLinkingLoadingFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<PaymentInstrumentBonfireApi> bonfireApi, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<EventLogger> eventLogger, Provider<StripeStore> stripeStore, Provider<StringToLongMapPreference> paymentMethodLastUsagesPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            return new DebitCardLinkingLoadingFragment_MembersInjector(singletons, bonfireApi, debitCardInstrumentStore, eventLogger, stripeStore, paymentMethodLastUsagesPref);
        }

        @JvmStatic
        public final void injectBonfireApi(DebitCardLinkingLoadingFragment instance, PaymentInstrumentBonfireApi bonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            instance.setBonfireApi(bonfireApi);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentStore(DebitCardLinkingLoadingFragment instance, DebitCardInstrumentStore debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            instance.setDebitCardInstrumentStore(debitCardInstrumentStore);
        }

        @JvmStatic
        public final void injectEventLogger(DebitCardLinkingLoadingFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectStripeStore(DebitCardLinkingLoadingFragment instance, StripeStore stripeStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            instance.setStripeStore(stripeStore);
        }

        @JvmStatic
        @PaymentMethodLastUsagesPref
        public final void injectPaymentMethodLastUsagesPref(DebitCardLinkingLoadingFragment instance, StringToLongMapPreference paymentMethodLastUsagesPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
            instance.setPaymentMethodLastUsagesPref(paymentMethodLastUsagesPref);
        }
    }
}
