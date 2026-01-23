package com.robinhood.android.transfers;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkingOptionsActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/LinkingOptionsActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/LinkingOptionsActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LinkingOptionsActivity_MembersInjector implements MembersInjector<LinkingOptionsActivity> {
    private final Provider<DebitCardInstrumentStore> debitCardInstrumentStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<LinkingOptionsActivity> create(Provider<BaseActivitySingletons> provider, Provider<TransfersBonfireApi> provider2, Provider<DebitCardInstrumentStore> provider3, Provider<EventLogger> provider4, Provider<ExperimentsStore> provider5, Provider<RxFactory> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectDebitCardInstrumentStore(LinkingOptionsActivity linkingOptionsActivity, DebitCardInstrumentStore debitCardInstrumentStore) {
        INSTANCE.injectDebitCardInstrumentStore(linkingOptionsActivity, debitCardInstrumentStore);
    }

    @JvmStatic
    public static final void injectEventLogger(LinkingOptionsActivity linkingOptionsActivity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(linkingOptionsActivity, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(LinkingOptionsActivity linkingOptionsActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(linkingOptionsActivity, experimentsStore);
    }

    @JvmStatic
    public static final void injectRxFactory(LinkingOptionsActivity linkingOptionsActivity, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(linkingOptionsActivity, rxFactory);
    }

    @JvmStatic
    public static final void injectTransfersBonfireApi(LinkingOptionsActivity linkingOptionsActivity, TransfersBonfireApi transfersBonfireApi) {
        INSTANCE.injectTransfersBonfireApi(linkingOptionsActivity, transfersBonfireApi);
    }

    public LinkingOptionsActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.singletons = singletons;
        this.transfersBonfireApi = transfersBonfireApi;
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.rxFactory = rxFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LinkingOptionsActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        companion2.injectTransfersBonfireApi(instance, transfersBonfireApi);
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentStore, "get(...)");
        companion2.injectDebitCardInstrumentStore(instance, debitCardInstrumentStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(instance, rxFactory);
    }

    /* compiled from: LinkingOptionsActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/LinkingOptionsActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/LinkingOptionsActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "injectTransfersBonfireApi", "", "instance", "injectDebitCardInstrumentStore", "injectEventLogger", "injectExperimentsStore", "injectRxFactory", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LinkingOptionsActivity> create(Provider<BaseActivitySingletons> singletons, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<DebitCardInstrumentStore> debitCardInstrumentStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new LinkingOptionsActivity_MembersInjector(singletons, transfersBonfireApi, debitCardInstrumentStore, eventLogger, experimentsStore, rxFactory);
        }

        @JvmStatic
        public final void injectTransfersBonfireApi(LinkingOptionsActivity instance, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            instance.setTransfersBonfireApi(transfersBonfireApi);
        }

        @JvmStatic
        public final void injectDebitCardInstrumentStore(LinkingOptionsActivity instance, DebitCardInstrumentStore debitCardInstrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
            instance.setDebitCardInstrumentStore(debitCardInstrumentStore);
        }

        @JvmStatic
        public final void injectEventLogger(LinkingOptionsActivity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectExperimentsStore(LinkingOptionsActivity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectRxFactory(LinkingOptionsActivity instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }
    }
}
