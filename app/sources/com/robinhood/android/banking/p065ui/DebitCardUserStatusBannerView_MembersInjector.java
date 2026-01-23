package com.robinhood.android.banking.p065ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardUserStatusBannerView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "debitCardInstrumentUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DebitCardUserStatusBannerView_MembersInjector implements MembersInjector<DebitCardUserStatusBannerView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<DebitCardInstrumentUserStatusStore> debitCardInstrumentUserStatusStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final MembersInjector<DebitCardUserStatusBannerView> create(Provider<EventLogger> provider, Provider<ExperimentsStore> provider2, Provider<DebitCardInstrumentStore> provider3, Provider<DebitCardInstrumentUserStatusStore> provider4, Provider<Navigator> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentStore(DebitCardUserStatusBannerView debitCardUserStatusBannerView, DebitCardInstrumentStore debitCardInstrumentStore) {
        INSTANCE.injectDebitCardInstrumentStore(debitCardUserStatusBannerView, debitCardInstrumentStore);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentUserStatusStore(DebitCardUserStatusBannerView debitCardUserStatusBannerView, DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore) {
        INSTANCE.injectDebitCardInstrumentUserStatusStore(debitCardUserStatusBannerView, debitCardInstrumentUserStatusStore);
    }

    @JvmStatic
    public static final void injectEventLogger(DebitCardUserStatusBannerView debitCardUserStatusBannerView, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(debitCardUserStatusBannerView, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(DebitCardUserStatusBannerView debitCardUserStatusBannerView, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(debitCardUserStatusBannerView, experimentsStore);
    }

    @JvmStatic
    public static final void injectNavigator(DebitCardUserStatusBannerView debitCardUserStatusBannerView, Navigator navigator) {
        INSTANCE.injectNavigator(debitCardUserStatusBannerView, navigator);
    }

    public DebitCardUserStatusBannerView_MembersInjector(Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<DebitCardInstrumentUserStatusStore> debitCardInstrumentUserStatusStore, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(debitCardInstrumentUserStatusStore, "debitCardInstrumentUserStatusStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.debitCardInstrumentUserStatusStore = debitCardInstrumentUserStatusStore;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DebitCardUserStatusBannerView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion.injectExperimentsStore(instance, experimentsStore);
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        companion.injectDebitCardInstrumentStore(instance, debitCardInstrumentStore);
        DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore = this.debitCardInstrumentUserStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentUserStatusStore, "get(...)");
        companion.injectDebitCardInstrumentUserStatusStore(instance, debitCardInstrumentUserStatusStore);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: DebitCardUserStatusBannerView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "debitCardInstrumentUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectEventLogger", "", "instance", "injectExperimentsStore", "injectDebitCardInstrumentStore", "injectDebitCardInstrumentUserStatusStore", "injectNavigator", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<DebitCardUserStatusBannerView> create(Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<DebitCardInstrumentUserStatusStore> debitCardInstrumentUserStatusStore, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(debitCardInstrumentUserStatusStore, "debitCardInstrumentUserStatusStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new DebitCardUserStatusBannerView_MembersInjector(eventLogger, experimentsStore, debitCardInstrumentStore, debitCardInstrumentUserStatusStore, navigator);
        }

        @JvmStatic
        public final void injectEventLogger(DebitCardUserStatusBannerView instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectExperimentsStore(DebitCardUserStatusBannerView instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentStore(DebitCardUserStatusBannerView instance, DebitCardInstrumentStore debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            instance.setDebitCardInstrumentStore(debitCardInstrumentStore);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentUserStatusStore(DebitCardUserStatusBannerView instance, DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentUserStatusStore, "debitCardInstrumentUserStatusStore");
            instance.setDebitCardInstrumentUserStatusStore(debitCardInstrumentUserStatusStore);
        }

        @JvmStatic
        public final void injectNavigator(DebitCardUserStatusBannerView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
