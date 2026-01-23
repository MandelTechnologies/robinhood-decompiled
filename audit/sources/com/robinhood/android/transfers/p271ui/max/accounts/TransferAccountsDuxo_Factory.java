package com.robinhood.android.transfers.p271ui.max.accounts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "debitCardUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountBannerStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TransferAccountsDuxo_Factory implements Factory<TransferAccountsDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<DebitCardInstrumentUserStatusStore> debitCardUserStatusStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MatchaTreatmentStore> matchaTreatmentStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RetirementMatchStore> retirementMatchStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransferAccountBannerStore> transferAccountBannerStore;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransferWireAccountStore> transferWireAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TransferAccountsDuxo_Factory create(Provider<AchRelationshipStore> provider, Provider<DebitCardInstrumentUserStatusStore> provider2, Provider<EventLogger> provider3, Provider<ExperimentsStore> provider4, Provider<TransferAccountStore> provider5, Provider<TransferAccountBannerStore> provider6, Provider<TransferWireAccountStore> provider7, Provider<TransfersBonfireApi> provider8, Provider<MatchaTreatmentStore> provider9, Provider<RetirementMatchStore> provider10, Provider<RegionGateProvider> provider11, Provider<DuxoBundle> provider12, Provider<SavedStateHandle> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final TransferAccountsDuxo newInstance(AchRelationshipStore achRelationshipStore, DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore, EventLogger eventLogger, ExperimentsStore experimentsStore, TransferAccountStore transferAccountStore, TransferAccountBannerStore transferAccountBannerStore, TransferWireAccountStore transferWireAccountStore, TransfersBonfireApi transfersBonfireApi, MatchaTreatmentStore matchaTreatmentStore, RetirementMatchStore retirementMatchStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(achRelationshipStore, debitCardInstrumentUserStatusStore, eventLogger, experimentsStore, transferAccountStore, transferAccountBannerStore, transferWireAccountStore, transfersBonfireApi, matchaTreatmentStore, retirementMatchStore, regionGateProvider, duxoBundle, savedStateHandle);
    }

    public TransferAccountsDuxo_Factory(Provider<AchRelationshipStore> achRelationshipStore, Provider<DebitCardInstrumentUserStatusStore> debitCardUserStatusStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<TransferAccountStore> transferAccountStore, Provider<TransferAccountBannerStore> transferAccountBannerStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(debitCardUserStatusStore, "debitCardUserStatusStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountBannerStore, "transferAccountBannerStore");
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.debitCardUserStatusStore = debitCardUserStatusStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.transferAccountStore = transferAccountStore;
        this.transferAccountBannerStore = transferAccountBannerStore;
        this.transferWireAccountStore = transferWireAccountStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.retirementMatchStore = retirementMatchStore;
        this.regionGateProvider = regionGateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public TransferAccountsDuxo get() {
        Companion companion = INSTANCE;
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        DebitCardInstrumentUserStatusStore debitCardInstrumentUserStatusStore = this.debitCardUserStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(debitCardInstrumentUserStatusStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferAccountBannerStore transferAccountBannerStore = this.transferAccountBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountBannerStore, "get(...)");
        TransferWireAccountStore transferWireAccountStore = this.transferWireAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferWireAccountStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        MatchaTreatmentStore matchaTreatmentStore = this.matchaTreatmentStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTreatmentStore, "get(...)");
        RetirementMatchStore retirementMatchStore = this.retirementMatchStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementMatchStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(achRelationshipStore, debitCardInstrumentUserStatusStore, eventLogger, experimentsStore, transferAccountStore, transferAccountBannerStore, transferWireAccountStore, transfersBonfireApi, matchaTreatmentStore, retirementMatchStore, regionGateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: TransferAccountsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jp\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo_Factory;", "achRelationshipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "debitCardUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountBannerStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferAccountsDuxo_Factory create(Provider<AchRelationshipStore> achRelationshipStore, Provider<DebitCardInstrumentUserStatusStore> debitCardUserStatusStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<TransferAccountStore> transferAccountStore, Provider<TransferAccountBannerStore> transferAccountBannerStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<RetirementMatchStore> retirementMatchStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(debitCardUserStatusStore, "debitCardUserStatusStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferAccountBannerStore, "transferAccountBannerStore");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new TransferAccountsDuxo_Factory(achRelationshipStore, debitCardUserStatusStore, eventLogger, experimentsStore, transferAccountStore, transferAccountBannerStore, transferWireAccountStore, transfersBonfireApi, matchaTreatmentStore, retirementMatchStore, regionGateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final TransferAccountsDuxo newInstance(AchRelationshipStore achRelationshipStore, DebitCardInstrumentUserStatusStore debitCardUserStatusStore, EventLogger eventLogger, ExperimentsStore experimentsStore, TransferAccountStore transferAccountStore, TransferAccountBannerStore transferAccountBannerStore, TransferWireAccountStore transferWireAccountStore, TransfersBonfireApi transfersBonfireApi, MatchaTreatmentStore matchaTreatmentStore, RetirementMatchStore retirementMatchStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(debitCardUserStatusStore, "debitCardUserStatusStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferAccountBannerStore, "transferAccountBannerStore");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new TransferAccountsDuxo(achRelationshipStore, debitCardUserStatusStore, eventLogger, experimentsStore, transferAccountStore, transferAccountBannerStore, transferWireAccountStore, transfersBonfireApi, matchaTreatmentStore, retirementMatchStore, regionGateProvider, duxoBundle, savedStateHandle);
        }
    }
}
